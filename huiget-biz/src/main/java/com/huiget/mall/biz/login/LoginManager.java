/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.biz.login;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huiget.mall.common.dal.entity.LoginInfo;
import com.huiget.mall.common.dal.entity.LoginLog;
import com.huiget.mall.service.LoginLogService;
import com.huiget.mall.service.LoginService;

/**
 * 
 * @author yaofang
 * @version $Id: LoginManager.java, v 0.1 2014年10月4日 下午9:13:27 yaofang Exp $
 */
@Component
public class LoginManager {

    @Autowired
    private LoginService    loginService;

    @Autowired
    private LoginLogService loginLogService;

    public void txLogin(LoginInfo loginInfo, String loginIp, String loginAddress) {
        Date date = new Date();
        loginService.modifyLastLoginTime(loginInfo.getId(), date);

        LoginLog loginLog = new LoginLog();
        loginLog.setLoginAddress(loginAddress);
        loginLog.setLoginId(loginInfo.getId());
        loginLog.setLoginIp(loginIp);
        loginLog.setLoginTime(date);
        loginLog.setLoginType(loginInfo.getLoginType());
        loginLog.setUserId(loginInfo.getUserId());

        loginLogService.add(loginLog);
    }

}
