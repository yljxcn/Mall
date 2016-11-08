
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalCatalogPropertyQuery;
import com.xmg.mall.product.vo.TotalCatalogProperty;

public interface TotalCatalogPropertyMapper {


    public List<TotalCatalogProperty> query(TotalCatalogPropertyQuery qo);

}
