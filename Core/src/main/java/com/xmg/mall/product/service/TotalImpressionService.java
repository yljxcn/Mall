
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalImpressionQuery;
import com.xmg.mall.product.vo.TotalImpression;

public interface TotalImpressionService {


    public List<TotalImpression> query(TotalImpressionQuery qo);

    public TotalImpression queryOne(TotalImpressionQuery qo);

}
