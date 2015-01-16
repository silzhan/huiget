/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import com.huiget.mall.common.dal.entity.DeliverAddress;

/**
 * 
 * @author yaofang
 * @version $Id: DeliverAddressMapper.java, v 0.1 2014年10月5日 上午8:34:25 yaofang Exp $
 */
public interface DeliverAddressMapper extends BaseMapper {

    /**
     * 根据用户id查询收货地址
     * 
     * @param userId
     * @return
     */
    public List<DeliverAddress> queryDeliverAddressByUserId(int userId);

    /**
     * 根据用户id查询默认收货地址
     * 
     * @param userId
     * @return
     */
    public DeliverAddress queryDefaultDeliverAddressByUserId(int userId);

    /**
     * 更新默认收货地址标志
     * 
     * @param deliverAddress
     */
    public void updateDefaultStatus(DeliverAddress deliverAddress);

}
