
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class ProductSkuPropertySequence
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long productId;
    protected Long skuPropertyId;
    protected Integer sequence;

    public Long getProductId() {
        return this.productId;
    }

    public ProductSkuPropertySequence setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getSkuPropertyId() {
        return this.skuPropertyId;
    }

    public ProductSkuPropertySequence setSkuPropertyId(Long skuPropertyId) {
        this.skuPropertyId = skuPropertyId;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public ProductSkuPropertySequence setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

}
