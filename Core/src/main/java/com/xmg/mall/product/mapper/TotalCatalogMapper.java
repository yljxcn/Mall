
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalCatalogQuery;
import com.xmg.mall.product.vo.TotalCatalog;

public interface TotalCatalogMapper {


    public List<TotalCatalog> query(TotalCatalogQuery qo);

}
