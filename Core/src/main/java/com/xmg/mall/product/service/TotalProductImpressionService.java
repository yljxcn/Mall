
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductImpressionQuery;
import com.xmg.mall.product.vo.TotalProductImpression;

public interface TotalProductImpressionService {


    public List<TotalProductImpression> query(TotalProductImpressionQuery qo);

    public TotalProductImpression queryOne(TotalProductImpressionQuery qo);

}
