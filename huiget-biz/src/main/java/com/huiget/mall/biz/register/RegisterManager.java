/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.biz.register;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huiget.mall.common.dal.entity.Account;
import com.huiget.mall.common.dal.entity.LoginInfo;
import com.huiget.mall.common.dal.entity.LoginLog;
import com.huiget.mall.common.util.RegexUtil;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.AccountService;
import com.huiget.mall.service.LoginLogService;
import com.huiget.mall.service.LoginService;
import com.huiget.mall.service.UserService;

/**
 * 
 * @author yaofang
 * @version $Id: RegisterManager.java, v 0.1 2014年10月4日 下午8:24:46 yaofang Exp $
 */
@Component
public class RegisterManager {

    @Autowired
    private UserService     userService;

    @Autowired
    private AccountService  accountService;

    @Autowired
    private LoginService    loginService;

    @Autowired
    private LoginLogService loginLogService;

    public void txRegister(String userName, String password, String loginIp) {
        Date date = new Date();
        // 插用户表
        int userId = userService.addUser(userName);

        // 创建账户
        Account account = new Account();
        account.setUserId(userId);
        accountService.add(account);

        // 插登录信息表
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setCreator(userName);
        loginInfo.setLastLoginTime(date);
        String loginType = RegexUtil.isEmail(userName) ? Constants.LOGIN_TYPE_EMAIL : Constants.LOGIN_TYPE_MOBILE_PHONE;
        loginInfo.setLoginType(loginType);
        loginInfo.setPassword(password);
        loginInfo.setUserId(userId);
        loginInfo.setUserName(userName);

        int loginId = loginService.add(loginInfo);

        // 登记登录日志
        LoginLog loginLog = new LoginLog();
        loginLog.setLoginId(loginId);
        loginLog.setLoginIp(loginIp);
        loginLog.setLoginTime(date);
        loginLog.setLoginType(loginType);
        loginLog.setUserId(userId);

        loginLogService.add(loginLog);
    }

}
