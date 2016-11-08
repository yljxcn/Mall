
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductSkuPropertySequenceQuery;
import com.xmg.mall.product.vo.TotalProductSkuPropertySequence;

public interface TotalProductSkuPropertySequenceMapper {


    public List<TotalProductSkuPropertySequence> query(TotalProductSkuPropertySequenceQuery qo);

}
