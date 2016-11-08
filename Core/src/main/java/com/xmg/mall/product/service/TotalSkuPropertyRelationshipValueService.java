
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalSkuPropertyRelationshipValueQuery;
import com.xmg.mall.product.vo.TotalSkuPropertyRelationshipValue;

public interface TotalSkuPropertyRelationshipValueService {


    public List<TotalSkuPropertyRelationshipValue> query(TotalSkuPropertyRelationshipValueQuery qo);

    public TotalSkuPropertyRelationshipValue queryOne(TotalSkuPropertyRelationshipValueQuery qo);

}
