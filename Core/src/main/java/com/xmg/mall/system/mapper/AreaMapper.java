
package com.xmg.mall.system.mapper;

import java.util.List;
import com.xmg.mall.system.domain.Area;
import com.xmg.mall.system.qo.AreaQuery;
import com.xmg.mall.system.vo.ExtendedArea;

public interface AreaMapper {


    public Area get(Long id);

    public int update(Area area);

    public int add(Area area);

    public int delete(Long id);

    public int count(AreaQuery qo);

    public List<ExtendedArea> query(AreaQuery qo);

}
