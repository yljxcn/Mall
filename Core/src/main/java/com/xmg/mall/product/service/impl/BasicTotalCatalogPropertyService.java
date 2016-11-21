
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalCatalogPropertyMapper;
import com.xmg.mall.product.qo.TotalCatalogPropertyQuery;
import com.xmg.mall.product.service.TotalCatalogPropertyService;
import com.xmg.mall.product.vo.TotalCatalogProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalCatalogPropertyService")
public class BasicTotalCatalogPropertyService
    implements TotalCatalogPropertyService
{

    protected TotalCatalogPropertyMapper totalCatalogPropertyMapper;

    @Autowired
    public BasicTotalCatalogPropertyService setTotalCatalogPropertyMapper(TotalCatalogPropertyMapper totalCatalogPropertyMapper) {
        this.totalCatalogPropertyMapper = totalCatalogPropertyMapper;
        return this;
    }

    public List<TotalCatalogProperty> query(TotalCatalogPropertyQuery qo) {
        return this.totalCatalogPropertyMapper.query(qo);
    }

    public TotalCatalogProperty queryOne(TotalCatalogPropertyQuery qo) {
        qo.setPageSize(1);
        List<TotalCatalogProperty> datas = this.totalCatalogPropertyMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
