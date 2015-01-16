/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.web.form.member.FindPasswordForm;

/**
 * 
 * @author yaofang
 * @version $Id: FindPasswordController.java, v 0.1 2014年10月3日 上午10:20:21 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/")
public class FindPasswordController {

    @RequestMapping(value = "/find-password", method = RequestMethod.GET)
    public String findPassword(@ModelAttribute("form") FindPasswordForm form) {

        return "member/find-password";

    }

    @RequestMapping(value = "/find-password", method = RequestMethod.POST)
    public String doFindPassword(@ModelAttribute("form") FindPasswordForm form) {

        return "login";

    }

    @RequestMapping(value = "/find-password-validate", method = RequestMethod.GET)
    public String findPasswordValidate(@ModelAttribute("form") FindPasswordForm form) {

        return "member/find-password-validate";

    }

    @RequestMapping(value = "/find-password-validate", method = RequestMethod.POST)
    public String doFindPasswordValidate(@ModelAttribute("form") FindPasswordForm form) {

        return "login";

    }

}
