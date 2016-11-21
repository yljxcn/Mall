
package com.xmg.mall.product.service.impl;

import java.util.List;
import com.xmg.mall.product.mapper.TotalProductFreightMapper;
import com.xmg.mall.product.qo.TotalProductFreightQuery;
import com.xmg.mall.product.service.TotalProductFreightService;
import com.xmg.mall.product.vo.TotalProductFreight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalProductFreightService")
public class BasicTotalProductFreightService
    implements TotalProductFreightService
{

    protected TotalProductFreightMapper totalProductFreightMapper;

    @Autowired
    public BasicTotalProductFreightService setTotalProductFreightMapper(TotalProductFreightMapper totalProductFreightMapper) {
        this.totalProductFreightMapper = totalProductFreightMapper;
        return this;
    }

    public List<TotalProductFreight> query(TotalProductFreightQuery qo) {
        return this.totalProductFreightMapper.query(qo);
    }

    public TotalProductFreight queryOne(TotalProductFreightQuery qo) {
        qo.setPageSize(1);
        List<TotalProductFreight> datas = this.totalProductFreightMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
