
package com.xmg.mall.product.vo;


public class ExtendedProductImage
    extends com.xmg.mall.product.domain.ProductImage
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.ProductImage product;

    public com.xmg.mall.product.domain.ProductImage getProduct() {
        return this.product;
    }

    public ExtendedProductImage setProduct(com.xmg.mall.product.domain.ProductImage product) {
        this.product = product;
        return this;
    }

}
