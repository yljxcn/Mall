package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.base.upload.FileUploader;
import com.xmg.mall.product.domain.Sku;
import com.xmg.mall.product.domain.SkuProperty;
import com.xmg.mall.product.form.SkuSaveForm;
import com.xmg.mall.product.qo.ProductQuery;
import com.xmg.mall.product.qo.SkuPropertyQuery;
import com.xmg.mall.product.qo.SkuQuery;
import com.xmg.mall.product.service.ProductModuleService;
import com.xmg.mall.product.service.SkuPropertyService;
import com.xmg.mall.product.service.SkuService;
import com.xmg.mall.product.vo.ExtendedProduct;
import com.xmg.mall.product.vo.ExtendedSku;
import com.xmg.mall.product.vo.ExtendedSkuProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by lony on 2016/11/9.
 */
@Controller("skuController")
@RequestMapping("/sku")
public class SkuController {

    private SkuService skuService;

    private ProductModuleService productModuleService;

    @Autowired
    public void setProductModuleService(ProductModuleService productModuleService) {
        this.productModuleService = productModuleService;
    }

    @Autowired
    public void setSkuService(SkuService skuService) {
        this.skuService = skuService;
    }

    @RequestMapping("/page")
    public String page() {
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

    @RequestMapping("/toSave")
    public String toSave(Model model, Long productId) {
        if(productId != null){
            ProductQuery productQuery = new ProductQuery();
            productQuery.setIds(new Long[]{productId})
                    .setJoinBrand()
                    .setJoinCatalog();
            ExtendedProduct extendedProduct = productModuleService.getProductService().queryOneProduct(productQuery);
            model.addAttribute("product", extendedProduct);

            SkuPropertyService skuPropertyService = productModuleService.getSkuPropertyService();
            SkuPropertyQuery skuPropertyQuery = new SkuPropertyQuery();
            skuPropertyQuery.setIncludeMods(new Long[]{SkuProperty.MODS_Effective});
            List<ExtendedSkuProperty> extendedSkuProperties = skuPropertyService.listSkuPropertys(skuPropertyQuery);
            model.addAttribute("skuProperties", extendedSkuProperties);
        }
        return "product/sku_save";
    }

    @RequestMapping("/save")
    public String save(@RequestParam("productId") Long productId, @RequestParam("file") MultipartFile[] files, @RequestParam("skuPropertyId") Long[] skuPropertyIds, @RequestParam("skuPropertyValue") String[] skuPropertyValues, SkuSaveForm skuSaveForm) {
        try{
            skuService.save(productId, files, skuPropertyIds, skuPropertyValues, skuSaveForm);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/sku/page";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, Long id) {
        if(id != null){
            SkuQuery qo = new SkuQuery();
            qo.setIds(new Long[]{id})
                    .setJoinProduct();
            ExtendedSku extendedSku = skuService.queryOneSku(qo);
            model.addAttribute("sku", extendedSku);
        }
        return "product/sku_update";
    }

    @RequestMapping("/update")
    public String update(Sku sku) {
       try {
           skuService.update(sku);
       }catch (Exception e){
           e.printStackTrace();
       }
       return "redirect:/sku/page";
    }

}
