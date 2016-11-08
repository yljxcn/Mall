
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalSkuPropertyQuery;
import com.xmg.mall.product.vo.TotalSkuProperty;

public interface TotalSkuPropertyMapper {


    public List<TotalSkuProperty> query(TotalSkuPropertyQuery qo);

}
