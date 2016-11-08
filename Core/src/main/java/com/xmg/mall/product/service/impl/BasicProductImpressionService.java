
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductImpression;
import com.xmg.mall.product.mapper.ProductImpressionMapper;
import com.xmg.mall.product.qo.ProductImpressionQuery;
import com.xmg.mall.product.service.ProductImpressionService;
import com.xmg.mall.product.vo.ExtendedProductImpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productImpressionService")
public class BasicProductImpressionService
    implements ProductImpressionService
{

    private ProductImpressionMapper productImpressionMapper;

    @Autowired
    public void setProductImpressionMapper(ProductImpressionMapper productImpressionMapper) {
        this.productImpressionMapper = productImpressionMapper;
    }

    @Override
    public ProductImpression getProductImpression(Long id) {
        return productImpressionMapper.get(id);
    }

    protected void updateProductImpression(ProductImpression productImpression) {
        int affected = productImpressionMapper.update(productImpression);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        productImpression.increaseVersion();
    }

    protected ProductImpression addProductImpression(ProductImpression productImpression) {
        productImpression.setCreatedDate(new Date());
        productImpressionMapper.add(productImpression);
        return productImpression;
    }

    @Override
    public List<ExtendedProductImpression> listProductImpressions(ProductImpressionQuery qo) {
        return productImpressionMapper.query(qo);
    }

    @Override
    public ExtendedProductImpression queryOneProductImpression(ProductImpressionQuery qo) {
        qo.setPageSize(1);
        List<ExtendedProductImpression> datas = productImpressionMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedProductImpression> queryProductImpressions(ProductImpressionQuery qo) {
        int rows = productImpressionMapper.count(qo);
        List<ExtendedProductImpression> datas = ((rows == 0)?new ArrayList<ExtendedProductImpression>():productImpressionMapper.query(qo));
        return new Pagination<ExtendedProductImpression>(rows, datas);
    }

    @Override
    public int countProductImpressions(ProductImpressionQuery qo) {
        return productImpressionMapper.count(qo);
    }

}
