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

import com.huiget.mall.web.form.member.HomeForm;

/**
 * 
 * @author yaofang
 * @version $Id: HomeController.java, v 0.1 2014年10月3日 下午4:46:33 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/")
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(@ModelAttribute("form") HomeForm form) {

        return "member/home";

    }

}
