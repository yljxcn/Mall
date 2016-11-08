
package com.xmg.mall.product.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.mapper.CatalogMapper;
import com.xmg.mall.product.qo.CatalogQuery;
import com.xmg.mall.product.service.CatalogService;
import com.xmg.mall.product.vo.ExtendedCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("catalogService")
public class BasicCatalogService
    implements CatalogService
{

    private CatalogMapper catalogMapper;

    @Autowired
    public void setCatalogMapper(CatalogMapper catalogMapper) {
        this.catalogMapper = catalogMapper;
    }

    @Override
    public Catalog getCatalog(Long id) {
        return catalogMapper.get(id);
    }

    protected void updateCatalog(Catalog catalog) {
        int affected = catalogMapper.update(catalog);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        catalog.increaseVersion();
    }

    protected Catalog addCatalog(Catalog catalog) {
        catalog.setCreatedDate(new Date());
        catalogMapper.add(catalog);
        return catalog;
    }

    @Override
    public List<ExtendedCatalog> listCatalogs(CatalogQuery qo) {
        return catalogMapper.query(qo);
    }

    @Override
    public ExtendedCatalog queryOneCatalog(CatalogQuery qo) {
        qo.setPageSize(1);
        List<ExtendedCatalog> datas = catalogMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedCatalog> queryCatalogs(CatalogQuery qo) {
        int rows = catalogMapper.count(qo);
        List<ExtendedCatalog> datas = ((rows == 0)?new ArrayList<ExtendedCatalog>():catalogMapper.query(qo));
        return new Pagination<ExtendedCatalog>(rows, datas);
    }

    @Override
    public int countCatalogs(CatalogQuery qo) {
        return catalogMapper.count(qo);
    }

}
