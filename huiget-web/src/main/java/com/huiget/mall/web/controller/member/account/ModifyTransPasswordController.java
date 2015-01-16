/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member.account;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.common.util.URLUtil;
import com.huiget.mall.service.UserService;
import com.huiget.mall.web.form.member.account.ModifyTransPasswordForm;
import com.huiget.mall.web.form.member.account.validator.ModifyTransPasswordFormValidator;

/**
 * 
 * @author yaofang
 * @version $Id: ModifyTransPasswordController.java, v 0.1 2014年10月6日 下午12:27:18 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/account/")
public class ModifyTransPasswordController {

    @Autowired
    private UserService                      userService;

    @Autowired
    private ModifyTransPasswordFormValidator validator;

    @RequestMapping(value = "/modify-trans-password", method = RequestMethod.GET)
    public String setTransPassword(@ModelAttribute("form") ModifyTransPasswordForm form) {
        User user = userService.findById(form.getWebContext().getUserId());
        form.setUser(user);
        if (StringUtils.isBlank(user.getTransPassword())) {
            return "redirect:/member/account/set-trans-password";
        }

        return "member/account/modify-trans-password";

    }

    @RequestMapping(value = "/modify-trans-password", method = RequestMethod.POST)
    public String doModifyTransPassword(@ModelAttribute("form") ModifyTransPasswordForm form) {
        User user = userService.findById(form.getWebContext().getUserId());
        form.setUser(user);
        if (StringUtils.isBlank(user.getTransPassword())) {
            return "redirect:/member/account/set-trans-password";
        }

        validator.validate(form, user.getTransPassword());

        if (form.hasError()) {
            return "member/account/modify-trans-password";
        }

        userService.modifyTransPassword(user.getId(), DigestUtils.md5Hex(form.getPassword()));

        return "redirect:/member/notice?title=" + URLUtil.encode("修改支付密码") + "&returnURI=/member/account/account-safe";
    }
}
