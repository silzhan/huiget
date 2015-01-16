/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member.trade;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.web.form.member.trade.RecommendForm;

/**
 * 
 * @author yaofang
 * @version $Id: RecommendController.java, v 0.1 2014年10月7日 下午2:48:18 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/trade/")
public class RecommendController {

    @RequestMapping(value = "/recommend", method = RequestMethod.GET)
    public String recommend(@ModelAttribute("form") RecommendForm form) {

        return "member/trade/recommend";

    }

}
