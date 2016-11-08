
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductCatalogPropertyValueQuery;
import com.xmg.mall.product.vo.TotalProductCatalogPropertyValue;

public interface TotalProductCatalogPropertyValueMapper {


    public List<TotalProductCatalogPropertyValue> query(TotalProductCatalogPropertyValueQuery qo);

}
