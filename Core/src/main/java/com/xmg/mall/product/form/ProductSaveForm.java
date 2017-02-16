package com.xmg.mall.product.form;

import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.domain.ProductCatalogPropertyValue;
import com.xmg.mall.product.domain.ProductImage;

import java.util.List;

/**
 * Created by lony on 2017/2/12.
 */
public class ProductSaveForm {

    private Product product;
    private String desc;
    private String impressions;
    private List<ProductCatalogPropertyValue> productCatalogPropertyValues;
    private List<ProductImage> productImages;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImpressions() {
        return impressions;
    }

    public void setImpressions(String impressions) {
        this.impressions = impressions;
    }

    public List<ProductCatalogPropertyValue> getProductCatalogPropertyValues() {
        return productCatalogPropertyValues;
    }

    public void setProductCatalogPropertyValues(List<ProductCatalogPropertyValue> productCatalogPropertyValues) {
        this.productCatalogPropertyValues = productCatalogPropertyValues;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }
}
