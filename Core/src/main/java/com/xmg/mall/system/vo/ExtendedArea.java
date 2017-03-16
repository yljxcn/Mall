
package com.xmg.mall.system.vo;

import com.xmg.mall.system.domain.Area;

public class ExtendedArea
    extends Area
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.system.domain.City city;

    public com.xmg.mall.system.domain.City getCity() {
        return this.city;
    }

    public ExtendedArea setCity(com.xmg.mall.system.domain.City city) {
        this.city = city;
        return this;
    }

}
