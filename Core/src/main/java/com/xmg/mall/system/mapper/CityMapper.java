
package com.xmg.mall.system.mapper;

import java.util.List;
import com.xmg.mall.system.domain.City;
import com.xmg.mall.system.qo.CityQuery;
import com.xmg.mall.system.vo.ExtendedCity;

public interface CityMapper {


    public City get(Long id);

    public int update(City city);

    public int add(City city);

    public int delete(Long id);

    public int count(CityQuery qo);

    public List<ExtendedCity> query(CityQuery qo);

}
