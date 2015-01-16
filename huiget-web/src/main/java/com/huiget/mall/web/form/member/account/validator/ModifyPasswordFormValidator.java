/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member.account.validator;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huiget.mall.common.dal.entity.LoginInfo;
import com.huiget.mall.service.LoginService;
import com.huiget.mall.web.form.member.account.ModifyPasswordForm;

/**
 * 
 * @author yaofang
 * @version $Id: ModifyPasswordFormValidator.java, v 0.1 2014年10月6日 下午9:27:14 yaofang Exp $
 */
@Component
public class ModifyPasswordFormValidator {

    @Autowired
    private LoginService loginService;

    public void validate(ModifyPasswordForm form) {
        if (StringUtils.isBlank(form.getOldPassword())) {
            form.putError("oldPassword", "请输入旧登录密码");
        } else {
            LoginInfo loginInfo = loginService.findById(form.getWebContext().getLoginId());
            if (!StringUtils.equals(loginInfo.getPassword(),
                DigestUtils.md5Hex(form.getOldPassword()))) {
                form.putError("oldPassword", "旧登录密码不正确");
            }
        }

        String password = form.getPassword();
        if (StringUtils.isBlank(password)) {
            form.putError("password", "请输入登录密码");
        } else if (password.length() < 6 || password.length() > 20) {
            form.putError("password", "密码由6-20个数字、字母组成");
        }

        String confirmPassword = form.getConfirmPassword();
        if (StringUtils.isBlank(confirmPassword)) {
            form.putError("confirmPassword", "请输入确认登录密码");
        } else if (!StringUtils.equals(password, confirmPassword)) {
            form.putError("confirmPassword", "两次输入的不一致，请重新输入");
        }
    }

}
