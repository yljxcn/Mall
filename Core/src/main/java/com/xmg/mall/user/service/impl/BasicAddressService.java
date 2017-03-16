
package com.xmg.mall.user.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.xmg.mall.base.exception.StaleObjectStateException;
import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.user.domain.Address;
import com.xmg.mall.user.mapper.AddressMapper;
import com.xmg.mall.user.qo.AddressQuery;
import com.xmg.mall.user.service.AddressService;
import com.xmg.mall.user.vo.ExtendedAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("addressService")
public class BasicAddressService
    implements AddressService
{

    private AddressMapper addressMapper;

    @Autowired
    public void setAddressMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    @Override
    public Address getAddress(Long id) {
        return addressMapper.get(id);
    }

    protected void updateAddress(Address address) {
        int affected = addressMapper.update(address);
        if (affected == 0) {
            throw new StaleObjectStateException("version!!");
        }
        address.increaseVersion();
    }

    protected Address addAddress(Address address) {
        address.setCreatedDate(new Date());
        addressMapper.add(address);
        return address;
    }

    @Override
    public List<ExtendedAddress> listAddresss(AddressQuery qo) {
        return addressMapper.query(qo);
    }

    @Override
    public ExtendedAddress queryOneAddress(AddressQuery qo) {
        qo.setPageSize(1);
        List<ExtendedAddress> datas = addressMapper.query(qo);
        return (((datas == null)||datas.isEmpty())?null:datas.get(0));
    }

    @Override
    public Pagination<ExtendedAddress> queryAddresss(AddressQuery qo) {
        int rows = addressMapper.count(qo);
        List<ExtendedAddress> datas = ((rows == 0)?new ArrayList<ExtendedAddress>():addressMapper.query(qo));
        return new Pagination<ExtendedAddress>(rows, datas);
    }

    @Override
    public int countAddresss(AddressQuery qo) {
        return addressMapper.count(qo);
    }

}
