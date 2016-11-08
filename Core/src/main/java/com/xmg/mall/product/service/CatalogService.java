
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.qo.CatalogQuery;
import com.xmg.mall.product.vo.ExtendedCatalog;

public interface CatalogService {


    public Catalog getCatalog(Long id);

    public ExtendedCatalog queryOneCatalog(CatalogQuery qo);

    public List<ExtendedCatalog> listCatalogs(CatalogQuery qo);

    public Pagination<ExtendedCatalog> queryCatalogs(CatalogQuery qo);

    public int countCatalogs(CatalogQuery qo);

}
