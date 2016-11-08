
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalSkuQuery;
import com.xmg.mall.product.vo.TotalSku;

public interface TotalSkuService {


    public List<TotalSku> query(TotalSkuQuery qo);

    public TotalSku queryOne(TotalSkuQuery qo);

}
