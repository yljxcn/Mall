
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.ProductImage;
import com.xmg.mall.product.qo.ProductImageQuery;
import com.xmg.mall.product.vo.ExtendedProductImage;

public interface ProductImageMapper {


    public ProductImage get(Long id);

    public int update(ProductImage productImage);

    public int add(ProductImage productImage);

    public int delete(Long id);

    public int count(ProductImageQuery qo);

    public List<ExtendedProductImage> query(ProductImageQuery qo);

}
