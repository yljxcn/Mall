
package com.xmg.mall.product.service.impl;

import java.util.*;

import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.domain.SkuProperty;
import com.xmg.mall.product.domain.SkuPropertyValue;
import com.xmg.mall.product.mapper.SkuPropertyMapper;
import com.xmg.mall.product.qo.SkuPropertyQuery;
import com.xmg.mall.product.service.CatalogService;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.service.ProductService;
import com.xmg.mall.product.service.SkuPropertyService;
import com.xmg.mall.product.vo.ExtendedSkuProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("skuPropertyService")
public class BasicSkuPropertyService
    implements SkuPropertyService
{

    private SkuPropertyMapper skuPropertyMapper;

    private ProductModuleService productModuleService;

    @Autowired
    public void setProductModuleService(ProductModuleService productModuleService) {
        this.productModuleService = productModuleService;
    }

    @Autowired
    public void setSkuPropertyMapper(SkuPropertyMapper skuPropertyMapper) {
        this.skuPropertyMapper = skuPropertyMapper;
    }

    @Override
    public SkuProperty getSkuProperty(Long id) {
        return skuPropertyMapper.get(id);
    }

    protected void updateSkuProperty(SkuProperty skuProperty) {
        int affected = skuPropertyMapper.update(skuProperty);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        skuProperty.increaseVersion();
    }

    protected SkuProperty addSkuProperty(SkuProperty skuProperty) {
        skuProperty.setCreatedDate(new Date());
        skuPropertyMapper.add(skuProperty);
        return skuProperty;
    }

    @Override
    public List<ExtendedSkuProperty> listSkuPropertys(SkuPropertyQuery qo) {
        return skuPropertyMapper.query(qo);
    }

    @Override
    public ExtendedSkuProperty queryOneSkuProperty(SkuPropertyQuery qo) {
        qo.setPageSize(1);
        List<ExtendedSkuProperty> datas = skuPropertyMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedSkuProperty> querySkuPropertys(SkuPropertyQuery qo) {
        int rows = skuPropertyMapper.count(qo);
        List<ExtendedSkuProperty> datas = ((rows == 0)?new ArrayList<ExtendedSkuProperty>():skuPropertyMapper.query(qo));
        return new Pagination<ExtendedSkuProperty>(rows, datas);
    }

    @Override
    public int countSkuPropertys(SkuPropertyQuery qo) {
        return skuPropertyMapper.count(qo);
    }

    @Override
    public List<Map<String, Object>> generateSkus(Long productId, List<SkuProperty> skuProperties, List<SkuPropertyValue> skuPropertyValues) {

        // 验证 SKU 属性是否存在
        // TODO
        /*
        if(productId == null){
            throw new RuntimeException("产品不能为空");
        }
        if(skuProperties.size() <= 0){
            throw new RuntimeException("未设置SKU属性");
        }

        ProductService productService = productModuleService.getProductService();
        Product product = productService.getProduct(productId);
        if(product == null){
            throw new RuntimeException("产品不存在");
        }

        if(!product.hasShelves()){
            throw new RuntimeException("产品已下架");
        }*/

        ProductService productService = productModuleService.getProductService();
        Product product = productService.getProduct(productId);

        CatalogService catalogService = productModuleService.getCatalogService();
        Catalog thirdCatalog = catalogService.getCatalog(product.getCatalogId());
        Catalog secondCatalog = catalogService.getCatalog(thirdCatalog.getParentCatalogId());
        Catalog firstCatalog = catalogService.getCatalog(secondCatalog.getParentCatalogId());

        // 获取 SKU 前缀
        String skuprefix  = new StringBuilder().append(firstCatalog.getCode())
                .append(getCatalogDigitSequenceString(secondCatalog, 2))
                .append(getCatalogDigitSequenceString(thirdCatalog, 2))
                .append(productId)
                .toString();

        // 统计各个 SKU 属性值
        Map<Long, List<SkuPropertyValue>> valueListPerSkuPropertyMap = getValueListPerSkuPropertyMap(skuProperties, skuPropertyValues);
        List<List<SkuPropertyValue>> dimValue = new ArrayList<>();
        for (SkuProperty skuProperty : skuProperties) {
            dimValue.add(valueListPerSkuPropertyMap.get(skuProperty.getId()));
        }

        List<List<String>> recursiveResult = new ArrayList<List<String>>();
        // 递归实现笛卡尔积
        recursive(dimValue, recursiveResult, 0, new ArrayList<String>());

        List<Map<String, Object>> pageResult = new ArrayList<>();
        for (int i = 0; i < recursiveResult.size(); i++) {
            Map<String, Object> map = new HashMap<>();

            map.put("code", skuprefix + i);
            for (int j = 0; j < recursiveResult.get(i).size(); j++) {
                map.put(skuProperties.get(j).getName(), recursiveResult.get(i).get(j));
            }
            pageResult.add(map);
        }

        return pageResult;
    }

    private Map<Long, List<SkuPropertyValue>> getValueListPerSkuPropertyMap(List<SkuProperty> skuProperties, List<SkuPropertyValue> skuPropertyValues) {
        Map<Long, List<SkuPropertyValue>> valueListPerSkuPropertyMap = new HashMap<>();
        for (int i = 0; i < skuProperties.size(); i++) {
            Long skuPropertyId = skuProperties.get(i).getId();

            if(!valueListPerSkuPropertyMap.containsKey(skuPropertyId)){
                valueListPerSkuPropertyMap.put(skuPropertyId, new ArrayList<>());
            }

            for (int j = 0; j < skuPropertyValues.size(); j++) {
                if(skuPropertyValues.get(j).getSkuPropertyId().equals(skuPropertyId)){
                    valueListPerSkuPropertyMap.get(skuPropertyId).add(skuPropertyValues.get(j));
                }
            }
        }
        return valueListPerSkuPropertyMap;
    }

    private String getCatalogDigitSequenceString(Catalog catalog, int digit){
        String sequence = catalog.getSequence().toString();
        if(sequence.length() >= digit){
            return sequence;
        }else{
            int d = digit - sequence.length();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < d; i++){
                sb.append('0');
            }
            return sb.append(sequence).toString();
        }
    }

    private static void recursive (List<List<SkuPropertyValue>> dimValue, List<List<String>> result, int layer, List<String> curList) {
        if (layer < dimValue.size() - 1) {
            if (dimValue.get(layer).size() == 0) {
                recursive(dimValue, result, layer + 1, curList);
            } else {
                for (int i = 0; i < dimValue.get(layer).size(); i++) {
                    List<String> list = new ArrayList<>(curList);
                    list.add(dimValue.get(layer).get(i).getValue());
                    recursive(dimValue, result, layer + 1, list);
                }
            }
        } else if (layer == dimValue.size() - 1) {
            if (dimValue.get(layer).size() == 0) {
                result.add(curList);
            } else {
                for (int i = 0; i < dimValue.get(layer).size(); i++) {
                    List<String> list = new ArrayList<>(curList);
                    list.add(dimValue.get(layer).get(i).getValue());
                    result.add(list);
                }
            }
        }
    }

}
