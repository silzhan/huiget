/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.biz.deliveraddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huiget.mall.common.dal.entity.DeliverAddress;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.DeliverAddressService;

/**
 * 
 * @author yaofang
 * @version $Id: DeliverAddressManager.java, v 0.1 2014年10月5日 上午9:22:34 yaofang Exp $
 */
@Component
public class DeliverAddressManager {

    @Autowired
    private DeliverAddressService deliverAddressService;

    public void txAddDeliverAddress(DeliverAddress deliverAddress) {
        if (Constants.STATUS_VALID.equals(deliverAddress.getDefaultStatus())) {
            deliverAddressService.modifyDefaultStatus(deliverAddress.getId(), deliverAddress.getUserId(), Constants.STATUS_INVALID);
        }
        deliverAddressService.add(deliverAddress);
    }

    public void txModifyDeliverAddress(int id, DeliverAddress deliverAddress) {
        if (Constants.STATUS_VALID.equals(deliverAddress.getDefaultStatus())) {
            deliverAddressService.modifyDefaultStatus(deliverAddress.getId(), deliverAddress.getUserId(), Constants.STATUS_INVALID);
        }
        deliverAddress.setId(id);
        deliverAddressService.edit(deliverAddress);
    }

    public void txSetDefaultStatus(int id, int userId) {

        deliverAddressService.modifyDefaultStatus(0, userId, Constants.STATUS_INVALID);

        deliverAddressService.modifyDefaultStatus(id, userId, Constants.STATUS_VALID);
    }

}
