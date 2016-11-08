
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.SkuProperty;
import com.xmg.mall.product.mapper.SkuPropertyMapper;
import com.xmg.mall.product.qo.SkuPropertyQuery;
import com.xmg.mall.product.service.SkuPropertyService;
import com.xmg.mall.product.vo.ExtendedSkuProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("skuPropertyService")
public class BasicSkuPropertyService
    implements SkuPropertyService
{

    private SkuPropertyMapper skuPropertyMapper;

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

}
