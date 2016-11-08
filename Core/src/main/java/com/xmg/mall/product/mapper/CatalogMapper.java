
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.Catalog;
import com.xmg.mall.product.qo.CatalogQuery;
import com.xmg.mall.product.vo.ExtendedCatalog;

public interface CatalogMapper {


    public Catalog get(Long id);

    public int update(Catalog catalog);

    public int add(Catalog catalog);

    public int delete(Long id);

    public int count(CatalogQuery qo);

    public List<ExtendedCatalog> query(CatalogQuery qo);

}
