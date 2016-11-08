
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.SkuPropertyRelationshipValue;
import com.xmg.mall.product.qo.SkuPropertyRelationshipValueQuery;
import com.xmg.mall.product.vo.ExtendedSkuPropertyRelationshipValue;

public interface SkuPropertyRelationshipValueMapper {


    public SkuPropertyRelationshipValue get(Long id);

    public int update(SkuPropertyRelationshipValue skuPropertyRelationshipValue);

    public int add(SkuPropertyRelationshipValue skuPropertyRelationshipValue);

    public int delete(Long id);

    public int count(SkuPropertyRelationshipValueQuery qo);

    public List<ExtendedSkuPropertyRelationshipValue> query(SkuPropertyRelationshipValueQuery qo);

}
