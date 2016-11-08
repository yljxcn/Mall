
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.ProductCatalogPropertyValue;
import com.xmg.mall.product.qo.ProductCatalogPropertyValueQuery;
import com.xmg.mall.product.vo.ExtendedProductCatalogPropertyValue;

public interface ProductCatalogPropertyValueMapper {


    public ProductCatalogPropertyValue get(Long id);

    public int update(ProductCatalogPropertyValue productCatalogPropertyValue);

    public int add(ProductCatalogPropertyValue productCatalogPropertyValue);

    public int delete(Long id);

    public int count(ProductCatalogPropertyValueQuery qo);

    public List<ExtendedProductCatalogPropertyValue> query(ProductCatalogPropertyValueQuery qo);

}
