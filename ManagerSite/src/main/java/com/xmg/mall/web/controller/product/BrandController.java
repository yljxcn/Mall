package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.employee.qo.EmployeeQuery;
import com.xmg.mall.employee.service.EmployeeService;
import com.xmg.mall.employee.vo.ExtendedEmployee;
import com.xmg.mall.product.qo.BrandQuery;
import com.xmg.mall.product.service.BrandService;
import com.xmg.mall.product.vo.ExtendedBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("brandController")
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    protected BrandService brandService;

    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")BrandQuery qo, Model model) {
        Pagination<ExtendedBrand> pagination = brandService.queryBrands(qo);
        model.addAttribute("pagination", pagination);
        return "/product/brand_list";
    }

    @RequestMapping("/page")
    public String page() {
        return "/product/brand";
    }

}
