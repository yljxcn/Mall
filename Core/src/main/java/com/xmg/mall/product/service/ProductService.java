
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.domain.ProductCatalogPropertyValue;
import com.xmg.mall.product.domain.ProductImage;
import com.xmg.mall.product.qo.ProductQuery;
import com.xmg.mall.product.vo.ExtendedProduct;

public interface ProductService {


    Product getProduct(Long id);

    ExtendedProduct queryOneProduct(ProductQuery qo);

    List<ExtendedProduct> listProducts(ProductQuery qo);

    Pagination<ExtendedProduct> queryProducts(ProductQuery qo);

    int countProducts(ProductQuery qo);

    void save(Product product, String description, List<ProductCatalogPropertyValue> productCatalogPropertyValues, String impressions, List<ProductImage> productImages);
}
