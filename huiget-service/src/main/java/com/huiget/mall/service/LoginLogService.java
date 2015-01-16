/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.entity.LoginLog;
import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.LoginLogMapper;

/**
 * 
 * @author yaofang
 * @version $Id: LoginLogService.java, v 0.1 2014年10月4日 下午7:25:05 yaofang Exp $
 */
@Service
public class LoginLogService extends BaseSevice {

    @Autowired
    private LoginLogMapper loginLogMapper;

    public List<LoginLog> findLoginLogByUserId(int userId) {
        return loginLogMapper.queryByUserId(userId);
    }

    public int countByUserId(int userId) {
        return loginLogMapper.countByUserId(userId);
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return loginLogMapper;
    }

}
