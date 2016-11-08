
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class ProductFreight
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long productId;
    protected Long impressionId;
    protected Integer count;

    public Long getProductId() {
        return this.productId;
    }

    public ProductFreight setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getImpressionId() {
        return this.impressionId;
    }

    public ProductFreight setImpressionId(Long impressionId) {
        this.impressionId = impressionId;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    public ProductFreight setCount(Integer count) {
        this.count = count;
        return this;
    }

}
