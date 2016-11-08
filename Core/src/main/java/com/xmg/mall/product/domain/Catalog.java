
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class Catalog
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Integer level;
    protected String name;
    protected String code;
    protected Integer sequence;
    protected Integer childrenCatalogs;
    protected Integer products;
    protected Long parentCatalogId;

    public Integer getLevel() {
        return this.level;
    }

    public Catalog setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Catalog setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public Catalog setCode(String code) {
        this.code = code;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public Catalog setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    public Integer getChildrenCatalogs() {
        return this.childrenCatalogs;
    }

    public Catalog setChildrenCatalogs(Integer childrenCatalogs) {
        this.childrenCatalogs = childrenCatalogs;
        return this;
    }

    public Integer getProducts() {
        return this.products;
    }

    public Catalog setProducts(Integer products) {
        this.products = products;
        return this;
    }

    public Long getParentCatalogId() {
        return this.parentCatalogId;
    }

    public Catalog setParentCatalogId(Long parentCatalogId) {
        this.parentCatalogId = parentCatalogId;
        return this;
    }

}
