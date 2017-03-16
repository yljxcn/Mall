
package com.xmg.mall.user.service;

import java.util.List;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.user.domain.Address;
import com.xmg.mall.user.qo.AddressQuery;
import com.xmg.mall.user.vo.ExtendedAddress;

public interface AddressService {


    public Address getAddress(Long id);

    public ExtendedAddress queryOneAddress(AddressQuery qo);

    public List<ExtendedAddress> listAddresss(AddressQuery qo);

    public Pagination<ExtendedAddress> queryAddresss(AddressQuery qo);

    public int countAddresss(AddressQuery qo);

}
