/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.backend.web.form.LoginForm;

/**
 * 
 * @author yaofang
 * @version $Id: LoginController.java, v 0.1 2014年9月24日 上午10:07:43 yaofang Exp $
 */
@Controller
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(@ModelAttribute("form") LoginForm form) {

        return "login";

    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String doLogin(@ModelAttribute("form") LoginForm form, HttpServletRequest request, HttpServletResponse response) {

        return "login";

    }

}
