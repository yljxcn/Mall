
package com.xmg.mall.system.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.system.domain.Province;
import com.xmg.mall.system.qo.ProvinceQuery;
import com.xmg.mall.system.vo.ExtendedProvince;

public interface ProvinceService {


    public Province getProvince(Long id);

    public ExtendedProvince queryOneProvince(ProvinceQuery qo);

    public List<ExtendedProvince> listProvinces(ProvinceQuery qo);

    public Pagination<ExtendedProvince> queryProvinces(ProvinceQuery qo);

    public int countProvinces(ProvinceQuery qo);

}
