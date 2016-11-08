
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.SkuPropertyRelationshipValue;
import com.xmg.mall.product.mapper.SkuPropertyRelationshipValueMapper;
import com.xmg.mall.product.qo.SkuPropertyRelationshipValueQuery;
import com.xmg.mall.product.service.SkuPropertyRelationshipValueService;
import com.xmg.mall.product.vo.ExtendedSkuPropertyRelationshipValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("skuPropertyRelationshipValueService")
public class BasicSkuPropertyRelationshipValueService
    implements SkuPropertyRelationshipValueService
{

    private SkuPropertyRelationshipValueMapper skuPropertyRelationshipValueMapper;

    @Autowired
    public void setSkuPropertyRelationshipValueMapper(SkuPropertyRelationshipValueMapper skuPropertyRelationshipValueMapper) {
        this.skuPropertyRelationshipValueMapper = skuPropertyRelationshipValueMapper;
    }

    @Override
    public SkuPropertyRelationshipValue getSkuPropertyRelationshipValue(Long id) {
        return skuPropertyRelationshipValueMapper.get(id);
    }

    protected void updateSkuPropertyRelationshipValue(SkuPropertyRelationshipValue skuPropertyRelationshipValue) {
        int affected = skuPropertyRelationshipValueMapper.update(skuPropertyRelationshipValue);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        skuPropertyRelationshipValue.increaseVersion();
    }

    protected SkuPropertyRelationshipValue addSkuPropertyRelationshipValue(SkuPropertyRelationshipValue skuPropertyRelationshipValue) {
        skuPropertyRelationshipValue.setCreatedDate(new Date());
        skuPropertyRelationshipValueMapper.add(skuPropertyRelationshipValue);
        return skuPropertyRelationshipValue;
    }

    @Override
    public List<ExtendedSkuPropertyRelationshipValue> listSkuPropertyRelationshipValues(SkuPropertyRelationshipValueQuery qo) {
        return skuPropertyRelationshipValueMapper.query(qo);
    }

    @Override
    public ExtendedSkuPropertyRelationshipValue queryOneSkuPropertyRelationshipValue(SkuPropertyRelationshipValueQuery qo) {
        qo.setPageSize(1);
        List<ExtendedSkuPropertyRelationshipValue> datas = skuPropertyRelationshipValueMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedSkuPropertyRelationshipValue> querySkuPropertyRelationshipValues(SkuPropertyRelationshipValueQuery qo) {
        int rows = skuPropertyRelationshipValueMapper.count(qo);
        List<ExtendedSkuPropertyRelationshipValue> datas = ((rows == 0)?new ArrayList<ExtendedSkuPropertyRelationshipValue>():skuPropertyRelationshipValueMapper.query(qo));
        return new Pagination<ExtendedSkuPropertyRelationshipValue>(rows, datas);
    }

    @Override
    public int countSkuPropertyRelationshipValues(SkuPropertyRelationshipValueQuery qo) {
        return skuPropertyRelationshipValueMapper.count(qo);
    }

}
