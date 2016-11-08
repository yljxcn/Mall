
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.ProductFreight;

public class ExtendedProductFreight
    extends ProductFreight
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Product product;
    protected com.xmg.mall.product.domain.Impression impression;

    public com.xmg.mall.product.domain.Product getProduct() {
        return this.product;
    }

    public ExtendedProductFreight setProduct(com.xmg.mall.product.domain.Product product) {
        this.product = product;
        return this;
    }

    public com.xmg.mall.product.domain.Impression getImpression() {
        return this.impression;
    }

    public ExtendedProductFreight setImpression(com.xmg.mall.product.domain.Impression impression) {
        this.impression = impression;
        return this;
    }

}
