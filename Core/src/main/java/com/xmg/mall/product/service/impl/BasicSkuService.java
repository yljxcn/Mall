
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Sku;
import com.xmg.mall.product.mapper.SkuMapper;
import com.xmg.mall.product.qo.SkuQuery;
import com.xmg.mall.product.service.SkuService;
import com.xmg.mall.product.vo.ExtendedSku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("skuService")
public class BasicSkuService
    implements SkuService
{

    private SkuMapper skuMapper;

    @Autowired
    public void setSkuMapper(SkuMapper skuMapper) {
        this.skuMapper = skuMapper;
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

}
