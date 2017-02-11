
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class ProductCatalogPropertyValue
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long productId;
    protected Long catalogId;
    protected String value;

    public Long getProductId() {
        return this.productId;
    }

    public ProductCatalogPropertyValue setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getCatalogId() {
        return this.catalogId;
    }

    public ProductCatalogPropertyValue setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public ProductCatalogPropertyValue setValue(String value) {
        this.value = value;
        return this;
    }

}
