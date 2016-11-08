
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalCatalogPropertyValueQuery;
import com.xmg.mall.product.vo.TotalCatalogPropertyValue;

public interface TotalCatalogPropertyValueMapper {


    public List<TotalCatalogPropertyValue> query(TotalCatalogPropertyValueQuery qo);

}
