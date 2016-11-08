
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.ProductSkuPropertySequence;

public class ExtendedProductSkuPropertySequence
    extends ProductSkuPropertySequence
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Product product;
    protected com.xmg.mall.product.domain.SkuProperty skuProperty;

    public com.xmg.mall.product.domain.Product getProduct() {
        return this.product;
    }

    public ExtendedProductSkuPropertySequence setProduct(com.xmg.mall.product.domain.Product product) {
        this.product = product;
        return this;
    }

    public com.xmg.mall.product.domain.SkuProperty getSkuProperty() {
        return this.skuProperty;
    }

    public ExtendedProductSkuPropertySequence setSkuProperty(com.xmg.mall.product.domain.SkuProperty skuProperty) {
        this.skuProperty = skuProperty;
        return this;
    }

}
