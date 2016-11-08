
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalCatalogPropertyQuery;
import com.xmg.mall.product.vo.TotalCatalogProperty;

public interface TotalCatalogPropertyService {


    public List<TotalCatalogProperty> query(TotalCatalogPropertyQuery qo);

    public TotalCatalogProperty queryOne(TotalCatalogPropertyQuery qo);

}
