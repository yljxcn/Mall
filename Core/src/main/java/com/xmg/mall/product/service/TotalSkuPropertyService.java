
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalSkuPropertyQuery;
import com.xmg.mall.product.vo.TotalSkuProperty;

public interface TotalSkuPropertyService {


    public List<TotalSkuProperty> query(TotalSkuPropertyQuery qo);

    public TotalSkuProperty queryOne(TotalSkuPropertyQuery qo);

}
