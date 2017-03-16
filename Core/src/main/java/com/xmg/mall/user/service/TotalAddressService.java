
package com.xmg.mall.user.service;

import java.util.List;
import com.xmg.mall.user.qo.TotalAddressQuery;
import com.xmg.mall.user.vo.TotalAddress;

public interface TotalAddressService {


    public List<TotalAddress> query(TotalAddressQuery qo);

    public TotalAddress queryOne(TotalAddressQuery qo);

}
