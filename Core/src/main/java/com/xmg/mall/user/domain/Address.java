
package com.xmg.mall.user.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class Address
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long userId;
    protected Long provinceId;
    protected Long cityId;
    protected Long areaId;
    protected Long streetId;
    protected String detail;
    protected String realname;
    protected String phoneNumber;
    protected String email;
    protected String zipCode;

    public Long getUserId() {
        return this.userId;
    }

    public Address setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getProvinceId() {
        return this.provinceId;
    }

    public Address setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public Long getCityId() {
        return this.cityId;
    }

    public Address setCityId(Long cityId) {
        this.cityId = cityId;
        return this;
    }

    public Long getAreaId() {
        return this.areaId;
    }

    public Address setAreaId(Long areaId) {
        this.areaId = areaId;
        return this;
    }

    public Long getStreetId() {
        return this.streetId;
    }

    public Address setStreetId(Long streetId) {
        this.streetId = streetId;
        return this;
    }

    public String getDetail() {
        return this.detail;
    }

    public Address setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public String getRealname() {
        return this.realname;
    }

    public Address setRealname(String realname) {
        this.realname = realname;
        return this;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Address setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Address setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

}
