
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductFreight;
import com.xmg.mall.product.mapper.ProductFreightMapper;
import com.xmg.mall.product.qo.ProductFreightQuery;
import com.xmg.mall.product.service.ProductFreightService;
import com.xmg.mall.product.vo.ExtendedProductFreight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productFreightService")
public class BasicProductFreightService
    implements ProductFreightService
{

    private ProductFreightMapper productFreightMapper;

    @Autowired
    public void setProductFreightMapper(ProductFreightMapper productFreightMapper) {
        this.productFreightMapper = productFreightMapper;
    }

    @Override
    public ProductFreight getProductFreight(Long id) {
        return productFreightMapper.get(id);
    }

    protected void updateProductFreight(ProductFreight productFreight) {
        int affected = productFreightMapper.update(productFreight);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        productFreight.increaseVersion();
    }

    protected ProductFreight addProductFreight(ProductFreight productFreight) {
        productFreight.setCreatedDate(new Date());
        productFreightMapper.add(productFreight);
        return productFreight;
    }

    @Override
    public List<ExtendedProductFreight> listProductFreights(ProductFreightQuery qo) {
        return productFreightMapper.query(qo);
    }

    @Override
    public ExtendedProductFreight queryOneProductFreight(ProductFreightQuery qo) {
        qo.setPageSize(1);
        List<ExtendedProductFreight> datas = productFreightMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedProductFreight> queryProductFreights(ProductFreightQuery qo) {
        int rows = productFreightMapper.count(qo);
        List<ExtendedProductFreight> datas = ((rows == 0)?new ArrayList<ExtendedProductFreight>():productFreightMapper.query(qo));
        return new Pagination<ExtendedProductFreight>(rows, datas);
    }

    @Override
    public int countProductFreights(ProductFreightQuery qo) {
        return productFreightMapper.count(qo);
    }

}
