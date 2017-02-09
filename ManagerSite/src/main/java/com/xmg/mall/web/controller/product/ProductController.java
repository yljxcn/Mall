package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.domain.Brand;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.qo.*;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.service.ProductService;
import com.xmg.mall.product.vo.*;
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

    @RequestMapping("/toSaveOrUpdate")
    public String toSaveOrUpdate(Model model) {
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
        return "product/product_add_or_update";
    }

    @RequestMapping("/catalogPropertiesAndValues")
    public String catalogPropertiesAndValues(Model model, Long catalogId) {

        CatalogPropertyQuery catalogPropertyQuery = new CatalogPropertyQuery();
        catalogPropertyQuery.setCatalogId(catalogId);
        List<ExtendedCatalogProperty> catalogProperties = productModuleService.getCatalogPropertyService().listCatalogPropertys(catalogPropertyQuery);

        List<ExtendedCatalogPropertiesAndValues> voes = new ArrayList<>(catalogProperties.size());
        for (ExtendedCatalogProperty catalogProperty : catalogProperties) {
            ExtendedCatalogPropertiesAndValues vo = new ExtendedCatalogPropertiesAndValues();
            vo.setCatalogProperty(catalogProperty);

            CatalogPropertyValueQuery catalogPropertyValueQuery = new CatalogPropertyValueQuery();
            catalogPropertyValueQuery.setCatalogPropertyId(catalogProperty.getId());
            List<ExtendedCatalogPropertyValue> catalogPropertyValues = productModuleService.getCatalogPropertyValueService().listCatalogPropertyValues(catalogPropertyValueQuery);
            vo.setCatalogPropertyValues(catalogPropertyValues);
            voes.add(vo);
        }

        model.addAttribute("voes", voes);
        return "product/product_add_or_update_catalog_table";
    }

}