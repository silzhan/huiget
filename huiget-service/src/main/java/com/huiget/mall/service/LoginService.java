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

import com.huiget.mall.common.dal.entity.LoginInfo;
import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.LoginInfoMapper;

/**
 * 
 * @author yaofang
 * @version $Id: LoginService.java, v 0.1 2014年10月4日 下午7:16:06 yaofang Exp $
 */
@Service
public class LoginService extends BaseSevice {

    @Autowired
    private LoginInfoMapper loginInfoMapper;

    public LoginInfo findLoginInfoByUserNameAndPassword(String userName, String password) {
        return loginInfoMapper.queryByUserNameAndPassword(userName, password);
    }

    public void modifyLastLoginTime(int id, Date date) {
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setId(id);
        loginInfo.setLastLoginTime(date);
        loginInfo.setLastUpdateTime(date);

        loginInfoMapper.updateLastLoginTime(loginInfo);
    }

    public List<LoginInfo> findLoginInfoByUserId(int userId) {
        return loginInfoMapper.queryByUserId(userId);
    }

    public LoginInfo findLoginInfoByUserIdAndLoginType(int userId, String loginType) {
        return loginInfoMapper.queryByUserIdAndLoginType(userId, loginType);
    }

    public boolean isUserNameExist(String userName) {
        LoginInfo loginInfo = loginInfoMapper.queryByUserName(userName);
        return loginInfo != null;
    }

    public LoginInfo findLoginInfoByUserName(String userName) {
        return loginInfoMapper.queryByUserName(userName);
    }

    public void modifyPassword(int userId, String password) {
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setPassword(password);
        loginInfo.setUserId(userId);
        loginInfo.setLastUpdateTime(new Date());

        loginInfoMapper.updatePassword(loginInfo);
    }

    public void modifyUserName(int userId, String userName, String loginType) {
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setUserName(userName);
        loginInfo.setLoginType(loginType);
        loginInfo.setUserId(userId);
        loginInfo.setLastUpdateTime(new Date());

        loginInfoMapper.updateUserName(loginInfo);
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return loginInfoMapper;
    }

}
