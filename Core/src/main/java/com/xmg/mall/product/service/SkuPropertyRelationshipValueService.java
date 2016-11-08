
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.SkuPropertyRelationshipValue;
import com.xmg.mall.product.qo.SkuPropertyRelationshipValueQuery;
import com.xmg.mall.product.vo.ExtendedSkuPropertyRelationshipValue;

public interface SkuPropertyRelationshipValueService {


    public SkuPropertyRelationshipValue getSkuPropertyRelationshipValue(Long id);

    public ExtendedSkuPropertyRelationshipValue queryOneSkuPropertyRelationshipValue(SkuPropertyRelationshipValueQuery qo);

    public List<ExtendedSkuPropertyRelationshipValue> listSkuPropertyRelationshipValues(SkuPropertyRelationshipValueQuery qo);

    public Pagination<ExtendedSkuPropertyRelationshipValue> querySkuPropertyRelationshipValues(SkuPropertyRelationshipValueQuery qo);

    public int countSkuPropertyRelationshipValues(SkuPropertyRelationshipValueQuery qo);

}
