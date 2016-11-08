
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductDescription;
import com.xmg.mall.product.mapper.ProductDescriptionMapper;
import com.xmg.mall.product.qo.ProductDescriptionQuery;
import com.xmg.mall.product.service.ProductDescriptionService;
import com.xmg.mall.product.vo.ExtendedProductDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productDescriptionService")
public class BasicProductDescriptionService
    implements ProductDescriptionService
{

    private ProductDescriptionMapper productDescriptionMapper;

    @Autowired
    public void setProductDescriptionMapper(ProductDescriptionMapper productDescriptionMapper) {
        this.productDescriptionMapper = productDescriptionMapper;
    }

    @Override
    public ProductDescription getProductDescription(Long id) {
        return productDescriptionMapper.get(id);
    }

    protected void updateProductDescription(ProductDescription productDescription) {
        int affected = productDescriptionMapper.update(productDescription);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        productDescription.increaseVersion();
    }

    protected ProductDescription addProductDescription(ProductDescription productDescription) {
        productDescription.setCreatedDate(new Date());
        productDescriptionMapper.add(productDescription);
        return productDescription;
    }

    @Override
    public List<ExtendedProductDescription> listProductDescriptions(ProductDescriptionQuery qo) {
        return productDescriptionMapper.query(qo);
    }

    @Override
    public ExtendedProductDescription queryOneProductDescription(ProductDescriptionQuery qo) {
        qo.setPageSize(1);
        List<ExtendedProductDescription> datas = productDescriptionMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedProductDescription> queryProductDescriptions(ProductDescriptionQuery qo) {
        int rows = productDescriptionMapper.count(qo);
        List<ExtendedProductDescription> datas = ((rows == 0)?new ArrayList<ExtendedProductDescription>():productDescriptionMapper.query(qo));
        return new Pagination<ExtendedProductDescription>(rows, datas);
    }

    @Override
    public int countProductDescriptions(ProductDescriptionQuery qo) {
        return productDescriptionMapper.count(qo);
    }

}
