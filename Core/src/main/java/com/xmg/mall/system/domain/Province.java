
package com.xmg.mall.system.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class Province
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected String name;

    public String getName() {
        return this.name;
    }

    public Province setName(String name) {
        this.name = name;
        return this;
    }

}
