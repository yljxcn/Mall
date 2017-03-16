
package com.xmg.mall.system.service.impl;

import java.util.List;
import com.xmg.mall.system.mapper.TotalCityMapper;
import com.xmg.mall.system.qo.TotalCityQuery;
import com.xmg.mall.system.service.TotalCityService;
import com.xmg.mall.system.vo.TotalCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalCityService")
public class BasicTotalCityService
    implements TotalCityService
{

    protected TotalCityMapper totalCityMapper;

    @Autowired
    public BasicTotalCityService setTotalCityMapper(TotalCityMapper totalCityMapper) {
        this.totalCityMapper = totalCityMapper;
        return this;
    }

    public List<TotalCity> query(TotalCityQuery qo) {
        return this.totalCityMapper.query(qo);
    }

    public TotalCity queryOne(TotalCityQuery qo) {
        qo.setPageSize(1);
        List<TotalCity> datas = this.totalCityMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
