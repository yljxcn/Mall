
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class CatalogPropertyValue
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long catalogId;
    protected String value;
    protected Integer sequence;

    public Long getCatalogId() {
        return this.catalogId;
    }

    public CatalogPropertyValue setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public CatalogPropertyValue setValue(String value) {
        this.value = value;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public CatalogPropertyValue setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

}
