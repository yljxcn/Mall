
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductImage;
import com.xmg.mall.product.qo.ProductImageQuery;
import com.xmg.mall.product.vo.ExtendedProductImage;

public interface ProductImageService {


    ProductImage getProductImage(Long id);

    ExtendedProductImage queryOneProductImage(ProductImageQuery qo);

    List<ExtendedProductImage> listProductImages(ProductImageQuery qo);

    Pagination<ExtendedProductImage> queryProductImages(ProductImageQuery qo);

    int countProductImages(ProductImageQuery qo);

    void save(ProductImage productImage);

    void update(ProductImage productImage);
}
