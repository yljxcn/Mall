
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.ProductImpression;
import com.xmg.mall.product.qo.ProductImpressionQuery;
import com.xmg.mall.product.vo.ExtendedProductImpression;

public interface ProductImpressionMapper {


    public ProductImpression get(Long id);

    public int update(ProductImpression productImpression);

    public int add(ProductImpression productImpression);

    public int delete(Long id);

    public int count(ProductImpressionQuery qo);

    public List<ExtendedProductImpression> query(ProductImpressionQuery qo);

}
