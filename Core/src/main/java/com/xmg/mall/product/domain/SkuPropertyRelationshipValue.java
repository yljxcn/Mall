
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class SkuPropertyRelationshipValue
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long skuPropertyId;
    protected String value;
    protected Integer sequence;

    public Long getSkuPropertyId() {
        return this.skuPropertyId;
    }

    public SkuPropertyRelationshipValue setSkuPropertyId(Long skuPropertyId) {
        this.skuPropertyId = skuPropertyId;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public SkuPropertyRelationshipValue setValue(String value) {
        this.value = value;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public SkuPropertyRelationshipValue setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

}
