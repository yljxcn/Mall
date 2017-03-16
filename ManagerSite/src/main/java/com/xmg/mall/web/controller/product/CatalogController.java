package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.base.query.QueryCondition;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.form.CatalogSaveForm;
import com.xmg.mall.product.qo.CatalogPropertyQuery;
import com.xmg.mall.product.qo.CatalogPropertyValueQuery;
import com.xmg.mall.product.qo.CatalogQuery;
import com.xmg.mall.product.qo.ProductCatalogPropertyValueQuery;
import com.xmg.mall.product.service.CatalogService;
import com.xmg.mall.product.service.ProductCatalogPropertyValueService;
import com.xmg.mall.product.service.ProductModuleService;
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
    public String page() {
        return "product/catalog";
    }

    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")CatalogQuery qo, Model model) {
        Pagination<ExtendedCatalog> pagination = catalogService.queryCatalogs(qo);

        model.addAttribute("pagination", pagination);
        model.addAttribute("pages", PaginationUtil.getPages(pagination.getRows(), qo.getPageSize()));
        return "product/catalog_list";
    }

    @RequestMapping("/toSave")
    public String toSave(Model model) {
        CatalogQuery catalogQuery = new CatalogQuery();
        // 新增加的话只查询一级分类和二级分类
        catalogQuery.setIncludeLevels(new Integer[]{Catalog.LEVEL_ONE, Catalog.LEVEL_SECOND});
        List<ExtendedCatalog> catalogs = catalogService.listCatalogs(catalogQuery);
        model.addAttribute("catalogs", catalogs);
        return "product/catalog_save";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, Long id) {
        Catalog catalog = catalogService.getCatalog(id);
        CatalogQuery catalogQuery = new CatalogQuery();
        if(catalog.isOne()){
            catalogQuery.setExcludeLevels(new Integer[]{Catalog.LEVEL_ONE, Catalog.LEVEL_SECOND, Catalog.LEVEL_THIRD});
            // 不查上级分类
        }else if (catalog.isSecond()){
            // 查询一级分类
            catalogQuery.setIncludeLevels(new Integer[]{Catalog.LEVEL_ONE});
        }else if (catalog.isThird()){
            // 查询二级分类
            catalogQuery.setIncludeLevels(new Integer[]{Catalog.LEVEL_SECOND});
        }
        List<ExtendedCatalog> catalogs = catalogService.listCatalogs(catalogQuery);
        model.addAttribute("catalogs", catalogs);
        model.addAttribute("catalog", catalog);

        CatalogPropertyQuery catalogPropertyQuery = new CatalogPropertyQuery();
        catalogPropertyQuery.setCatalogId(catalog.getId());
        catalogPropertyQuery.setOrderBySequence(QueryCondition.ORDER_BY_KEYWORD_ASC);
        List<ExtendedCatalogProperty> catalogProperties = productModuleService.getCatalogPropertyService().listCatalogPropertys(catalogPropertyQuery);

        List<ExtendedCatalogPropertyValue> eCatalogPropertyValues  = new ArrayList<>();
        for (ExtendedCatalogProperty catalogProperty : catalogProperties) {
            CatalogPropertyValueQuery catalogPropertyValueQuery = new CatalogPropertyValueQuery();
            catalogPropertyValueQuery.setJoinCatalogProperty();
            catalogPropertyValueQuery.setCatalogPropertyId(catalogProperty.getId());
            catalogPropertyValueQuery.setOrderBySequence(QueryCondition.ORDER_BY_KEYWORD_ASC);
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

        return "product/catalog_update";
    }

    @RequestMapping("/save")
    public String save(CatalogSaveForm catalogSaveForm) {
        try{
            catalogService.save(catalogSaveForm.getCatalog(), catalogSaveForm.getCatalogProperties(), catalogSaveForm.getCatalogPropertyValues());
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/catalog/page";
    }

    @RequestMapping("/update")
    public String update(CatalogSaveForm catalogSaveForm) {
        try{
            catalogService.update(catalogSaveForm.getCatalog(), catalogSaveForm.getCatalogProperties(), catalogSaveForm.getCatalogPropertyValues());
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/catalog/page";
    }

    @RequestMapping("/catalogPropertiesValues")
    public String catalogPropertiesAndValues(Model model, Long productId, Long catalogId) {
        List<ExtendedProductCatalogPropertyValue> extendedProductCatalogPropertyValues = new ArrayList<>();

        // 查询产品分类属性值
        if(productId != null){
            ProductCatalogPropertyValueService productCatalogPropertyValueService = productModuleService.getProductCatalogPropertyValueService();
            ProductCatalogPropertyValueQuery qo = new ProductCatalogPropertyValueQuery();
            qo.setProductId(productId);
            extendedProductCatalogPropertyValues = productCatalogPropertyValueService.listProductCatalogPropertyValues(qo);
        }

        Catalog catalog = productModuleService.getCatalogService().getCatalog(catalogId);
        List<ExtendedCatalogProperty> catalogProperties = new ArrayList<>();
        if(catalog != null){
            getALLCatalogProperties(catalogProperties, catalog);
        }

        // 定义回显页面封装的集合
        List<ExtendedCatalogPropertiesAndValues> voes = new ArrayList<>(catalogProperties.size());
        for (ExtendedCatalogProperty catalogProperty : catalogProperties) {
            ExtendedCatalogPropertiesAndValues vo = new ExtendedCatalogPropertiesAndValues();
            vo.setCatalogProperty(catalogProperty);

            CatalogPropertyValueQuery catalogPropertyValueQuery = new CatalogPropertyValueQuery();
            catalogPropertyValueQuery.setCatalogPropertyId(catalogProperty.getId());
            List<ExtendedCatalogPropertyValue> catalogPropertyValues = productModuleService.getCatalogPropertyValueService().listCatalogPropertyValues(catalogPropertyValueQuery);

            List<ExtendedCatalogPropertyAndValues> extendedCatalogPropertyAndValues = new ArrayList<>();
            for (ExtendedCatalogPropertyValue catalogPropertyValue : catalogPropertyValues) {
                boolean show = false;
                if(catalogProperty.isRelationship()){
                    // 商品编辑页面回显分类属性下拉值
                    for (ExtendedProductCatalogPropertyValue extendedProductCatalogPropertyValue : extendedProductCatalogPropertyValues) {
                        if(catalogPropertyValue.getCatalogPropertyId().equals(extendedProductCatalogPropertyValue.getCatalogPropertyId())
                                && catalogPropertyValue.getValue().equals(extendedProductCatalogPropertyValue.getValue())){
                            show = true;
                            break;
                        }
                    }
                }else{
                    // 商品编辑页面回显分类属性文本值
                    for (ExtendedProductCatalogPropertyValue extendedProductCatalogPropertyValue : extendedProductCatalogPropertyValues) {
                        if(catalogPropertyValue.getCatalogPropertyId().equals(extendedProductCatalogPropertyValue.getCatalogPropertyId())){
                            // 设置增加时候的值
                            catalogPropertyValue.setValue(extendedProductCatalogPropertyValue.getValue());
                            break;
                        }
                    }
                }

                ExtendedCatalogPropertyAndValues cpvs = new ExtendedCatalogPropertyAndValues();
                cpvs.setShow(show);
                cpvs.setCatalogPropertyValue(catalogPropertyValue);
                extendedCatalogPropertyAndValues.add(cpvs);
            }
            vo.setCatalogPropertyAndValues(extendedCatalogPropertyAndValues);
            voes.add(vo);
        }
        model.addAttribute("voes", voes);
        return "product/catalog_properties_values_table";
    }

    /**
     * 递归查询此分类的分类属性（包括父级分类的分类属性）
     * @param catalogProperties
     * @param catalog
     * @return
     */
    private List<ExtendedCatalogProperty> getALLCatalogProperties(List<ExtendedCatalogProperty> catalogProperties, Catalog catalog){
        Long parentCatalogId = catalog.getParentCatalogId();
        CatalogPropertyQuery catalogPropertyQuery = new CatalogPropertyQuery();
        catalogPropertyQuery.setCatalogId(catalog.getId());
        catalogProperties.addAll(productModuleService.getCatalogPropertyService().listCatalogPropertys(catalogPropertyQuery));

        if(parentCatalogId == null) {
            return catalogProperties;
        }
        return getALLCatalogProperties(catalogProperties, productModuleService.getCatalogService().getCatalog(parentCatalogId));
    }

}
