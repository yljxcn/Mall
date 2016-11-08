
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.ProductCatalogPropertyValue;
import com.xmg.mall.product.qo.ProductCatalogPropertyValueQuery;
import com.xmg.mall.product.vo.ExtendedProductCatalogPropertyValue;

public interface ProductCatalogPropertyValueService {


    public ProductCatalogPropertyValue getProductCatalogPropertyValue(Long id);

    public ExtendedProductCatalogPropertyValue queryOneProductCatalogPropertyValue(ProductCatalogPropertyValueQuery qo);

    public List<ExtendedProductCatalogPropertyValue> listProductCatalogPropertyValues(ProductCatalogPropertyValueQuery qo);

    public Pagination<ExtendedProductCatalogPropertyValue> queryProductCatalogPropertyValues(ProductCatalogPropertyValueQuery qo);

    public int countProductCatalogPropertyValues(ProductCatalogPropertyValueQuery qo);

}
