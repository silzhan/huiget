/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.service.UserService;
import com.huiget.mall.web.form.member.account.AccountSafeForm;

/**
 * 
 * @author yaofang
 * @version $Id: AccountSafeController.java, v 0.1 2014年10月5日 下午12:11:11 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/account/")
public class AccountSafeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/account-safe", method = RequestMethod.GET)
    public String accountSafe(@ModelAttribute("form") AccountSafeForm form) {

        User user = userService.findById(form.getWebContext().getUserId());

        form.setUser(user);

        return "member/account/account-safe";

    }

}
