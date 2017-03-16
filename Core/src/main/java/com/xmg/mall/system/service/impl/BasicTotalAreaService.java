
package com.xmg.mall.system.service.impl;

import java.util.List;
import com.xmg.mall.system.mapper.TotalAreaMapper;
import com.xmg.mall.system.qo.TotalAreaQuery;
import com.xmg.mall.system.service.TotalAreaService;
import com.xmg.mall.system.vo.TotalArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalAreaService")
public class BasicTotalAreaService
    implements TotalAreaService
{

    protected TotalAreaMapper totalAreaMapper;

    @Autowired
    public BasicTotalAreaService setTotalAreaMapper(TotalAreaMapper totalAreaMapper) {
        this.totalAreaMapper = totalAreaMapper;
        return this;
    }

    public List<TotalArea> query(TotalAreaQuery qo) {
        return this.totalAreaMapper.query(qo);
    }

    public TotalArea queryOne(TotalAreaQuery qo) {
        qo.setPageSize(1);
        List<TotalArea> datas = this.totalAreaMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
