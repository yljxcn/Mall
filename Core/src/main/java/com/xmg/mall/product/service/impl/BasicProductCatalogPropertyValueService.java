
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductCatalogPropertyValue;
import com.xmg.mall.product.mapper.ProductCatalogPropertyValueMapper;
import com.xmg.mall.product.qo.ProductCatalogPropertyValueQuery;
import com.xmg.mall.product.service.ProductCatalogPropertyValueService;
import com.xmg.mall.product.vo.ExtendedProductCatalogPropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productCatalogPropertyValueService")
public class BasicProductCatalogPropertyValueService
    implements ProductCatalogPropertyValueService
{

    private ProductCatalogPropertyValueMapper productCatalogPropertyValueMapper;

    @Autowired
    public void setProductCatalogPropertyValueMapper(ProductCatalogPropertyValueMapper productCatalogPropertyValueMapper) {
        this.productCatalogPropertyValueMapper = productCatalogPropertyValueMapper;
    }

    @Override
    public ProductCatalogPropertyValue getProductCatalogPropertyValue(Long id) {
        return productCatalogPropertyValueMapper.get(id);
    }

    protected void updateProductCatalogPropertyValue(ProductCatalogPropertyValue productCatalogPropertyValue) {
        int affected = productCatalogPropertyValueMapper.update(productCatalogPropertyValue);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        productCatalogPropertyValue.increaseVersion();
    }

    protected ProductCatalogPropertyValue addProductCatalogPropertyValue(ProductCatalogPropertyValue productCatalogPropertyValue) {
        productCatalogPropertyValue.setCreatedDate(new Date());
        productCatalogPropertyValueMapper.add(productCatalogPropertyValue);
        return productCatalogPropertyValue;
    }

    @Override
    public List<ExtendedProductCatalogPropertyValue> listProductCatalogPropertyValues(ProductCatalogPropertyValueQuery qo) {
        return productCatalogPropertyValueMapper.query(qo);
    }

    @Override
    public ExtendedProductCatalogPropertyValue queryOneProductCatalogPropertyValue(ProductCatalogPropertyValueQuery qo) {
        qo.setPageSize(1);
        List<ExtendedProductCatalogPropertyValue> datas = productCatalogPropertyValueMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedProductCatalogPropertyValue> queryProductCatalogPropertyValues(ProductCatalogPropertyValueQuery qo) {
        int rows = productCatalogPropertyValueMapper.count(qo);
        List<ExtendedProductCatalogPropertyValue> datas = ((rows == 0)?new ArrayList<ExtendedProductCatalogPropertyValue>():productCatalogPropertyValueMapper.query(qo));
        return new Pagination<ExtendedProductCatalogPropertyValue>(rows, datas);
    }

    @Override
    public int countProductCatalogPropertyValues(ProductCatalogPropertyValueQuery qo) {
        return productCatalogPropertyValueMapper.count(qo);
    }

}
