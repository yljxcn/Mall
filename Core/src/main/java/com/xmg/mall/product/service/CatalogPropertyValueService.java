
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.CatalogPropertyValue;
import com.xmg.mall.product.qo.CatalogPropertyValueQuery;
import com.xmg.mall.product.vo.ExtendedCatalogPropertyValue;

public interface CatalogPropertyValueService {


    public CatalogPropertyValue getCatalogPropertyValue(Long id);

    public ExtendedCatalogPropertyValue queryOneCatalogPropertyValue(CatalogPropertyValueQuery qo);

    public List<ExtendedCatalogPropertyValue> listCatalogPropertyValues(CatalogPropertyValueQuery qo);

    public Pagination<ExtendedCatalogPropertyValue> queryCatalogPropertyValues(CatalogPropertyValueQuery qo);

    public int countCatalogPropertyValues(CatalogPropertyValueQuery qo);

}
