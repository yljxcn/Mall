
package com.xmg.mall.product.service;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductSkuPropertySequenceQuery;
import com.xmg.mall.product.vo.TotalProductSkuPropertySequence;

public interface TotalProductSkuPropertySequenceService {


    public List<TotalProductSkuPropertySequence> query(TotalProductSkuPropertySequenceQuery qo);

    public TotalProductSkuPropertySequence queryOne(TotalProductSkuPropertySequenceQuery qo);

}
