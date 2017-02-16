package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.domain.SkuProperty;
import com.xmg.mall.product.form.SkuGenerateForm;
import com.xmg.mall.product.qo.SkuPropertyQuery;
import com.xmg.mall.product.qo.SkuPropertyRelationshipValueQuery;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.service.SkuPropertyService;
import com.xmg.mall.product.vo.ExtendedSkuProperty;
import com.xmg.mall.product.vo.ExtendedSkuPropertyRelationshipValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("skuPropertyController")
@RequestMapping("/skuProperty")
public class SkuPropertyController {

    private SkuPropertyService skuPropertyService;
    private ProductModuleService productModuleService;

    @Autowired
    public void setProductModuleService(ProductModuleService productModuleService) {
        this.productModuleService = productModuleService;
    }

    @Autowired
    public void setSkuPropertyService(SkuPropertyService skuPropertyService) {
        this.skuPropertyService = skuPropertyService;
    }

    @RequestMapping("/page")
    public String page() {
        return "product/sku_property";
    }

    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")SkuPropertyQuery qo, Model model) {
        Pagination<ExtendedSkuProperty> pagination = skuPropertyService.querySkuPropertys(qo);

        model.addAttribute("pagination", pagination);
        model.addAttribute("pages", PaginationUtil.getPages(pagination.getRows(), qo.getPageSize()));
        return "product/sku_property_list";
    }

    @RequestMapping("/toSave")
    public String toSave() {
        return "product/sku_property_save";
    }

    @RequestMapping("/save")
    public String save(SkuProperty skuProperty, String skuPropertyDefaultValues) {
        try{
            skuPropertyService.save(skuProperty, skuPropertyDefaultValues);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/skuProperty/page";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, Long id) {
        if(id != null){
            SkuProperty skuProperty = skuPropertyService.getSkuProperty(id);
            model.addAttribute("skuProperty", skuProperty);
            if(skuProperty.hasRelationship()){
                SkuPropertyRelationshipValueQuery qo = new SkuPropertyRelationshipValueQuery();
                qo.setSkuPropertyId(skuProperty.getId());
                List<ExtendedSkuPropertyRelationshipValue> extendedSkuPropertyRelationshipValues = productModuleService.getSkuPropertyRelationshipValueService().listSkuPropertyRelationshipValues(qo);
                StringBuilder sb = new StringBuilder();
                for (ExtendedSkuPropertyRelationshipValue extendedSkuPropertyRelationshipValue : extendedSkuPropertyRelationshipValues) {
                    sb.append(extendedSkuPropertyRelationshipValue.getValue())
                            .append(",");
                }
                sb.deleteCharAt(sb.length() - 1);
                model.addAttribute("skuPropertyDefaultValues", sb.toString());
            }
        }
        return "product/sku_property_update";
    }

    @RequestMapping("/update")
    public String update(SkuProperty skuProperty) {
        // TODO
        return "redirect:/skuProperty/page";
    }

    @RequestMapping("/generateSkus")
    public String generateSkus(Model model, @RequestBody SkuGenerateForm skuGenerateForm) {
        List<Map<String, Object>> skus = skuPropertyService.generateSkus(skuGenerateForm.getProductId(), skuGenerateForm.getSkuProperties(), skuGenerateForm.getSkuPropertyValues());
        model.addAttribute("skuProperties", skuGenerateForm.getSkuProperties());
        model.addAttribute("skus", skus);
        return "product/sku_table";
    }
}
