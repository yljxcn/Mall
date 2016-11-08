
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductDescription;
import com.xmg.mall.product.qo.ProductDescriptionQuery;
import com.xmg.mall.product.vo.ExtendedProductDescription;

public interface ProductDescriptionService {


    public ProductDescription getProductDescription(Long id);

    public ExtendedProductDescription queryOneProductDescription(ProductDescriptionQuery qo);

    public List<ExtendedProductDescription> listProductDescriptions(ProductDescriptionQuery qo);

    public Pagination<ExtendedProductDescription> queryProductDescriptions(ProductDescriptionQuery qo);

    public int countProductDescriptions(ProductDescriptionQuery qo);

}
