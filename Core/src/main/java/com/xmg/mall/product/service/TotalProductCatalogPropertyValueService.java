
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductCatalogPropertyValueQuery;
import com.xmg.mall.product.vo.TotalProductCatalogPropertyValue;

public interface TotalProductCatalogPropertyValueService {


    public List<TotalProductCatalogPropertyValue> query(TotalProductCatalogPropertyValueQuery qo);

    public TotalProductCatalogPropertyValue queryOne(TotalProductCatalogPropertyValueQuery qo);

}
