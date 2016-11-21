
package com.xmg.mall.employee.service.impl;

import java.util.List;
import com.xmg.mall.employee.mapper.TotalEmployeeMapper;
import com.xmg.mall.employee.qo.TotalEmployeeQuery;
import com.xmg.mall.employee.service.TotalEmployeeService;
import com.xmg.mall.employee.vo.TotalEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("totalEmployeeService")
public class BasicTotalEmployeeService
    implements TotalEmployeeService
{

    protected TotalEmployeeMapper totalEmployeeMapper;

    @Autowired
    public BasicTotalEmployeeService setTotalEmployeeMapper(TotalEmployeeMapper totalEmployeeMapper) {
        this.totalEmployeeMapper = totalEmployeeMapper;
        return this;
    }

    public List<TotalEmployee> query(TotalEmployeeQuery qo) {
        return this.totalEmployeeMapper.query(qo);
    }

    public TotalEmployee queryOne(TotalEmployeeQuery qo) {
        qo.setPageSize(1);
        List<TotalEmployee> datas = this.totalEmployeeMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

}
