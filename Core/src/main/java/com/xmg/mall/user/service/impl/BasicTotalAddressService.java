
package com.xmg.mall.user.service.impl;

import java.util.List;
import com.xmg.mall.user.mapper.TotalAddressMapper;
import com.xmg.mall.user.qo.TotalAddressQuery;
import com.xmg.mall.user.service.TotalAddressService;
import com.xmg.mall.user.vo.TotalAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalAddressService")
public class BasicTotalAddressService
    implements TotalAddressService
{

    protected TotalAddressMapper totalAddressMapper;

    @Autowired
    public BasicTotalAddressService setTotalAddressMapper(TotalAddressMapper totalAddressMapper) {
        this.totalAddressMapper = totalAddressMapper;
        return this;
    }

    public List<TotalAddress> query(TotalAddressQuery qo) {
        return this.totalAddressMapper.query(qo);
    }

    public TotalAddress queryOne(TotalAddressQuery qo) {
        qo.setPageSize(1);
        List<TotalAddress> datas = this.totalAddressMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
