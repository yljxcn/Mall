
package com.xmg.mall.system.mapper;

import java.util.List;
import com.xmg.mall.system.qo.TotalAreaQuery;
import com.xmg.mall.system.vo.TotalArea;

public interface TotalAreaMapper {


    public List<TotalArea> query(TotalAreaQuery qo);

}
