
package com.xmg.mall.system.service.impl;

import java.util.List;
import com.xmg.mall.system.mapper.TotalStreetMapper;
import com.xmg.mall.system.qo.TotalStreetQuery;
import com.xmg.mall.system.service.TotalStreetService;
import com.xmg.mall.system.vo.TotalStreet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalStreetService")
public class BasicTotalStreetService
    implements TotalStreetService
{

    protected TotalStreetMapper totalStreetMapper;

    @Autowired
    public BasicTotalStreetService setTotalStreetMapper(TotalStreetMapper totalStreetMapper) {
        this.totalStreetMapper = totalStreetMapper;
        return this;
    }

    public List<TotalStreet> query(TotalStreetQuery qo) {
        return this.totalStreetMapper.query(qo);
    }

    public TotalStreet queryOne(TotalStreetQuery qo) {
        qo.setPageSize(1);
        List<TotalStreet> datas = this.totalStreetMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
