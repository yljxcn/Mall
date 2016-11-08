
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.CatalogProperty;
import com.xmg.mall.product.mapper.CatalogPropertyMapper;
import com.xmg.mall.product.qo.CatalogPropertyQuery;
import com.xmg.mall.product.service.CatalogPropertyService;
import com.xmg.mall.product.vo.ExtendedCatalogProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("catalogPropertyService")
public class BasicCatalogPropertyService
    implements CatalogPropertyService
{

    private CatalogPropertyMapper catalogPropertyMapper;

    @Autowired
    public void setCatalogPropertyMapper(CatalogPropertyMapper catalogPropertyMapper) {
        this.catalogPropertyMapper = catalogPropertyMapper;
    }

    @Override
    public CatalogProperty getCatalogProperty(Long id) {
        return catalogPropertyMapper.get(id);
    }

    protected void updateCatalogProperty(CatalogProperty catalogProperty) {
        int affected = catalogPropertyMapper.update(catalogProperty);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        catalogProperty.increaseVersion();
    }

    protected CatalogProperty addCatalogProperty(CatalogProperty catalogProperty) {
        catalogProperty.setCreatedDate(new Date());
        catalogPropertyMapper.add(catalogProperty);
        return catalogProperty;
    }

    @Override
    public List<ExtendedCatalogProperty> listCatalogPropertys(CatalogPropertyQuery qo) {
        return catalogPropertyMapper.query(qo);
    }

    @Override
    public ExtendedCatalogProperty queryOneCatalogProperty(CatalogPropertyQuery qo) {
        qo.setPageSize(1);
        List<ExtendedCatalogProperty> datas = catalogPropertyMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedCatalogProperty> queryCatalogPropertys(CatalogPropertyQuery qo) {
        int rows = catalogPropertyMapper.count(qo);
        List<ExtendedCatalogProperty> datas = ((rows == 0)?new ArrayList<ExtendedCatalogProperty>():catalogPropertyMapper.query(qo));
        return new Pagination<ExtendedCatalogProperty>(rows, datas);
    }

    @Override
    public int countCatalogPropertys(CatalogPropertyQuery qo) {
        return catalogPropertyMapper.count(qo);
    }

}
