
package com.xmg.mall.system.mapper;

import java.util.List;
import com.xmg.mall.system.domain.Province;
import com.xmg.mall.system.qo.ProvinceQuery;
import com.xmg.mall.system.vo.ExtendedProvince;

public interface ProvinceMapper {


    public Province get(Long id);

    public int update(Province province);

    public int add(Province province);

    public int delete(Long id);

    public int count(ProvinceQuery qo);

    public List<ExtendedProvince> query(ProvinceQuery qo);

}
