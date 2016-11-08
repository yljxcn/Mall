
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalCatalogQuery;
import com.xmg.mall.product.vo.TotalCatalog;

public interface TotalCatalogService {


    public List<TotalCatalog> query(TotalCatalogQuery qo);

    public TotalCatalog queryOne(TotalCatalogQuery qo);

}
