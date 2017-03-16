
package com.xmg.mall.system.service;

import java.util.List;
import com.xmg.mall.system.qo.TotalCityQuery;
import com.xmg.mall.system.vo.TotalCity;

public interface TotalCityService {


    public List<TotalCity> query(TotalCityQuery qo);

    public TotalCity queryOne(TotalCityQuery qo);

}
