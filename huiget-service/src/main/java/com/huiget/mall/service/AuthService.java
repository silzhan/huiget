/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.mapper.AuthMapper;
import com.huiget.mall.common.dal.mapper.BaseMapper;

/**
 * 
 * @author yaofang
 * @version $Id: AuthInfoService.java, v 0.1 2014年9月25日 下午6:04:16 yaofang Exp $
 */
@Service
public class AuthService extends BaseSevice {

    @Autowired
    private AuthMapper authInfoMapper;

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return authInfoMapper;
    }

}
