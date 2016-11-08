
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.CatalogPropertyValue;
import com.xmg.mall.product.mapper.CatalogPropertyValueMapper;
import com.xmg.mall.product.qo.CatalogPropertyValueQuery;
import com.xmg.mall.product.service.CatalogPropertyValueService;
import com.xmg.mall.product.vo.ExtendedCatalogPropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("catalogPropertyValueService")
public class BasicCatalogPropertyValueService
    implements CatalogPropertyValueService
{

    private CatalogPropertyValueMapper catalogPropertyValueMapper;

    @Autowired
    public void setCatalogPropertyValueMapper(CatalogPropertyValueMapper catalogPropertyValueMapper) {
        this.catalogPropertyValueMapper = catalogPropertyValueMapper;
    }

    @Override
    public CatalogPropertyValue getCatalogPropertyValue(Long id) {
        return catalogPropertyValueMapper.get(id);
    }

    protected void updateCatalogPropertyValue(CatalogPropertyValue catalogPropertyValue) {
        int affected = catalogPropertyValueMapper.update(catalogPropertyValue);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        catalogPropertyValue.increaseVersion();
    }

    protected CatalogPropertyValue addCatalogPropertyValue(CatalogPropertyValue catalogPropertyValue) {
        catalogPropertyValue.setCreatedDate(new Date());
        catalogPropertyValueMapper.add(catalogPropertyValue);
        return catalogPropertyValue;
    }

    @Override
    public List<ExtendedCatalogPropertyValue> listCatalogPropertyValues(CatalogPropertyValueQuery qo) {
        return catalogPropertyValueMapper.query(qo);
    }

    @Override
    public ExtendedCatalogPropertyValue queryOneCatalogPropertyValue(CatalogPropertyValueQuery qo) {
        qo.setPageSize(1);
        List<ExtendedCatalogPropertyValue> datas = catalogPropertyValueMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedCatalogPropertyValue> queryCatalogPropertyValues(CatalogPropertyValueQuery qo) {
        int rows = catalogPropertyValueMapper.count(qo);
        List<ExtendedCatalogPropertyValue> datas = ((rows == 0)?new ArrayList<ExtendedCatalogPropertyValue>():catalogPropertyValueMapper.query(qo));
        return new Pagination<ExtendedCatalogPropertyValue>(rows, datas);
    }

    @Override
    public int countCatalogPropertyValues(CatalogPropertyValueQuery qo) {
        return catalogPropertyValueMapper.count(qo);
    }

}
