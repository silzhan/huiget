/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member.account.validator;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.huiget.mall.web.form.member.account.ModifyTransPasswordForm;

/**
 * 
 * @author yaofang
 * @version $Id: ModifyTransPasswordFormValidator.java, v 0.1 2014年10月6日 下午9:37:06 yaofang Exp $
 */
@Component
public class ModifyTransPasswordFormValidator {

    public void validate(ModifyTransPasswordForm form, String transPassword) {
        if (StringUtils.isBlank(form.getOldPassword())) {
            form.putError("oldPassword", "请输入旧支付密码");
        } else {
            if (!StringUtils.equals(transPassword, DigestUtils.md5Hex(form.getOldPassword()))) {
                form.putError("oldPassword", "旧支付密码不正确");
            }
        }

        String password = form.getPassword();
        if (StringUtils.isBlank(password)) {
            form.putError("password", "请输入支付密码");
        } else if (password.length() < 6 || password.length() > 20) {
            form.putError("password", "密码由6-20个数字、字母组成");
        }

        String confirmPassword = form.getConfirmPassword();
        if (StringUtils.isBlank(confirmPassword)) {
            form.putError("confirmPassword", "请输入确认支付密码");
        } else if (!StringUtils.equals(password, confirmPassword)) {
            form.putError("confirmPassword", "两次输入的不一致，请重新输入");
        }
    }

}
