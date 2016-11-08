
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.product.domain.SkuPropertyValue;
import com.xmg.mall.product.qo.SkuPropertyValueQuery;
import com.xmg.mall.product.vo.ExtendedSkuPropertyValue;

public interface SkuPropertyValueService {


    public SkuPropertyValue getSkuPropertyValue(Long id);

    public ExtendedSkuPropertyValue queryOneSkuPropertyValue(SkuPropertyValueQuery qo);

    public List<ExtendedSkuPropertyValue> listSkuPropertyValues(SkuPropertyValueQuery qo);

    public Pagination<ExtendedSkuPropertyValue> querySkuPropertyValues(SkuPropertyValueQuery qo);

    public int countSkuPropertyValues(SkuPropertyValueQuery qo);

}
