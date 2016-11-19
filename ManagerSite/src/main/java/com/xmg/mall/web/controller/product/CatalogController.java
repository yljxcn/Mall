package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.qo.BrandQuery;
import com.xmg.mall.product.qo.CatalogQuery;
import com.xmg.mall.product.service.BrandService;
import com.xmg.mall.product.service.CatalogService;
import com.xmg.mall.product.vo.ExtendedBrand;
import com.xmg.mall.product.vo.ExtendedCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("catalogController")
@RequestMapping("/catalog")
public class CatalogController {

    private CatalogService catalogService;

    @Autowired
    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @RequestMapping("/page")
    public String page(Model model) {
        return "product/catalog";
    }

    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")CatalogQuery qo, Model model) {
        Pagination<ExtendedCatalog> pagination = catalogService.queryCatalogs(qo);

        model.addAttribute("pagination", pagination);
        model.addAttribute("pages", PaginationUtil.getPages(pagination.getRows(), qo.getPageSize()));
        return "product/catalog_list";
    }

    @RequestMapping("/toSaveOrUpdate")
    public String toSaveOrUpdate(Model model) {
        return "product/catalog_add_or_update";
    }

}
