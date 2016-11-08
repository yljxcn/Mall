
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalBrandQuery;
import com.xmg.mall.product.vo.TotalBrand;

public interface TotalBrandService {


    public List<TotalBrand> query(TotalBrandQuery qo);

    public TotalBrand queryOne(TotalBrandQuery qo);

}
