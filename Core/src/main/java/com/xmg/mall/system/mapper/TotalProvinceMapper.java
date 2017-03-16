
package com.xmg.mall.system.mapper;

import java.util.List;
import com.xmg.mall.system.qo.TotalProvinceQuery;
import com.xmg.mall.system.vo.TotalProvince;

public interface TotalProvinceMapper {


    public List<TotalProvince> query(TotalProvinceQuery qo);

}
