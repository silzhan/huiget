/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member.account;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.common.util.URLUtil;
import com.huiget.mall.service.LoginService;
import com.huiget.mall.web.form.member.account.ModifyPasswordForm;
import com.huiget.mall.web.form.member.account.validator.ModifyPasswordFormValidator;

/**
 * 
 * @author yaofang
 * @version $Id: ModifyPasswordController.java, v 0.1 2014年10月3日 上午10:21:49 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/account/")
public class ModifyPasswordController {

    @Autowired
    private LoginService                loginService;

    @Autowired
    private ModifyPasswordFormValidator validator;

    @RequestMapping(value = "/modify-password", method = RequestMethod.GET)
    public String modifyPassword(@ModelAttribute("form") ModifyPasswordForm form) {

        return "member/account/modify-password";

    }

    @RequestMapping(value = "/modify-password", method = RequestMethod.POST)
    public String doModifyPassword(@ModelAttribute("form") ModifyPasswordForm form) {
        validator.validate(form);

        if (form.hasError()) {
            return "member/account/modify-password";
        }

        loginService.modifyPassword(form.getWebContext().getUserId(), DigestUtils.md5Hex(form.getPassword()));

        return "redirect:/member/notice?title=" + URLUtil.encode("修改登录密码") + "&returnURI=/member/account/account-safe";

    }

}
