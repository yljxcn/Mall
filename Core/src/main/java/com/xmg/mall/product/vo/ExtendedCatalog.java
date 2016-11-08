
package com.xmg.mall.product.vo;


public class ExtendedCatalog
    extends com.xmg.mall.product.domain.Catalog
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Catalog parentCatalog;

    public com.xmg.mall.product.domain.Catalog getParentCatalog() {
        return this.parentCatalog;
    }

    public ExtendedCatalog setParentCatalog(com.xmg.mall.product.domain.Catalog parentCatalog) {
        this.parentCatalog = parentCatalog;
        return this;
    }

}
