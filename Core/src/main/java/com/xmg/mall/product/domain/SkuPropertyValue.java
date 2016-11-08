
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class SkuPropertyValue
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long skuId;
    protected Long skuPropertyId;
    protected String value;
    protected String image;

    public Long getSkuId() {
        return this.skuId;
    }

    public SkuPropertyValue setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }

    public Long getSkuPropertyId() {
        return this.skuPropertyId;
    }

    public SkuPropertyValue setSkuPropertyId(Long skuPropertyId) {
        this.skuPropertyId = skuPropertyId;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public SkuPropertyValue setValue(String value) {
        this.value = value;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    public SkuPropertyValue setImage(String image) {
        this.image = image;
        return this;
    }

}
