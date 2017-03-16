
package com.xmg.mall.system.mapper;

import java.util.List;
import com.xmg.mall.system.domain.Street;
import com.xmg.mall.system.qo.StreetQuery;
import com.xmg.mall.system.vo.ExtendedStreet;

public interface StreetMapper {


    public Street get(Long id);

    public int update(Street street);

    public int add(Street street);

    public int delete(Long id);

    public int count(StreetQuery qo);

    public List<ExtendedStreet> query(StreetQuery qo);

}
