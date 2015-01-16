/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.validator;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.google.code.kaptcha.Constants;
import com.huiget.mall.common.util.RegexUtil;

/**
 * 
 * @author yaofang
 * @version $Id: FormValidator.java, v 0.1 2014年10月6日 下午6:57:44 yaofang Exp $
 */
public class FormValidator {

    public Map<String, String> validateEmail(String email) {
        Map<String, String> error = new LinkedHashMap<String, String>();
        if (StringUtils.isBlank(email)) {
            error.put("email", "请输入邮箱地址");
        } else if (!RegexUtil.isEmail(email)) {
            error.put("email", "请输入正确的邮箱格式");
        }

        return error;

    }

    public Map<String, String> validateCheckcode(String checkcode, HttpServletRequest request) {
        Map<String, String> error = new LinkedHashMap<String, String>();
        if (StringUtils.isBlank(checkcode)) {
            error.put("checkcode", "请输入验证码");
        } else {
            String kaptchaCode = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);

            if (!StringUtils.equals(checkcode, kaptchaCode)) {
                error.put("checkcode", "验证码错误");
            }
        }

        return error;

    }

    public Map<String, String> validateUserName(String userName) {
        Map<String, String> error = new LinkedHashMap<String, String>();
        if (StringUtils.isBlank(userName)) {
            error.put("userName", "请输入用户名");
        } else if (!RegexUtil.isEmail(userName) || !RegexUtil.isMobilePhone(userName)) {
            error.put("userName", "请输入正确的用户名（手机/邮箱 ）格式");
        }
        return error;
    }

}
