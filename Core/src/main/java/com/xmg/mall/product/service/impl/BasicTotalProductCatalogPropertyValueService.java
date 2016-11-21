
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalProductCatalogPropertyValueMapper;
import com.xmg.mall.product.qo.TotalProductCatalogPropertyValueQuery;
import com.xmg.mall.product.service.TotalProductCatalogPropertyValueService;
import com.xmg.mall.product.vo.TotalProductCatalogPropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalProductCatalogPropertyValueService")
public class BasicTotalProductCatalogPropertyValueService
    implements TotalProductCatalogPropertyValueService
{

    protected TotalProductCatalogPropertyValueMapper totalProductCatalogPropertyValueMapper;

    @Autowired
    public BasicTotalProductCatalogPropertyValueService setTotalProductCatalogPropertyValueMapper(TotalProductCatalogPropertyValueMapper totalProductCatalogPropertyValueMapper) {
        this.totalProductCatalogPropertyValueMapper = totalProductCatalogPropertyValueMapper;
        return this;
    }

    public List<TotalProductCatalogPropertyValue> query(TotalProductCatalogPropertyValueQuery qo) {
        return this.totalProductCatalogPropertyValueMapper.query(qo);
    }

    public TotalProductCatalogPropertyValue queryOne(TotalProductCatalogPropertyValueQuery qo) {
        qo.setPageSize(1);
        List<TotalProductCatalogPropertyValue> datas = this.totalProductCatalogPropertyValueMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
