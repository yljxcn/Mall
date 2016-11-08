
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductImage;
import com.xmg.mall.product.mapper.ProductImageMapper;
import com.xmg.mall.product.qo.ProductImageQuery;
import com.xmg.mall.product.service.ProductImageService;
import com.xmg.mall.product.vo.ExtendedProductImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productImageService")
public class BasicProductImageService
    implements ProductImageService
{

    private ProductImageMapper productImageMapper;

    @Autowired
    public void setProductImageMapper(ProductImageMapper productImageMapper) {
        this.productImageMapper = productImageMapper;
    }

    @Override
    public ProductImage getProductImage(Long id) {
        return productImageMapper.get(id);
    }

    protected void updateProductImage(ProductImage productImage) {
        int affected = productImageMapper.update(productImage);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        productImage.increaseVersion();
    }

    protected ProductImage addProductImage(ProductImage productImage) {
        productImage.setCreatedDate(new Date());
        productImageMapper.add(productImage);
        return productImage;
    }

    @Override
    public List<ExtendedProductImage> listProductImages(ProductImageQuery qo) {
        return productImageMapper.query(qo);
    }

    @Override
    public ExtendedProductImage queryOneProductImage(ProductImageQuery qo) {
        qo.setPageSize(1);
        List<ExtendedProductImage> datas = productImageMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedProductImage> queryProductImages(ProductImageQuery qo) {
        int rows = productImageMapper.count(qo);
        List<ExtendedProductImage> datas = ((rows == 0)?new ArrayList<ExtendedProductImage>():productImageMapper.query(qo));
        return new Pagination<ExtendedProductImage>(rows, datas);
    }

    @Override
    public int countProductImages(ProductImageQuery qo) {
        return productImageMapper.count(qo);
    }

}
