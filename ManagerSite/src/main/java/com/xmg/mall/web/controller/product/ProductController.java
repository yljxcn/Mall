package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.qo.ProductQuery;
import com.xmg.mall.product.service.CatalogService;
import com.xmg.mall.product.service.ProductService;
import com.xmg.mall.product.vo.ExtendedProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("productController")
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

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
        return "product/product_add_or_update";
    }

}
