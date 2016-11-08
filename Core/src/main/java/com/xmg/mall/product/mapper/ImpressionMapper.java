
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.Impression;
import com.xmg.mall.product.qo.ImpressionQuery;
import com.xmg.mall.product.vo.ExtendedImpression;

public interface ImpressionMapper {


    public Impression get(Long id);

    public int update(Impression impression);

    public int add(Impression impression);

    public int delete(Long id);

    public int count(ImpressionQuery qo);

    public List<ExtendedImpression> query(ImpressionQuery qo);

}
