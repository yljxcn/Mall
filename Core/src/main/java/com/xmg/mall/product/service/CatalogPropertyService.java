
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.CatalogProperty;
import com.xmg.mall.product.qo.CatalogPropertyQuery;
import com.xmg.mall.product.vo.ExtendedCatalogProperty;

public interface CatalogPropertyService {


    public CatalogProperty getCatalogProperty(Long id);

    public ExtendedCatalogProperty queryOneCatalogProperty(CatalogPropertyQuery qo);

    public List<ExtendedCatalogProperty> listCatalogPropertys(CatalogPropertyQuery qo);

    public Pagination<ExtendedCatalogProperty> queryCatalogPropertys(CatalogPropertyQuery qo);

    public int countCatalogPropertys(CatalogPropertyQuery qo);

}
