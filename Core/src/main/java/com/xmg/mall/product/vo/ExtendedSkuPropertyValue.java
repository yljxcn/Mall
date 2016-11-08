
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.SkuPropertyValue;

public class ExtendedSkuPropertyValue
    extends SkuPropertyValue
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Sku sku;
    protected com.xmg.mall.product.domain.SkuProperty skuProperty;

    public com.xmg.mall.product.domain.Sku getSku() {
        return this.sku;
    }

    public ExtendedSkuPropertyValue setSku(com.xmg.mall.product.domain.Sku sku) {
        this.sku = sku;
        return this;
    }

    public com.xmg.mall.product.domain.SkuProperty getSkuProperty() {
        return this.skuProperty;
    }

    public ExtendedSkuPropertyValue setSkuProperty(com.xmg.mall.product.domain.SkuProperty skuProperty) {
        this.skuProperty = skuProperty;
        return this;
    }

}
