package com.xmg.mall.web.controller;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.employee.qo.EmployeeQuery;
import com.xmg.mall.employee.service.EmployeeService;
import com.xmg.mall.employee.vo.ExtendedEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lony on 2016/11/8.
 */
@Controller("indexController")
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        return "index";
    }
}
