
package com.xmg.mall.employee.service.impl;

import com.xmg.mall.employee.service.EmployeeModuleService;
import com.xmg.mall.employee.service.EmployeeService;
import com.xmg.mall.employee.service.TotalEmployeeService;
import org.springframework.stereotype.Service;

@Service("employeeModuleService")
public class BasicEmployeeModuleService
    implements EmployeeModuleService
{

    protected EmployeeService employeeService;
    protected TotalEmployeeService totalEmployeeService;

    public EmployeeService getEmployeeService() {
        return this.employeeService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicEmployeeModuleService setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
        return this;
    }

    public TotalEmployeeService getTotalEmployeeService() {
        return this.totalEmployeeService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicEmployeeModuleService setTotalEmployeeService(TotalEmployeeService totalEmployeeService) {
        this.totalEmployeeService = totalEmployeeService;
        return this;
    }

}
