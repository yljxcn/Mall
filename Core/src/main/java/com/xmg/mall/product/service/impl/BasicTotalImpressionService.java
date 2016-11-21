
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalImpressionMapper;
import com.xmg.mall.product.qo.TotalImpressionQuery;
import com.xmg.mall.product.service.TotalImpressionService;
import com.xmg.mall.product.vo.TotalImpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalImpressionService")
public class BasicTotalImpressionService
    implements TotalImpressionService
{

    protected TotalImpressionMapper totalImpressionMapper;

    @Autowired
    public BasicTotalImpressionService setTotalImpressionMapper(TotalImpressionMapper totalImpressionMapper) {
        this.totalImpressionMapper = totalImpressionMapper;
        return this;
    }

    public List<TotalImpression> query(TotalImpressionQuery qo) {
        return this.totalImpressionMapper.query(qo);
    }

    public TotalImpression queryOne(TotalImpressionQuery qo) {
        qo.setPageSize(1);
        List<TotalImpression> datas = this.totalImpressionMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
