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
import com.huiget.mall.web.form.member.account.ValidateMobilePhoneForm;

/**
 * 
 * @author yaofang
 * @version $Id: ValidatePhoneFormValidator.java, v 0.1 2014年10月6日 下午7:44:24 yaofang Exp $
 */
@Component
public class ValidateMobilePhoneFormValidator {

    public void validate(ValidateMobilePhoneForm form, String existMobilePhone, String mobilePhoneValidated, HttpServletRequest request) {
        if (StringUtils.isBlank(form.getCheckcode())) {
            form.putError("checkcode", "请输入验证码");
        } else {
            String kaptchaCode = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);

            if (!StringUtils.equals(form.getCheckcode(), kaptchaCode)) {
                form.putError("checkcode", "验证码错误");
            }
        }

        String mobilePhone = form.getMobilePhone();
        if (!RegexUtil.isMobilePhone(mobilePhone)) {
            form.putError("mobilePhone", "请输入正确的手机格式");
        } else if (StringUtils.equalsIgnoreCase(existMobilePhone, mobilePhone) && StringUtils.equals(mobilePhoneValidated, Constants.STATUS_VALID)) {
            form.putError("mobilePhone", "输入手机已经验证通过");
        }
    }

}
