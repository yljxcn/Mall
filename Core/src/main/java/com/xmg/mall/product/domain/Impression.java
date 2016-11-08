
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class Impression
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected String name;

    public String getName() {
        return this.name;
    }

    public Impression setName(String name) {
        this.name = name;
        return this;
    }

}
