
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.qo.ProductQuery;
import com.xmg.mall.product.vo.ExtendedProduct;

public interface ProductService {


    public Product getProduct(Long id);

    public ExtendedProduct queryOneProduct(ProductQuery qo);

    public List<ExtendedProduct> listProducts(ProductQuery qo);

    public Pagination<ExtendedProduct> queryProducts(ProductQuery qo);

    public int countProducts(ProductQuery qo);

}
