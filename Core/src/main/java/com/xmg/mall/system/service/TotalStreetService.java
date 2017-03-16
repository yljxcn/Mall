
package com.xmg.mall.system.service;

import java.util.List;
import com.xmg.mall.system.qo.TotalStreetQuery;
import com.xmg.mall.system.vo.TotalStreet;

public interface TotalStreetService {


    public List<TotalStreet> query(TotalStreetQuery qo);

    public TotalStreet queryOne(TotalStreetQuery qo);

}
