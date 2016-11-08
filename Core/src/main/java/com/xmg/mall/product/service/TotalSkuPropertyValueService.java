
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalSkuPropertyValueQuery;
import com.xmg.mall.product.vo.TotalSkuPropertyValue;

public interface TotalSkuPropertyValueService {


    public List<TotalSkuPropertyValue> query(TotalSkuPropertyValueQuery qo);

    public TotalSkuPropertyValue queryOne(TotalSkuPropertyValueQuery qo);

}
