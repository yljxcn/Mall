
package com.xmg.mall.system.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class Street
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long areaId;
    protected String name;

    public Long getAreaId() {
        return this.areaId;
    }

    public Street setAreaId(Long areaId) {
        this.areaId = areaId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Street setName(String name) {
        this.name = name;
        return this;
    }

}
