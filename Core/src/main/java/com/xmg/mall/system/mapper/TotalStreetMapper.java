
package com.xmg.mall.system.mapper;

import java.util.List;
import com.xmg.mall.system.qo.TotalStreetQuery;
import com.xmg.mall.system.vo.TotalStreet;

public interface TotalStreetMapper {


    public List<TotalStreet> query(TotalStreetQuery qo);

}
