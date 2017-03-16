
package com.xmg.mall.user.vo;

import com.xmg.mall.user.domain.Address;

public class ExtendedAddress
    extends Address
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.user.domain.User user;
    protected com.xmg.mall.system.domain.Province province;
    protected com.xmg.mall.system.domain.City city;
    protected com.xmg.mall.system.domain.Area area;
    protected com.xmg.mall.system.domain.Street street;

    public com.xmg.mall.user.domain.User getUser() {
        return this.user;
    }

    public ExtendedAddress setUser(com.xmg.mall.user.domain.User user) {
        this.user = user;
        return this;
    }

    public com.xmg.mall.system.domain.Province getProvince() {
        return this.province;
    }

    public ExtendedAddress setProvince(com.xmg.mall.system.domain.Province province) {
        this.province = province;
        return this;
    }

    public com.xmg.mall.system.domain.City getCity() {
        return this.city;
    }

    public ExtendedAddress setCity(com.xmg.mall.system.domain.City city) {
        this.city = city;
        return this;
    }

    public com.xmg.mall.system.domain.Area getArea() {
        return this.area;
    }

    public ExtendedAddress setArea(com.xmg.mall.system.domain.Area area) {
        this.area = area;
        return this;
    }

    public com.xmg.mall.system.domain.Street getStreet() {
        return this.street;
    }

    public ExtendedAddress setStreet(com.xmg.mall.system.domain.Street street) {
        this.street = street;
        return this;
    }

}
