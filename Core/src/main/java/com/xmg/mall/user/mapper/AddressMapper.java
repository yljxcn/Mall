
package com.xmg.mall.user.mapper;

import java.util.List;
import com.xmg.mall.user.domain.Address;
import com.xmg.mall.user.qo.AddressQuery;
import com.xmg.mall.user.vo.ExtendedAddress;

public interface AddressMapper {


    public Address get(Long id);

    public int update(Address address);

    public int add(Address address);

    public int delete(Long id);

    public int count(AddressQuery qo);

    public List<ExtendedAddress> query(AddressQuery qo);

}
