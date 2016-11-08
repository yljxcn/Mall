
package com.xmg.mall.employee.mapper;

import java.util.List;
import com.xmg.mall.employee.domain.Employee;
import com.xmg.mall.employee.qo.EmployeeQuery;
import com.xmg.mall.employee.vo.ExtendedEmployee;

public interface EmployeeMapper {


    public Employee get(Long id);

    public int update(Employee employee);

    public int add(Employee employee);

    public int delete(Long id);

    public int count(EmployeeQuery qo);

    public List<ExtendedEmployee> query(EmployeeQuery qo);

}
