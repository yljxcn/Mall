
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.Brand;
import com.xmg.mall.product.qo.BrandQuery;
import com.xmg.mall.product.vo.ExtendedBrand;

public interface BrandMapper {


    public Brand get(Long id);

    public int update(Brand brand);

    public int add(Brand brand);

    public int delete(Long id);

    public int count(BrandQuery qo);

    public List<ExtendedBrand> query(BrandQuery qo);

}
