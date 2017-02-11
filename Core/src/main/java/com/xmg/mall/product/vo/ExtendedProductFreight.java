
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.ProductFreight;

public class ExtendedProductFreight
    extends ProductFreight
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Product product;

    public com.xmg.mall.product.domain.Product getProduct() {
        return this.product;
    }

    public ExtendedProductFreight setProduct(com.xmg.mall.product.domain.Product product) {
        this.product = product;
        return this;
    }

}
