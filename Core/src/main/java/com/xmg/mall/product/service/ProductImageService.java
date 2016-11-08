
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductImage;
import com.xmg.mall.product.qo.ProductImageQuery;
import com.xmg.mall.product.vo.ExtendedProductImage;

public interface ProductImageService {


    public ProductImage getProductImage(Long id);

    public ExtendedProductImage queryOneProductImage(ProductImageQuery qo);

    public List<ExtendedProductImage> listProductImages(ProductImageQuery qo);

    public Pagination<ExtendedProductImage> queryProductImages(ProductImageQuery qo);

    public int countProductImages(ProductImageQuery qo);

}
