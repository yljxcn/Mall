
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalCatalogMapper;
import com.xmg.mall.product.qo.TotalCatalogQuery;
import com.xmg.mall.product.service.TotalCatalogService;
import com.xmg.mall.product.vo.TotalCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalCatalogService")
public class BasicTotalCatalogService
    implements TotalCatalogService
{

    protected TotalCatalogMapper totalCatalogMapper;

    @Autowired
    public BasicTotalCatalogService setTotalCatalogMapper(TotalCatalogMapper totalCatalogMapper) {
        this.totalCatalogMapper = totalCatalogMapper;
        return this;
    }

    public List<TotalCatalog> query(TotalCatalogQuery qo) {
        return this.totalCatalogMapper.query(qo);
    }

    public TotalCatalog queryOne(TotalCatalogQuery qo) {
        qo.setPageSize(1);
        List<TotalCatalog> datas = this.totalCatalogMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
