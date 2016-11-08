
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductFreightQuery;
import com.xmg.mall.product.vo.TotalProductFreight;

public interface TotalProductFreightService {


    public List<TotalProductFreight> query(TotalProductFreightQuery qo);

    public TotalProductFreight queryOne(TotalProductFreightQuery qo);

}
