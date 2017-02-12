package com.xmg.mall.web.form.product;

import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.domain.ProductCatalogPropertyValue;
import com.xmg.mall.product.domain.ProductImage;

import java.util.List;

/**
 * Created by lony on 2017/2/12.
 */
public class ProductForm {

    private Product product;
    private Boolean shelves;
    private Boolean recommended;
    private String description;
    private String impressions;
    private List<ProductCatalogPropertyValue> productCatalogPropertyValues;
    private List<ProductImage> productImages;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Boolean getShelves() {
        return shelves;
    }

    public void setShelves(Boolean shelves) {
        this.shelves = shelves;
    }

    public Boolean getRecommended() {
        return recommended;
    }

    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
