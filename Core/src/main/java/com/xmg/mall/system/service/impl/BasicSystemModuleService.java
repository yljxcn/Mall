
package com.xmg.mall.system.service.impl;

import com.xmg.mall.system.service.AreaService;
import com.xmg.mall.system.service.CityService;
import com.xmg.mall.system.service.ProvinceService;
import com.xmg.mall.system.service.StreetService;
import com.xmg.mall.system.service.SystemModuleService;
import com.xmg.mall.system.service.TotalAreaService;
import com.xmg.mall.system.service.TotalCityService;
import com.xmg.mall.system.service.TotalProvinceService;
import com.xmg.mall.system.service.TotalStreetService;
import org.springframework.stereotype.Service;

@Service("systemModuleService")
public class BasicSystemModuleService
    implements SystemModuleService
{

    protected ProvinceService provinceService;
    protected TotalProvinceService totalProvinceService;
    protected CityService cityService;
    protected TotalCityService totalCityService;
    protected AreaService areaService;
    protected TotalAreaService totalAreaService;
    protected StreetService streetService;
    protected TotalStreetService totalStreetService;

    public ProvinceService getProvinceService() {
        return this.provinceService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicSystemModuleService setProvinceService(ProvinceService provinceService) {
        this.provinceService = provinceService;
        return this;
    }

    public TotalProvinceService getTotalProvinceService() {
        return this.totalProvinceService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicSystemModuleService setTotalProvinceService(TotalProvinceService totalProvinceService) {
        this.totalProvinceService = totalProvinceService;
        return this;
    }

    public CityService getCityService() {
        return this.cityService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicSystemModuleService setCityService(CityService cityService) {
        this.cityService = cityService;
        return this;
    }

    public TotalCityService getTotalCityService() {
        return this.totalCityService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicSystemModuleService setTotalCityService(TotalCityService totalCityService) {
        this.totalCityService = totalCityService;
        return this;
    }

    public AreaService getAreaService() {
        return this.areaService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicSystemModuleService setAreaService(AreaService areaService) {
        this.areaService = areaService;
        return this;
    }

    public TotalAreaService getTotalAreaService() {
        return this.totalAreaService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicSystemModuleService setTotalAreaService(TotalAreaService totalAreaService) {
        this.totalAreaService = totalAreaService;
        return this;
    }

    public StreetService getStreetService() {
        return this.streetService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicSystemModuleService setStreetService(StreetService streetService) {
        this.streetService = streetService;
        return this;
    }

    public TotalStreetService getTotalStreetService() {
        return this.totalStreetService;
    }

    @org.springframework.beans.factory.annotation.Autowired
    public BasicSystemModuleService setTotalStreetService(TotalStreetService totalStreetService) {
        this.totalStreetService = totalStreetService;
        return this;
    }

}
