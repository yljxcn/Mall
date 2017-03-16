
package com.xmg.mall.system.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.system.domain.Area;
import com.xmg.mall.system.qo.AreaQuery;
import com.xmg.mall.system.vo.ExtendedArea;

public interface AreaService {


    public Area getArea(Long id);

    public ExtendedArea queryOneArea(AreaQuery qo);

    public List<ExtendedArea> listAreas(AreaQuery qo);

    public Pagination<ExtendedArea> queryAreas(AreaQuery qo);

    public int countAreas(AreaQuery qo);

}
