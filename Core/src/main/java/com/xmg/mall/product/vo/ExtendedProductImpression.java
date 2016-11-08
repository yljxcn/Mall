
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.ProductImpression;

public class ExtendedProductImpression
    extends ProductImpression
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Product product;
    protected com.xmg.mall.product.domain.Impression impression;

    public com.xmg.mall.product.domain.Product getProduct() {
        return this.product;
    }

    public ExtendedProductImpression setProduct(com.xmg.mall.product.domain.Product product) {
        this.product = product;
        return this;
    }

    public com.xmg.mall.product.domain.Impression getImpression() {
        return this.impression;
    }

    public ExtendedProductImpression setImpression(com.xmg.mall.product.domain.Impression impression) {
        this.impression = impression;
        return this;
    }

}
