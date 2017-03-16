
package com.xmg.mall.system.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.system.domain.Street;
import com.xmg.mall.system.qo.StreetQuery;
import com.xmg.mall.system.vo.ExtendedStreet;

public interface StreetService {


    public Street getStreet(Long id);

    public ExtendedStreet queryOneStreet(StreetQuery qo);

    public List<ExtendedStreet> listStreets(StreetQuery qo);

    public Pagination<ExtendedStreet> queryStreets(StreetQuery qo);

    public int countStreets(StreetQuery qo);

}
