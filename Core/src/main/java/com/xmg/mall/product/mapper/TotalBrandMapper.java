
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalBrandQuery;
import com.xmg.mall.product.vo.TotalBrand;

public interface TotalBrandMapper {


    public List<TotalBrand> query(TotalBrandQuery qo);

}
