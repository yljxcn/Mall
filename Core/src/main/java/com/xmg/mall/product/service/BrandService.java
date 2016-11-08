
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Brand;
import com.xmg.mall.product.qo.BrandQuery;
import com.xmg.mall.product.vo.ExtendedBrand;

public interface BrandService {


    public Brand getBrand(Long id);

    public ExtendedBrand queryOneBrand(BrandQuery qo);

    public List<ExtendedBrand> listBrands(BrandQuery qo);

    public Pagination<ExtendedBrand> queryBrands(BrandQuery qo);

    public int countBrands(BrandQuery qo);

}
