
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.CatalogPropertyValue;

public class ExtendedCatalogPropertyValue
    extends CatalogPropertyValue
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.CatalogProperty catalogProperty;

    public com.xmg.mall.product.domain.CatalogProperty getCatalogProperty() {
        return this.catalogProperty;
    }

    public ExtendedCatalogPropertyValue setCatalogProperty(com.xmg.mall.product.domain.CatalogProperty catalogProperty) {
        this.catalogProperty = catalogProperty;
        return this;
    }

}
