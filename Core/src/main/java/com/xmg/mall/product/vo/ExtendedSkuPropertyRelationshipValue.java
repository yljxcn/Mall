
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.SkuPropertyRelationshipValue;

public class ExtendedSkuPropertyRelationshipValue
    extends SkuPropertyRelationshipValue
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.SkuProperty skuProperty;

    public com.xmg.mall.product.domain.SkuProperty getSkuProperty() {
        return this.skuProperty;
    }

    public ExtendedSkuPropertyRelationshipValue setSkuProperty(com.xmg.mall.product.domain.SkuProperty skuProperty) {
        this.skuProperty = skuProperty;
        return this;
    }

}
