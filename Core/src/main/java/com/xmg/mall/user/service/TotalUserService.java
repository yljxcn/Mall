
package com.xmg.mall.user.service;

import java.util.List;
import com.xmg.mall.user.qo.TotalUserQuery;
import com.xmg.mall.user.vo.TotalUser;

public interface TotalUserService {


    public List<TotalUser> query(TotalUserQuery qo);

    public TotalUser queryOne(TotalUserQuery qo);

}
