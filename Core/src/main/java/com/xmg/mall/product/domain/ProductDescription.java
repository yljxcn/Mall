
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class ProductDescription
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long productId;
    protected String description;

    public Long getProductId() {
        return this.productId;
    }

    public ProductDescription setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ProductDescription setDescription(String description) {
        this.description = description;
        return this;
    }

}
