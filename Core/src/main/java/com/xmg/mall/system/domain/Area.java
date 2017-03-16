
package com.xmg.mall.system.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class Area
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long cityId;
    protected String name;

    public Long getCityId() {
        return this.cityId;
    }

    public Area setCityId(Long cityId) {
        this.cityId = cityId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Area setName(String name) {
        this.name = name;
        return this;
    }

}
