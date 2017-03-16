
package com.xmg.mall.system.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.system.domain.City;
import com.xmg.mall.system.mapper.CityMapper;
import com.xmg.mall.system.qo.CityQuery;
import com.xmg.mall.system.service.CityService;
import com.xmg.mall.system.vo.ExtendedCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cityService")
public class BasicCityService
    implements CityService
{

    private CityMapper cityMapper;

    @Autowired
    public void setCityMapper(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public City getCity(Long id) {
        return cityMapper.get(id);
    }

    protected void updateCity(City city) {
        int affected = cityMapper.update(city);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        city.increaseVersion();
    }

    protected City addCity(City city) {
        city.setCreatedDate(new Date());
        cityMapper.add(city);
        return city;
    }

    @Override
    public List<ExtendedCity> listCitys(CityQuery qo) {
        return cityMapper.query(qo);
    }

    @Override
    public ExtendedCity queryOneCity(CityQuery qo) {
        qo.setPageSize(1);
        List<ExtendedCity> datas = cityMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedCity> queryCitys(CityQuery qo) {
        int rows = cityMapper.count(qo);
        List<ExtendedCity> datas = ((rows == 0)?new ArrayList<ExtendedCity>():cityMapper.query(qo));
        return new Pagination<ExtendedCity>(rows, datas);
    }

    @Override
    public int countCitys(CityQuery qo) {
        return cityMapper.count(qo);
    }

}
