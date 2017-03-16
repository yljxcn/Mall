
package com.xmg.mall.system.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class City
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Long provinceId;
    protected String name;

    public Long getProvinceId() {
        return this.provinceId;
    }

    public City setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

}
