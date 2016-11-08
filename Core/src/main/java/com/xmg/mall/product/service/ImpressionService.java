
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.Impression;
import com.xmg.mall.product.qo.ImpressionQuery;
import com.xmg.mall.product.vo.ExtendedImpression;

public interface ImpressionService {


    public Impression getImpression(Long id);

    public ExtendedImpression queryOneImpression(ImpressionQuery qo);

    public List<ExtendedImpression> listImpressions(ImpressionQuery qo);

    public Pagination<ExtendedImpression> queryImpressions(ImpressionQuery qo);

    public int countImpressions(ImpressionQuery qo);

}
