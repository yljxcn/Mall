
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.ProductFreight;
import com.xmg.mall.product.qo.ProductFreightQuery;
import com.xmg.mall.product.vo.ExtendedProductFreight;

public interface ProductFreightMapper {


    public ProductFreight get(Long id);

    public int update(ProductFreight productFreight);

    public int add(ProductFreight productFreight);

    public int delete(Long id);

    public int count(ProductFreightQuery qo);

    public List<ExtendedProductFreight> query(ProductFreightQuery qo);

}
