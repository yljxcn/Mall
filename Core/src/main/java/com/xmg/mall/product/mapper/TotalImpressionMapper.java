
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalImpressionQuery;
import com.xmg.mall.product.vo.TotalImpression;

public interface TotalImpressionMapper {


    public List<TotalImpression> query(TotalImpressionQuery qo);

}
