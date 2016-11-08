
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.CatalogProperty;

public class ExtendedCatalogProperty
    extends CatalogProperty
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Catalog catalog;

    public com.xmg.mall.product.domain.Catalog getCatalog() {
        return this.catalog;
    }

    public ExtendedCatalogProperty setCatalog(com.xmg.mall.product.domain.Catalog catalog) {
        this.catalog = catalog;
        return this;
    }

}
