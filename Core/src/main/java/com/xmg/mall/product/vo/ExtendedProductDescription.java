
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.ProductDescription;

public class ExtendedProductDescription
    extends ProductDescription
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Product product;

    public com.xmg.mall.product.domain.Product getProduct() {
        return this.product;
    }

    public ExtendedProductDescription setProduct(com.xmg.mall.product.domain.Product product) {
        this.product = product;
        return this;
    }

}
