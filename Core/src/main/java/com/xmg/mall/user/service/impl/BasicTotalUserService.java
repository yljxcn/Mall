
package com.xmg.mall.user.service.impl;

import java.util.List;
import com.xmg.mall.user.mapper.TotalUserMapper;
import com.xmg.mall.user.qo.TotalUserQuery;
import com.xmg.mall.user.service.TotalUserService;
import com.xmg.mall.user.vo.TotalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalUserService")
public class BasicTotalUserService
    implements TotalUserService
{

    protected TotalUserMapper totalUserMapper;

    @Autowired
    public BasicTotalUserService setTotalUserMapper(TotalUserMapper totalUserMapper) {
        this.totalUserMapper = totalUserMapper;
        return this;
    }

    public List<TotalUser> query(TotalUserQuery qo) {
        return this.totalUserMapper.query(qo);
    }

    public TotalUser queryOne(TotalUserQuery qo) {
        qo.setPageSize(1);
        List<TotalUser> datas = this.totalUserMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
