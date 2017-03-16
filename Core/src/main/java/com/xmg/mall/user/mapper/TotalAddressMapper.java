
package com.xmg.mall.user.mapper;

import java.util.List;
import com.xmg.mall.user.qo.TotalAddressQuery;
import com.xmg.mall.user.vo.TotalAddress;

public interface TotalAddressMapper {


    public List<TotalAddress> query(TotalAddressQuery qo);

}
