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

import com.huiget.mall.biz.register.RegisterManager;
import com.huiget.mall.common.dal.entity.LoginInfo;
import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.common.util.CookieUtil;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.LoginService;
import com.huiget.mall.service.UserService;
import com.huiget.mall.web.form.member.RegisterForm;

/**
 * 
 * @author yaofang
 * @version $Id: RegisterController.java, v 0.1 2014年10月3日 上午10:01:59 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/")
public class RegisterController {

    @Autowired
    private RegisterManager registerManager;

    @Autowired
    private UserService     userService;

    @Autowired
    private LoginService    loginService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(@ModelAttribute("form") RegisterForm form) {

        return "member/register";

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegister(@ModelAttribute("form") RegisterForm form, HttpServletRequest request, HttpServletResponse response) {
        if (form.hasError()) {
            return "member/register";
        }

        registerManager.txRegister(StringUtils.lowerCase(form.getUserName()), DigestUtils.md5Hex(form.getPassword()), form.getWebContext().getIp());

        // 注册后自动登录
        LoginInfo loginInfo = loginService.findLoginInfoByUserName(form.getUserName());
        User user = null;
        if (loginInfo != null && (user = userService.findById(loginInfo.getUserId())) != null) {
            CookieUtil cookieUtil = new CookieUtil(request, response);
            cookieUtil.setCookie(Constants.COOKIE_CONTEXT_ID, user.getId() + ":" + loginInfo.getId());

            cookieUtil.setCookie(Constants.COOKIE_USER_NAME, form.getUserName(), 7 * 24 * 3600);
        }

        return "redirect:/";
    }

}
