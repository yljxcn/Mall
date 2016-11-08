
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.domain.SkuPropertyValue;
import com.xmg.mall.product.qo.SkuPropertyValueQuery;
import com.xmg.mall.product.vo.ExtendedSkuPropertyValue;

public interface SkuPropertyValueMapper {


    public SkuPropertyValue get(Long id);

    public int update(SkuPropertyValue skuPropertyValue);

    public int add(SkuPropertyValue skuPropertyValue);

    public int delete(Long id);

    public int count(SkuPropertyValueQuery qo);

    public List<ExtendedSkuPropertyValue> query(SkuPropertyValueQuery qo);

}
