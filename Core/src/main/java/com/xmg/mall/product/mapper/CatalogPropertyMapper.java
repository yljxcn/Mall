
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.CatalogProperty;
import com.xmg.mall.product.qo.CatalogPropertyQuery;
import com.xmg.mall.product.vo.ExtendedCatalogProperty;

public interface CatalogPropertyMapper {


    public CatalogProperty get(Long id);

    public int update(CatalogProperty catalogProperty);

    public int add(CatalogProperty catalogProperty);

    public int delete(Long id);

    public int count(CatalogPropertyQuery qo);

    public List<ExtendedCatalogProperty> query(CatalogPropertyQuery qo);

}
