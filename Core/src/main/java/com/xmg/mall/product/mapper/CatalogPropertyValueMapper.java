
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.CatalogPropertyValue;
import com.xmg.mall.product.qo.CatalogPropertyValueQuery;
import com.xmg.mall.product.vo.ExtendedCatalogPropertyValue;

public interface CatalogPropertyValueMapper {


    public CatalogPropertyValue get(Long id);

    public int update(CatalogPropertyValue catalogPropertyValue);

    public int add(CatalogPropertyValue catalogPropertyValue);

    public int delete(Long id);

    public int count(CatalogPropertyValueQuery qo);

    public List<ExtendedCatalogPropertyValue> query(CatalogPropertyValueQuery qo);

}
