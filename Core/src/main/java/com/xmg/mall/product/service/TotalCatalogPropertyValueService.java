
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalCatalogPropertyValueQuery;
import com.xmg.mall.product.vo.TotalCatalogPropertyValue;

public interface TotalCatalogPropertyValueService {


    public List<TotalCatalogPropertyValue> query(TotalCatalogPropertyValueQuery qo);

    public TotalCatalogPropertyValue queryOne(TotalCatalogPropertyValueQuery qo);

}
