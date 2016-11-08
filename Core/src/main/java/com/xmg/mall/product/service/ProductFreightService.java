
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductFreight;
import com.xmg.mall.product.qo.ProductFreightQuery;
import com.xmg.mall.product.vo.ExtendedProductFreight;

public interface ProductFreightService {


    public ProductFreight getProductFreight(Long id);

    public ExtendedProductFreight queryOneProductFreight(ProductFreightQuery qo);

    public List<ExtendedProductFreight> listProductFreights(ProductFreightQuery qo);

    public Pagination<ExtendedProductFreight> queryProductFreights(ProductFreightQuery qo);

    public int countProductFreights(ProductFreightQuery qo);

}
