/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member.account;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.biz.validate.ValidateManager;
import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.common.dal.entity.ValidateInfo;
import com.huiget.mall.common.util.URLUtil;
import com.huiget.mall.common.util.ValidateCodeGenerater;
import com.huiget.mall.common.util.constants.ValidateInfoConstants;
import com.huiget.mall.service.UserService;
import com.huiget.mall.service.ValidateInfoService;
import com.huiget.mall.web.form.member.account.ValidateMobilePhoneForm;
import com.huiget.mall.web.form.member.account.validator.ValidateMobilePhoneFormValidator;

/**
 * 
 * @author yaofang
 * @version $Id: ValidatePhoneController.java, v 0.1 2014年10月6日 下午7:41:58 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/account/")
public class ValidateMobilePhoneController {

    @Autowired
    private UserService                      userService;

    @Autowired
    private ValidateInfoService              validateInfoService;

    @Autowired
    private ValidateManager                  validateManager;

    @Autowired
    private ValidateMobilePhoneFormValidator validator;

    @RequestMapping(value = "/validate-mobilephone", method = RequestMethod.GET)
    public String validateMobilePhone(@ModelAttribute("form") ValidateMobilePhoneForm form) {
        User user = userService.findById(form.getWebContext().getUserId());
        form.setUser(user);
        form.setMobilePhone(user.getMobilePhone());

        return "member/account/validate-mobilephone";

    }

    @RequestMapping(value = "/validate-mobilephone", method = RequestMethod.POST)
    public String doValidateMobilephon(@ModelAttribute("form") ValidateMobilePhoneForm form,
                                       HttpServletRequest request) {
        int userId = form.getWebContext().getUserId();
        User user = userService.findById(form.getWebContext().getUserId());

        validator.validate(form, user.getMobilePhone(), user.getMobilePhoneValidated(), request);

        if (form.hasError()) {
            return "member/account/validate-mobilephone";
        }

        // TODO 发送email

        String mobilePhone = StringUtils.lowerCase(form.getMobilePhone());
        ValidateInfo validateInfo = new ValidateInfo();
        validateInfo.setCode(ValidateCodeGenerater.generate());
        validateInfo
            .setExpireTime(ValidateInfoConstants.VALIDATE_EXPIRE_TIME_VALIDATE_MOBILE_PHONE);
        validateInfo.setTarget(mobilePhone);
        validateInfo.setType(ValidateInfoConstants.VALIDATE_TYPE_VALIDATE_MOBILE_PHONE);
        validateInfo.setUserId(userId);

        validateInfoService.add(validateInfo);

        return "redirect:/member/account/validate-mobilephone-notice?mobilePhone=" + mobilePhone;
    }

    @RequestMapping(value = "/validate-mobilephone-notice", method = RequestMethod.GET)
    public String validateMobilePhoneNotice(@ModelAttribute("form") ValidateMobilePhoneForm form) {

        return "member/account/validate-mobilephone-notice";

    }

    @RequestMapping(value = "/active-mobilephone", method = RequestMethod.POST)
    public String activeMobilePhone(@ModelAttribute("form") ValidateMobilePhoneForm form) {
        List<ValidateInfo> validateInfos = validateInfoService.findValidateInfos(form
            .getWebContext().getUserId(), form.getMobilePhone(),
            ValidateInfoConstants.VALIDATE_TYPE_VALIDATE_MOBILE_PHONE);
        ValidateInfo validateInfo = getValidValidateInfo(validateInfos, form.getCheckcode());

        User user = null;
        if (validateInfo == null || (user = userService.findById(validateInfo.getUserId())) == null) {
            form.putError("checkcode", "手机验证码不正确");

            return "member/account/validate-mobilephone-notice";
        }

        validateManager.txActiveMobilePhone(user, validateInfo);

        return "redirect:/member/notice?title=" + URLUtil.encode("验证手机");
    }

    private ValidateInfo getValidValidateInfo(List<ValidateInfo> validateInfos, String code) {
        if (CollectionUtils.isEmpty(validateInfos)) {
            return null;
        }

        for (ValidateInfo validateInfo : validateInfos) {
            if (validateInfo.valid(ValidateInfoConstants.VALIDATE_TYPE_VALIDATE_MOBILE_PHONE)
                && StringUtils.equals(validateInfo.getCode(), code)) {
                return validateInfo;
            }
        }

        return null;
    }

}
