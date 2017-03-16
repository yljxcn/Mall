
package com.xmg.mall.system.vo;

import com.xmg.mall.system.domain.Street;

public class ExtendedStreet
    extends Street
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.system.domain.Area area;

    public com.xmg.mall.system.domain.Area getArea() {
        return this.area;
    }

    public ExtendedStreet setArea(com.xmg.mall.system.domain.Area area) {
        this.area = area;
        return this;
    }

}
