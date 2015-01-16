/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huiget.mall.web.form.member.NoticeForm;

/**
 * 
 * @author yaofang
 * @version $Id: NoticeController.java, v 0.1 2014年10月6日 下午1:28:35 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/")
public class NoticeController {

    @RequestMapping(value = "/notice")
    public String notice(@ModelAttribute("form") NoticeForm form) {

        return "member/notice";

    }

}
