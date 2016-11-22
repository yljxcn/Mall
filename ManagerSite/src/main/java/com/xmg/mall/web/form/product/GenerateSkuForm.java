package com.xmg.mall.web.form.product;

import com.xmg.mall.product.domain.SkuProperty;
import com.xmg.mall.product.domain.SkuPropertyValue;

import java.util.List;

/**
 * Created by lony on 2016/11/21.
 */
public class GenerateSkuForm {
    private Long productId;
    private List<SkuProperty> skuProperties;
    private List<SkuPropertyValue> skuPropertyValues;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public List<SkuProperty> getSkuProperties() {
        return skuProperties;
    }

    public void setSkuProperties(List<SkuProperty> skuProperties) {
        this.skuProperties = skuProperties;
    }

    public List<SkuPropertyValue> getSkuPropertyValues() {
        return skuPropertyValues;
    }

    public void setSkuPropertyValues(List<SkuPropertyValue> skuPropertyValues) {
        this.skuPropertyValues = skuPropertyValues;
    }
}