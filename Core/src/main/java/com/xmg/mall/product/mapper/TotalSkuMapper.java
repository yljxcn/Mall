
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalSkuQuery;
import com.xmg.mall.product.vo.TotalSku;

public interface TotalSkuMapper {


    public List<TotalSku> query(TotalSkuQuery qo);

}
