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

import com.huiget.mall.web.form.member.trade.CartForm;

/**
 * 
 * @author yaofang
 * @version $Id: CartController.java, v 0.1 2014年10月4日 上午8:27:37 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/trade/")
public class CartController {

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String cart(@ModelAttribute("form") CartForm form) {

        return "member/trade/cart";

    }

}
