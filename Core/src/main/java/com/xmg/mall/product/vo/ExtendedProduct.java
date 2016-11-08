
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.Product;

public class ExtendedProduct
    extends Product
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Catalog catalog;
    protected com.xmg.mall.product.domain.Brand brand;

    public com.xmg.mall.product.domain.Catalog getCatalog() {
        return this.catalog;
    }

    public ExtendedProduct setCatalog(com.xmg.mall.product.domain.Catalog catalog) {
        this.catalog = catalog;
        return this;
    }

    public com.xmg.mall.product.domain.Brand getBrand() {
        return this.brand;
    }

    public ExtendedProduct setBrand(com.xmg.mall.product.domain.Brand brand) {
        this.brand = brand;
        return this;
    }

}
