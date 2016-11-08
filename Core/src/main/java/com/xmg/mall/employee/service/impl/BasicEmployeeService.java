
package com.xmg.mall.employee.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.employee.domain.Employee;
import com.xmg.mall.employee.mapper.EmployeeMapper;
import com.xmg.mall.employee.qo.EmployeeQuery;
import com.xmg.mall.employee.service.EmployeeService;
import com.xmg.mall.employee.vo.ExtendedEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class BasicEmployeeService
    implements EmployeeService
{

    private EmployeeMapper employeeMapper;

    @Autowired
    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeMapper.get(id);
    }

    protected void updateEmployee(Employee employee) {
        int affected = employeeMapper.update(employee);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        employee.increaseVersion();
    }

    protected Employee addEmployee(Employee employee) {
        employee.setCreatedDate(new Date());
        employeeMapper.add(employee);
        return employee;
    }

    @Override
    public List<ExtendedEmployee> listEmployees(EmployeeQuery qo) {
        return employeeMapper.query(qo);
    }

    @Override
    public ExtendedEmployee queryOneEmployee(EmployeeQuery qo) {
        qo.setPageSize(1);
        List<ExtendedEmployee> datas = employeeMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedEmployee> queryEmployees(EmployeeQuery qo) {
        int rows = employeeMapper.count(qo);
        List<ExtendedEmployee> datas = ((rows == 0)?new ArrayList<ExtendedEmployee>():employeeMapper.query(qo));
        return new Pagination<ExtendedEmployee>(rows, datas);
    }

    @Override
    public int countEmployees(EmployeeQuery qo) {
        return employeeMapper.count(qo);
    }

}
