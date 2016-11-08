
package com.xmg.mall.employee.mapper;

import java.util.List;
import com.xmg.mall.employee.qo.TotalEmployeeQuery;
import com.xmg.mall.employee.vo.TotalEmployee;

public interface TotalEmployeeMapper {


    public List<TotalEmployee> query(TotalEmployeeQuery qo);

}
