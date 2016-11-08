
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.CatalogPropertyValue;

public class ExtendedCatalogPropertyValue
    extends CatalogPropertyValue
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.CatalogProperty catalog;

    public com.xmg.mall.product.domain.CatalogProperty getCatalog() {
        return this.catalog;
    }

    public ExtendedCatalogPropertyValue setCatalog(com.xmg.mall.product.domain.CatalogProperty catalog) {
        this.catalog = catalog;
        return this;
    }

}
