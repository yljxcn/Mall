
package com.xmg.mall.system.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.system.domain.City;
import com.xmg.mall.system.qo.CityQuery;
import com.xmg.mall.system.vo.ExtendedCity;

public interface CityService {


    public City getCity(Long id);

    public ExtendedCity queryOneCity(CityQuery qo);

    public List<ExtendedCity> listCitys(CityQuery qo);

    public Pagination<ExtendedCity> queryCitys(CityQuery qo);

    public int countCitys(CityQuery qo);

}
