/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.RoleMapper;

/**
 * 
 * @author yaofang
 * @version $Id: RoleInfoService.java, v 0.1 2014年9月26日 上午9:26:11 yaofang Exp $
 */
@Service
public class RoleService extends BaseSevice {

    @Autowired
    private RoleMapper roleInfoMapper;

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return roleInfoMapper;
    }

}
