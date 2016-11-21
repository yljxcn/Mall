
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalProductImpressionMapper;
import com.xmg.mall.product.qo.TotalProductImpressionQuery;
import com.xmg.mall.product.service.TotalProductImpressionService;
import com.xmg.mall.product.vo.TotalProductImpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalProductImpressionService")
public class BasicTotalProductImpressionService
    implements TotalProductImpressionService
{

    protected TotalProductImpressionMapper totalProductImpressionMapper;

    @Autowired
    public BasicTotalProductImpressionService setTotalProductImpressionMapper(TotalProductImpressionMapper totalProductImpressionMapper) {
        this.totalProductImpressionMapper = totalProductImpressionMapper;
        return this;
    }

    public List<TotalProductImpression> query(TotalProductImpressionQuery qo) {
        return this.totalProductImpressionMapper.query(qo);
    }

    public TotalProductImpression queryOne(TotalProductImpressionQuery qo) {
        qo.setPageSize(1);
        List<TotalProductImpression> datas = this.totalProductImpressionMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
