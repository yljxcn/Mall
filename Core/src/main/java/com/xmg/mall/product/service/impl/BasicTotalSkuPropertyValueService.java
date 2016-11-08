
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalSkuPropertyValueMapper;
import com.xmg.mall.product.qo.TotalSkuPropertyValueQuery;
import com.xmg.mall.product.service.TotalSkuPropertyValueService;
import com.xmg.mall.product.vo.TotalSkuPropertyValue;

public class BasicTotalSkuPropertyValueService
    implements TotalSkuPropertyValueService
{

    protected TotalSkuPropertyValueMapper totalSkuPropertyValueMapper;

    public BasicTotalSkuPropertyValueService setTotalSkuPropertyValueMapper(TotalSkuPropertyValueMapper totalSkuPropertyValueMapper) {
        this.totalSkuPropertyValueMapper = totalSkuPropertyValueMapper;
        return this;
    }

    public List<TotalSkuPropertyValue> query(TotalSkuPropertyValueQuery qo) {
        return this.totalSkuPropertyValueMapper.query(qo);
    }

    public TotalSkuPropertyValue queryOne(TotalSkuPropertyValueQuery qo) {
        qo.setPageSize(1);
        List<TotalSkuPropertyValue> datas = this.totalSkuPropertyValueMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
