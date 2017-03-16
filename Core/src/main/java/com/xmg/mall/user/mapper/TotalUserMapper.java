
package com.xmg.mall.user.mapper;

import java.util.List;
import com.xmg.mall.user.qo.TotalUserQuery;
import com.xmg.mall.user.vo.TotalUser;

public interface TotalUserMapper {


    public List<TotalUser> query(TotalUserQuery qo);

}
