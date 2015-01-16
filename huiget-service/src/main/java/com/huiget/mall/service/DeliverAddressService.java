/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.entity.DeliverAddress;
import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.DeliverAddressMapper;

/**
 * 
 * @author yaofang
 * @version $Id: DeliverAddressService.java, v 0.1 2014年10月5日 上午8:42:18 yaofang Exp $
 */
@Service
public class DeliverAddressService extends BaseSevice {

    @Autowired
    private DeliverAddressMapper deliverAddressMapper;

    public List<DeliverAddress> findDeliverAddressByUserId(int userId) {
        return deliverAddressMapper.queryDeliverAddressByUserId(userId);
    }

    public DeliverAddress findDefaultDeliverAddressByUserId(int userId) {
        return deliverAddressMapper.queryDefaultDeliverAddressByUserId(userId);
    }

    public void modifyDefaultStatus(int id, int userId, String defaultStatus) {
        DeliverAddress deliverAddress = new DeliverAddress();
        deliverAddress.setId(id);
        deliverAddress.setUserId(userId);
        deliverAddress.setDefaultStatus(defaultStatus);
        deliverAddress.setLastUpdateTime(new Date());

        deliverAddressMapper.updateDefaultStatus(deliverAddress);
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return deliverAddressMapper;
    }

}
