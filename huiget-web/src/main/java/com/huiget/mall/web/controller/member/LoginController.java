/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.biz.login.LoginManager;
import com.huiget.mall.common.dal.entity.LoginInfo;
import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.common.util.CookieUtil;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.LoginService;
import com.huiget.mall.service.UserService;
import com.huiget.mall.web.form.member.LoginForm;

/**
 * 
 * @author yaofang
 * @version $Id: LoginController.java, v 0.1 2014年10月3日 上午9:45:36 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/")
public class LoginController {

    @Autowired
    private UserService  userService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginManager loginManager;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute("form") LoginForm form, HttpServletRequest request, HttpServletResponse response) {

        CookieUtil cookieUtil = new CookieUtil(request, response);
        String cookieUserName = cookieUtil.getCookie(Constants.COOKIE_USER_NAME);
        form.setUserName(cookieUserName);

        return "member/login";

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(@ModelAttribute("form") LoginForm form, HttpServletRequest request, HttpServletResponse response) {
        if (form.hasError()) {
            return "member/login";
        }

        LoginInfo loginInfo = loginService.findLoginInfoByUserNameAndPassword(form.getUserName(), DigestUtils.md5Hex(form.getPassword()));
        User user = null;
        if (loginInfo == null || (user = userService.findById(loginInfo.getUserId())) == null) {
            form.putError("userName", "用户名或密码不正确");

            return "member/login";
        }

        loginManager.txLogin(loginInfo, form.getWebContext().getIp(), null);

        CookieUtil cookieUtil = new CookieUtil(request, response);
        if (form.getRemember() == 1) {
            cookieUtil.setCookie(Constants.COOKIE_CONTEXT_ID, user.getId() + ":" + loginInfo.getId(), 7 * 24 * 3600);
        } else {
            cookieUtil.setCookie(Constants.COOKIE_CONTEXT_ID, user.getId() + ":" + loginInfo.getId());
        }

        cookieUtil.setCookie(Constants.COOKIE_USER_NAME, form.getUserName(), 7 * 24 * 3600);

        return getRedirectURL(form.getRedirectURL());

    }

    private String getRedirectURL(String redirectURL) {
        return "redirect:" + (StringUtils.isBlank(redirectURL) ? "/" : redirectURL);
    }

    @RequestMapping(value = "logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        CookieUtil cookieUtil = new CookieUtil(request, response);
        cookieUtil.removeCokie(Constants.COOKIE_CONTEXT_ID);

        return "redirect:/";
    }

}
