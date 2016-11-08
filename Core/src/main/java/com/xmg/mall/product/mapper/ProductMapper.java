
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.Product;
import com.xmg.mall.product.qo.ProductQuery;
import com.xmg.mall.product.vo.ExtendedProduct;

public interface ProductMapper {


    public Product get(Long id);

    public int update(Product product);

    public int add(Product product);

    public int delete(Long id);

    public int count(ProductQuery qo);

    public List<ExtendedProduct> query(ProductQuery qo);

}
