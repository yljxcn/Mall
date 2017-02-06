package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.domain.CatalogProperty;
import com.xmg.mall.product.domain.CatalogPropertyValue;
import com.xmg.mall.product.qo.BrandQuery;
import com.xmg.mall.product.qo.CatalogQuery;
import com.xmg.mall.product.service.BrandService;
import com.xmg.mall.product.service.CatalogService;
import com.xmg.mall.product.vo.ExtendedBrand;
import com.xmg.mall.product.vo.ExtendedCatalog;
import com.xmg.mall.web.form.product.CatalogForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;

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
    public String toSaveOrUpdate(Model model, Long id) {
        List<ExtendedCatalog> catalogs = catalogService.listCatalogs(new CatalogQuery());
        model.addAttribute("catalogs", catalogs);

        if(id != null){
            Catalog catalog = catalogService.getCatalog(id);
            model.addAttribute("catalog", catalog);
        }
        return "product/catalog_add_or_update";
    }

    @RequestMapping("/saveOrUpdate")
    public String save(Model model, CatalogForm catalogForm) {
        try{
            if(catalogForm.getCatalog().getId() == null){
                catalogService.save(catalogForm.getCatalog(), catalogForm.getCatalogProperties(), catalogForm.getCatalogPropertyValues());
            } else {
                catalogService.update(catalogForm.getCatalog(), catalogForm.getCatalogProperties(), catalogForm.getCatalogPropertyValues());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/catalog/page";
    }

}
