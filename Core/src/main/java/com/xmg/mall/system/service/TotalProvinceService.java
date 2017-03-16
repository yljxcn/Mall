
package com.xmg.mall.system.service;

import java.util.List;
import com.xmg.mall.system.qo.TotalProvinceQuery;
import com.xmg.mall.system.vo.TotalProvince;

public interface TotalProvinceService {


    public List<TotalProvince> query(TotalProvinceQuery qo);

    public TotalProvince queryOne(TotalProvinceQuery qo);

}
