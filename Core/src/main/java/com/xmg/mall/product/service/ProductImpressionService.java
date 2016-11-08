
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductImpression;
import com.xmg.mall.product.qo.ProductImpressionQuery;
import com.xmg.mall.product.vo.ExtendedProductImpression;

public interface ProductImpressionService {


    public ProductImpression getProductImpression(Long id);

    public ExtendedProductImpression queryOneProductImpression(ProductImpressionQuery qo);

    public List<ExtendedProductImpression> listProductImpressions(ProductImpressionQuery qo);

    public Pagination<ExtendedProductImpression> queryProductImpressions(ProductImpressionQuery qo);

    public int countProductImpressions(ProductImpressionQuery qo);

}
