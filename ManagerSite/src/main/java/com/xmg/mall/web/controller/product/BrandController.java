package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.qo.BrandQuery;
import com.xmg.mall.product.service.BrandService;
import com.xmg.mall.product.vo.ExtendedBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("brandController")
@RequestMapping("/brand")
public class BrandController {

    private BrandService brandService;

    @Autowired
    public void setBrandService(BrandService brandService) {
        this.brandService = brandService;
    }

    @RequestMapping("/page")
    public String page(Model model) {
        return "product/brand";
    }

    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")BrandQuery qo, Model model) {
        Pagination<ExtendedBrand> pagination = brandService.queryBrands(qo);
        model.addAttribute("pagination", pagination);
        model.addAttribute("pages", PaginationUtil.getPages(pagination.getRows(), qo.getPageSize()));
        return "product/brand_list";
    }

}
