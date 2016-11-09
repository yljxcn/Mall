package com.xmg.mall.web.controller;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.employee.qo.EmployeeQuery;
import com.xmg.mall.employee.service.EmployeeService;
import com.xmg.mall.employee.vo.ExtendedEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lony on 2016/11/8.
 */
@Controller("indexController")
public class IndexController {

    @Autowired
    protected EmployeeService employeeService;

    @ResponseBody
    @RequestMapping("/list")
    public Pagination listEmployees(HttpServletRequest request, EmployeeQuery qo) {
        Pagination<ExtendedEmployee> pagination = employeeService.queryEmployees(qo);
        return pagination;
    }

    @ResponseBody
    @RequestMapping("/init")
    public String init() {
        System.out.println("sdfsd");
        return "demo";
    }

}
