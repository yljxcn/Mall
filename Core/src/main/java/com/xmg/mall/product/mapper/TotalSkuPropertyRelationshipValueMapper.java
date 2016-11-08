
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalSkuPropertyRelationshipValueQuery;
import com.xmg.mall.product.vo.TotalSkuPropertyRelationshipValue;

public interface TotalSkuPropertyRelationshipValueMapper {


    public List<TotalSkuPropertyRelationshipValue> query(TotalSkuPropertyRelationshipValueQuery qo);

}
