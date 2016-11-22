package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.domain.SkuProperty;
import com.xmg.mall.product.domain.SkuPropertyValue;
import com.xmg.mall.product.qo.ProductQuery;
import com.xmg.mall.product.qo.SkuPropertyQuery;
import com.xmg.mall.product.service.ProductService;
import com.xmg.mall.product.service.SkuPropertyService;
import com.xmg.mall.product.vo.ExtendedProduct;
import com.xmg.mall.product.vo.ExtendedSku;
import com.xmg.mall.product.vo.ExtendedSkuProperty;
import com.xmg.mall.web.form.product.GenerateSkuForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("skuPropertyController")
@RequestMapping("/skuProperty")
public class SkuPropertyController {

    private SkuPropertyService skuPropertyService;

    @Autowired
    public void setSkuPropertyService(SkuPropertyService skuPropertyService) {
        this.skuPropertyService = skuPropertyService;
    }

    @RequestMapping("/page")
    public String page(Model model) {
        return "product/skuProperty";
    }

    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")SkuPropertyQuery qo, Model model) {
        Pagination<ExtendedSkuProperty> pagination = skuPropertyService.querySkuPropertys(qo);

        model.addAttribute("pagination", pagination);
        model.addAttribute("pages", PaginationUtil.getPages(pagination.getRows(), qo.getPageSize()));
        return "product/skuProperty_list";
    }

    @RequestMapping("/toSaveOrUpdate")
    public String toSaveOrUpdate(Model model) {
        return "product/skuProperty_add_or_update";
    }

    @RequestMapping("/generateSkus")
    public String generateSkus(Model model, @RequestBody GenerateSkuForm generateSkuForm) {
        List<Map<String, Object>> skus = skuPropertyService.generateSkus(generateSkuForm.getProductId(), generateSkuForm.getSkuProperties(), generateSkuForm.getSkuPropertyValues());
        model.addAttribute("skuProperties", generateSkuForm.getSkuProperties());
        model.addAttribute("skus", skus);
        return "product/sku_table";
    }
}
