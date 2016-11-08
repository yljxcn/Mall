
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.SkuPropertyValue;
import com.xmg.mall.product.mapper.SkuPropertyValueMapper;
import com.xmg.mall.product.qo.SkuPropertyValueQuery;
import com.xmg.mall.product.service.SkuPropertyValueService;
import com.xmg.mall.product.vo.ExtendedSkuPropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("skuPropertyValueService")
public class BasicSkuPropertyValueService
    implements SkuPropertyValueService
{

    private SkuPropertyValueMapper skuPropertyValueMapper;

    @Autowired
    public void setSkuPropertyValueMapper(SkuPropertyValueMapper skuPropertyValueMapper) {
        this.skuPropertyValueMapper = skuPropertyValueMapper;
    }

    @Override
    public SkuPropertyValue getSkuPropertyValue(Long id) {
        return skuPropertyValueMapper.get(id);
    }

    protected void updateSkuPropertyValue(SkuPropertyValue skuPropertyValue) {
        int affected = skuPropertyValueMapper.update(skuPropertyValue);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        skuPropertyValue.increaseVersion();
    }

    protected SkuPropertyValue addSkuPropertyValue(SkuPropertyValue skuPropertyValue) {
        skuPropertyValue.setCreatedDate(new Date());
        skuPropertyValueMapper.add(skuPropertyValue);
        return skuPropertyValue;
    }

    @Override
    public List<ExtendedSkuPropertyValue> listSkuPropertyValues(SkuPropertyValueQuery qo) {
        return skuPropertyValueMapper.query(qo);
    }

    @Override
    public ExtendedSkuPropertyValue queryOneSkuPropertyValue(SkuPropertyValueQuery qo) {
        qo.setPageSize(1);
        List<ExtendedSkuPropertyValue> datas = skuPropertyValueMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedSkuPropertyValue> querySkuPropertyValues(SkuPropertyValueQuery qo) {
        int rows = skuPropertyValueMapper.count(qo);
        List<ExtendedSkuPropertyValue> datas = ((rows == 0)?new ArrayList<ExtendedSkuPropertyValue>():skuPropertyValueMapper.query(qo));
        return new Pagination<ExtendedSkuPropertyValue>(rows, datas);
    }

    @Override
    public int countSkuPropertyValues(SkuPropertyValueQuery qo) {
        return skuPropertyValueMapper.count(qo);
    }

}
