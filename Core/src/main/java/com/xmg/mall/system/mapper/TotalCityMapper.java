
package com.xmg.mall.system.mapper;

import java.util.List;
import com.xmg.mall.system.qo.TotalCityQuery;
import com.xmg.mall.system.vo.TotalCity;

public interface TotalCityMapper {


    public List<TotalCity> query(TotalCityQuery qo);

}
