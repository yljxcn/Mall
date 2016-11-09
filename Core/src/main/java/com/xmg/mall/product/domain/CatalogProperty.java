
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class CatalogProperty
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Integer type;
    public final static int TYPE_TEXT = 0;
    public final static int TYPE_NUMBER = (TYPE_TEXT + 1);
    public final static int TYPE_RELATIONSHIP = (TYPE_NUMBER + 1);
    protected Long catalogId;
    protected String name;
    protected Integer sequence;

    public CatalogProperty setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public final static Integer[] getValidTypes() {
        Integer[] validTypes = new Integer[] {TYPE_TEXT, TYPE_NUMBER, TYPE_RELATIONSHIP };
        return validTypes;
    }

    public boolean isText() {
        return (this.type == TYPE_TEXT);
    }

    public CatalogProperty setText() {
        this.type = TYPE_TEXT;
        return this;
    }

    public boolean isNumber() {
        return (this.type == TYPE_NUMBER);
    }

    public CatalogProperty setNumber() {
        this.type = TYPE_NUMBER;
        return this;
    }

    public boolean isRelationship() {
        return (this.type == TYPE_RELATIONSHIP);
    }

    public CatalogProperty setRelationship() {
        this.type = TYPE_RELATIONSHIP;
        return this;
    }

    public Long getCatalogId() {
        return this.catalogId;
    }

    public CatalogProperty setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CatalogProperty setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public CatalogProperty setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

}
