/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member.account.validator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.huiget.mall.common.util.RegexUtil;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.web.form.member.account.ValidateEmailForm;
import com.huiget.mall.web.form.validator.FormValidator;

/**
 * 
 * @author yaofang
 * @version $Id: ValidateEmailFormValidator.java, v 0.1 2014年10月6日 下午6:56:14 yaofang Exp $
 */
@Component
public class ValidateEmailFormValidator extends FormValidator {

    public void validate(ValidateEmailForm form, String existEmail, String emailValidated, HttpServletRequest request) {
        if (StringUtils.isBlank(form.getCheckcode())) {
            form.putError("checkcode", "请输入验证码");
        } else {
            String kaptchaCode = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);

            if (!StringUtils.equals(form.getCheckcode(), kaptchaCode)) {
                form.putError("checkcode", "验证码错误");
            }
        }

        String email = form.getEmail();
        if (!RegexUtil.isEmail(email)) {
            form.putError("email", "请输入正确的邮箱格式");
        } else if (StringUtils.equalsIgnoreCase(existEmail, email) && StringUtils.equals(emailValidated, Constants.STATUS_VALID)) {
            form.putError("email", "输入邮箱已经验证通过");
        }
    }

}
