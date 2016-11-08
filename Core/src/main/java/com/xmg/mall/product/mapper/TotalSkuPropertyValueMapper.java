
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalSkuPropertyValueQuery;
import com.xmg.mall.product.vo.TotalSkuPropertyValue;

public interface TotalSkuPropertyValueMapper {


    public List<TotalSkuPropertyValue> query(TotalSkuPropertyValueQuery qo);

}
