
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductImpressionQuery;
import com.xmg.mall.product.vo.TotalProductImpression;

public interface TotalProductImpressionMapper {


    public List<TotalProductImpression> query(TotalProductImpressionQuery qo);

}
