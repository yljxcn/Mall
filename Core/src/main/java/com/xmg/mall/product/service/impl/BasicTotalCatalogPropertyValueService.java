
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalCatalogPropertyValueMapper;
import com.xmg.mall.product.qo.TotalCatalogPropertyValueQuery;
import com.xmg.mall.product.service.TotalCatalogPropertyValueService;
import com.xmg.mall.product.vo.TotalCatalogPropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalCatalogPropertyValueService")
public class BasicTotalCatalogPropertyValueService
    implements TotalCatalogPropertyValueService
{

    protected TotalCatalogPropertyValueMapper totalCatalogPropertyValueMapper;

    @Autowired
    public BasicTotalCatalogPropertyValueService setTotalCatalogPropertyValueMapper(TotalCatalogPropertyValueMapper totalCatalogPropertyValueMapper) {
        this.totalCatalogPropertyValueMapper = totalCatalogPropertyValueMapper;
        return this;
    }

    public List<TotalCatalogPropertyValue> query(TotalCatalogPropertyValueQuery qo) {
        return this.totalCatalogPropertyValueMapper.query(qo);
    }

    public TotalCatalogPropertyValue queryOne(TotalCatalogPropertyValueQuery qo) {
        qo.setPageSize(1);
        List<TotalCatalogPropertyValue> datas = this.totalCatalogPropertyValueMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
