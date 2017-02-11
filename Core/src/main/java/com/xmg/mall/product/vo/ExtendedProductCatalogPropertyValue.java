
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.ProductCatalogPropertyValue;

public class ExtendedProductCatalogPropertyValue
    extends ProductCatalogPropertyValue
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Product product;
    protected com.xmg.mall.product.domain.Catalog catalog;

    public com.xmg.mall.product.domain.Product getProduct() {
        return this.product;
    }

    public ExtendedProductCatalogPropertyValue setProduct(com.xmg.mall.product.domain.Product product) {
        this.product = product;
        return this;
    }

    public com.xmg.mall.product.domain.Catalog getCatalog() {
        return this.catalog;
    }

    public ExtendedProductCatalogPropertyValue setCatalog(com.xmg.mall.product.domain.Catalog catalog) {
        this.catalog = catalog;
        return this;
    }

}
