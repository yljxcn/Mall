package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.product.domain.Brand;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.form.ProductSaveForm;
import com.xmg.mall.product.qo.*;
import com.xmg.mall.product.service.*;
import com.xmg.mall.product.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String page() {
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
    public String save(ProductSaveForm productSaveForm) {
        try {
            productService.save(productSaveForm.getProduct(), productSaveForm.getDesc(), productSaveForm.getImpressions() , productSaveForm.getProductCatalogPropertyValues(), productSaveForm.getProductImages());
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/product/page";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, Long id) {
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

        if(id != null){
            Product product = productService.getProduct(id);
            model.addAttribute("product", product);
            Long productId = product.getId();

            // 查询描述
            ProductDescriptionService productDescriptionService = productModuleService.getProductDescriptionService();
            ProductDescriptionQuery productDescriptionQuery = new ProductDescriptionQuery();
            productDescriptionQuery.setProductId(productId)
                    .setSelectDescription(true);
            ExtendedProductDescription extendedProductDescription = productDescriptionService.queryOneProductDescription(productDescriptionQuery);
            model.addAttribute("productDescription", extendedProductDescription);

            // 查询标签
            ProductImpressionService productImpressionService = productModuleService.getProductImpressionService();
            ProductImpressionQuery productImpressionQuery = new ProductImpressionQuery();
            productImpressionQuery.setProductId(productId);
            List<ExtendedProductImpression> extendedProductImpressions = productImpressionService.listProductImpressions(productImpressionQuery);
            Long[] impressionIds = new Long[extendedProductImpressions.size()];
            for (int i = 0; i < extendedProductImpressions.size(); i++) {
                impressionIds[i] = extendedProductImpressions.get(i).getId();
            }
            ImpressionService impressionService = productModuleService.getImpressionService();
            ImpressionQuery impressionQuery = new ImpressionQuery();
            impressionQuery.setIds(impressionIds);
            List<ExtendedImpression> extendedImpressions = impressionService.listImpressions(impressionQuery);
            StringBuilder sb = new StringBuilder();
            for (ExtendedImpression extendedImpression : extendedImpressions) {
                sb.append(extendedImpression.getName())
                        .append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            model.addAttribute("impressions", sb.toString());

            // 查询商品图片
            ProductImageService productImageService = productModuleService.getProductImageService();
            ProductImageQuery productImageQuery = new ProductImageQuery();
            productImageQuery.setProductId(productId);
            List<ExtendedProductImage> extendedProductImages = productImageService.listProductImages(productImageQuery);
            int size = extendedProductImages.size();
            if(size < 8){ // 页面要显示 8 张图上传位置
                for(int i= size; i < 8; i++){
                    extendedProductImages.add(null);
                }
            }
            model.addAttribute("productImages", extendedProductImages);
        }

        return "product/product_update";
    }

    @RequestMapping("/update")
    public String update(Model model, ProductSaveForm productSaveForm) {
        // TODO
        return "redirect:/product/page";
    }

}