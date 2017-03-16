
package com.xmg.mall.system.vo;

import com.xmg.mall.system.domain.City;

public class ExtendedCity
    extends City
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.system.domain.Province province;

    public com.xmg.mall.system.domain.Province getProvince() {
        return this.province;
    }

    public ExtendedCity setProvince(com.xmg.mall.system.domain.Province province) {
        this.province = province;
        return this;
    }

}
