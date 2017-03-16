
package com.xmg.mall.system.service.impl;

import java.util.List;
import com.xmg.mall.system.mapper.TotalProvinceMapper;
import com.xmg.mall.system.qo.TotalProvinceQuery;
import com.xmg.mall.system.service.TotalProvinceService;
import com.xmg.mall.system.vo.TotalProvince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalProvinceService")
public class BasicTotalProvinceService
    implements TotalProvinceService
{

    protected TotalProvinceMapper totalProvinceMapper;

    @Autowired
    public BasicTotalProvinceService setTotalProvinceMapper(TotalProvinceMapper totalProvinceMapper) {
        this.totalProvinceMapper = totalProvinceMapper;
        return this;
    }

    public List<TotalProvince> query(TotalProvinceQuery qo) {
        return this.totalProvinceMapper.query(qo);
    }

    public TotalProvince queryOne(TotalProvinceQuery qo) {
        qo.setPageSize(1);
        List<TotalProvince> datas = this.totalProvinceMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
