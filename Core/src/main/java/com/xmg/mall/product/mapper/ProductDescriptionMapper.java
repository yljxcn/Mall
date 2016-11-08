
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.ProductDescription;
import com.xmg.mall.product.qo.ProductDescriptionQuery;
import com.xmg.mall.product.vo.ExtendedProductDescription;

public interface ProductDescriptionMapper {


    public ProductDescription get(Long id);

    public int update(ProductDescription productDescription);

    public int add(ProductDescription productDescription);

    public int delete(Long id);

    public int count(ProductDescriptionQuery qo);

    public List<ExtendedProductDescription> query(ProductDescriptionQuery qo);

}
