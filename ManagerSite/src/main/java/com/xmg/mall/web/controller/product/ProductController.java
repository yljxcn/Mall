package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.domain.Brand;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.qo.*;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.service.ProductService;
import com.xmg.mall.product.vo.*;
import com.xmg.mall.web.form.product.ProductForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("productController")
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;
    private ProductModuleService productModuleService;

    @Autowired
    public void setProductModuleService(ProductModuleService productModuleService) {
        this.productModuleService = productModuleService;
    }

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/page")
    public String page(Model model) {
        return "product/product";
    }

    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")ProductQuery qo, Model model) {
        Pagination<ExtendedProduct> pagination = productService.queryProducts(qo);

        model.addAttribute("pagination", pagination);
        model.addAttribute("pages", PaginationUtil.getPages(pagination.getRows(), qo.getPageSize()));
        return "product/product_list";
    }

    @RequestMapping("/toSave")
    public String toSave(Model model) {
        // 所有可见的品牌
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.setIncludeMods(new Long[]{Brand.MODS_VISIBLE});
        List<ExtendedBrand> brands = productModuleService.getBrandService().listBrands(brandQuery);

        // 查询三级分类
        CatalogQuery catalogQuery = new CatalogQuery();
        catalogQuery.setIncludeLevels(new Integer[]{Catalog.LEVEL_THIRD});
        List<ExtendedCatalog> catalogs = productModuleService.getCatalogService().listCatalogs(catalogQuery);

        model.addAttribute("brands", brands);
        model.addAttribute("catalogs", catalogs);
        return "product/product_save";
    }

    @RequestMapping("/save")
    public String save(Model model, ProductForm productForm) {

        productService.save(productForm.getProduct(), productForm.getDescription() ,productForm.getProductCatalogPropertyValues(), productForm.getImpressions(), productForm.getProductImages());
        // TODO
        return "redirect:/product/page";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model) {
        // 所有可见的品牌
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.setIncludeMods(new Long[]{Brand.MODS_VISIBLE});
        List<ExtendedBrand> brands = productModuleService.getBrandService().listBrands(brandQuery);

        // 查询三级分类
        CatalogQuery catalogQuery = new CatalogQuery();
        catalogQuery.setIncludeLevels(new Integer[]{Catalog.LEVEL_THIRD});
        List<ExtendedCatalog> catalogs = productModuleService.getCatalogService().listCatalogs(catalogQuery);

        model.addAttribute("brands", brands);
        model.addAttribute("catalogs", catalogs);
        return "product/product_update";
    }

}