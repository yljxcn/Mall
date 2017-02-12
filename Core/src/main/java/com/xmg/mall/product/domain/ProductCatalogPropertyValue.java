
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class ProductCatalogPropertyValue
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long productId;
    protected Long catalogPropertyId;
    protected String value;

    public Long getProductId() {
        return this.productId;
    }

    public ProductCatalogPropertyValue setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getCatalogPropertyId() {
        return this.catalogPropertyId;
    }

    public ProductCatalogPropertyValue setCatalogPropertyId(Long catalogPropertyId) {
        this.catalogPropertyId = catalogPropertyId;
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
