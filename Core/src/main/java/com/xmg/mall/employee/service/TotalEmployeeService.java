
package com.xmg.mall.employee.service;

import java.util.List;
import com.xmg.mall.employee.qo.TotalEmployeeQuery;
import com.xmg.mall.employee.vo.TotalEmployee;

public interface TotalEmployeeService {


    public List<TotalEmployee> query(TotalEmployeeQuery qo);

    public TotalEmployee queryOne(TotalEmployeeQuery qo);

}
