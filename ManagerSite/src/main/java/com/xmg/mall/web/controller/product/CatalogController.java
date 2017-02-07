package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.base.query.QueryCondition;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.qo.CatalogPropertyQuery;
import com.xmg.mall.product.qo.CatalogPropertyValueQuery;
import com.xmg.mall.product.qo.CatalogQuery;
import com.xmg.mall.product.service.CatalogService;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.vo.ExtendedCatalog;
import com.xmg.mall.product.vo.ExtendedCatalogProperty;
import com.xmg.mall.product.vo.ExtendedCatalogPropertyValue;
import com.xmg.mall.web.form.product.CatalogForm;
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
@Controller("catalogController")
@RequestMapping("/catalog")
public class CatalogController {

    private CatalogService catalogService;
    private ProductModuleService productModuleService;

    @Autowired
    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @Autowired
    public void setProductModuleService(ProductModuleService productModuleService) {
        this.productModuleService = productModuleService;
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
            // 查询回显数据
            Catalog catalog = catalogService.getCatalog(id);
            model.addAttribute("catalog", catalog);

            CatalogPropertyQuery catalogPropertyQuery = new CatalogPropertyQuery();
            catalogPropertyQuery.setCatalogId(catalog.getId());
            catalogPropertyQuery.setOrderBySequence(QueryCondition.ORDER_BY_KEYWORD_ASC);
            List<ExtendedCatalogProperty> catalogProperties = productModuleService.getCatalogPropertyService().listCatalogPropertys(catalogPropertyQuery);
            model.addAttribute("catalogProperties", catalogProperties);

            List<ExtendedCatalogPropertyValue> eCatalogPropertyValues  = new ArrayList<>();

            for (ExtendedCatalogProperty catalogProperty : catalogProperties) {
                CatalogPropertyValueQuery catalogPropertyValueQuery = new CatalogPropertyValueQuery();
                catalogPropertyValueQuery.setJoinCatalogProperty();
                catalogPropertyValueQuery.setCatalogPropertyId(catalogProperty.getId());
                // catalogPropertyValueQuery.setOrderBySequence(QueryCondition.ORDER_BY_KEYWORD_ASC);
                List<ExtendedCatalogPropertyValue> catalogPropertyValues = productModuleService.getCatalogPropertyValueService().listCatalogPropertyValues(catalogPropertyValueQuery);
                if(catalogProperty.isRelationship()){ // 把多条数据的值用逗号合并成字符串
                    StringBuilder sb = new StringBuilder();
                    for (ExtendedCatalogPropertyValue catalogPropertyValue : catalogPropertyValues) {
                        sb.append(catalogPropertyValue.getValue()).append(",");
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    ExtendedCatalogPropertyValue catalogPropertyValue = new ExtendedCatalogPropertyValue();
                    catalogPropertyValue.setCatalogProperty(catalogPropertyValues.get(0).getCatalogProperty());
                    catalogPropertyValue.setValue(sb.toString());
                    eCatalogPropertyValues.add(catalogPropertyValue);
                }else { // 因为只会查出一条数据
                    eCatalogPropertyValues.add(catalogPropertyValues.get(0));
                }
            }
            model.addAttribute("eCatalogPropertyValues", eCatalogPropertyValues);
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
