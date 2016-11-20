package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.qo.SkuQuery;
import com.xmg.mall.product.service.SkuService;
import com.xmg.mall.product.vo.ExtendedSku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("skuController")
@RequestMapping("/sku")
public class SkuController {

    private SkuService skuService;

    @Autowired
    public void setSkuService(SkuService skuService) {
        this.skuService = skuService;
    }

    @RequestMapping("/page")
    public String page(Model model) {
        return "product/sku";
    }

    @RequestMapping("/list")
    public String list(@ModelAttribute("qo")SkuQuery qo, Model model) {
        qo.setJoinProduct();
        Pagination<ExtendedSku> pagination = skuService.querySkus(qo);
        model.addAttribute("pagination", pagination);
        model.addAttribute("pages", PaginationUtil.getPages(pagination.getRows(), qo.getPageSize()));
        return "product/sku_list";
    }

    @RequestMapping("/toSaveOrUpdate")
    public String toSaveOrUpdate(Model model) {
        return "product/sku_add_or_update";
    }

}
