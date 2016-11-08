
package com.xmg.mall.employee.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.employee.domain.Employee;
import com.xmg.mall.employee.qo.EmployeeQuery;
import com.xmg.mall.employee.vo.ExtendedEmployee;

public interface EmployeeService {


    public Employee getEmployee(Long id);

    public ExtendedEmployee queryOneEmployee(EmployeeQuery qo);

    public List<ExtendedEmployee> listEmployees(EmployeeQuery qo);

    public Pagination<ExtendedEmployee> queryEmployees(EmployeeQuery qo);

    public int countEmployees(EmployeeQuery qo);

}
