
package com.xmg.mall.product.mapper;

import java.util.List;
import com.xmg.mall.product.qo.TotalProductFreightQuery;
import com.xmg.mall.product.vo.TotalProductFreight;

public interface TotalProductFreightMapper {


    public List<TotalProductFreight> query(TotalProductFreightQuery qo);

}
