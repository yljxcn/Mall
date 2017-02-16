
package com.xmg.mall.product.service.impl;

import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.upload.FileUploader;
import com.xmg.mall.product.domain.Sku;
import com.xmg.mall.product.domain.SkuPropertyValue;
import com.xmg.mall.product.form.SkuSaveForm;
import com.xmg.mall.product.mapper.SkuMapper;
import com.xmg.mall.product.qo.SkuQuery;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.service.SkuService;
import com.xmg.mall.product.vo.ExtendedSku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("skuService")
public class BasicSkuService
    implements SkuService
{

    private SkuMapper skuMapper;
    private FileUploader fileUploader;
    private ProductModuleService productModuleService;

    @Autowired
    public void setSkuMapper(SkuMapper skuMapper) {
        this.skuMapper = skuMapper;
    }

    @Autowired
    public void setFileUploader(FileUploader fileUploader) {
        this.fileUploader = fileUploader;
    }

    @Autowired
    public void setProductModuleService(ProductModuleService productModuleService) {
        this.productModuleService = productModuleService;
    }

    @Override
    public Sku getSku(Long id) {
        return skuMapper.get(id);
    }

    protected void updateSku(Sku sku) {
        int affected = skuMapper.update(sku);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        sku.increaseVersion();
    }

    protected Sku addSku(Sku sku) {
        sku.setCreatedDate(new Date());
        skuMapper.add(sku);
        return sku;
    }

    @Override
    public List<ExtendedSku> listSkus(SkuQuery qo) {
        return skuMapper.query(qo);
    }

    @Override
    public ExtendedSku queryOneSku(SkuQuery qo) {
        qo.setPageSize(1);
        List<ExtendedSku> datas = skuMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedSku> querySkus(SkuQuery qo) {
        int rows = skuMapper.count(qo);
        List<ExtendedSku> datas = ((rows == 0)?new ArrayList<ExtendedSku>():skuMapper.query(qo));
        return new Pagination<ExtendedSku>(rows, datas);
    }

    @Override
    public int countSkus(SkuQuery qo) {
        return skuMapper.count(qo);
    }

    @Override
    public void update(Sku sku) {
        Sku oldSku = getSku(sku.getId());
        if(oldSku == null)
            throw new IllegalArgumentException("不存在此SKU");

        oldSku.setShelves(sku.hasShelves())
                .setPrice(sku.getPrice());
        updateSku(oldSku);
    }

    @Override
    public void save(Long productId, MultipartFile[] files, Long[] skuPropertyIds, String[] skuPropertyValues, SkuSaveForm skuSaveForm) {
        // 用来暂时存储图片
        List<SkuPropertyValue> skuPropertyValueTempList = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            String image = null;
            MultipartFile file = files[i];
            if(file.getSize() > 0){
                try {
                    image = fileUploader.upload("sku", null, file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(image != null){
                SkuPropertyValue skuPropertyValue = new SkuPropertyValue();
                skuPropertyValue.setSkuPropertyId(skuPropertyIds[i])
                        .setValue(skuPropertyValues[i])
                        .setImage(image);
                skuPropertyValueTempList.add(skuPropertyValue);
            }
        }

        for (SkuSaveForm.SaveSku saveSku : skuSaveForm.getSaveSkus()) {
            if(saveSku.getPrice() != null){
                Sku sku = new Sku();
                sku.setProductId(productId)
                        .setCode(saveSku.getCode())
                        .setPrice(saveSku.getPrice())
                        .setShelves(true);
                sku = addSku(sku);

                List<Long> skuPropertyIdList = saveSku.getSkuPropertyIds();
                List<String> SkuPropertyValueList = saveSku.getSkuPropertyValues();
                for (int i = 0; i < skuPropertyIdList.size(); i++) {
                    SkuPropertyValue skuPropertyValue = new SkuPropertyValue();
                    skuPropertyValue.setSkuId(sku.getId())
                            .setSkuPropertyId(skuPropertyIdList.get(i))
                            .setValue(SkuPropertyValueList.get(i))
                            .setImage(getImagePath(skuPropertyValueTempList, skuPropertyValue));
                    productModuleService.getSkuPropertyValueService().save(skuPropertyValue);

                }
            }
        }
    }

    // 获取图片路径
    private String getImagePath(List<SkuPropertyValue> skuPropertyValueTempList, SkuPropertyValue skuPropertyValue) {
        String imagePath = null;
        for (SkuPropertyValue spv : skuPropertyValueTempList) {
            if(spv.getSkuPropertyId().equals(skuPropertyValue.getSkuPropertyId()) && spv.getValue().equals(skuPropertyValue.getValue())){
                imagePath = spv.getImage();
                break;
            }
        }
        return imagePath;
    }

}
