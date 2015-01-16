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

import com.huiget.mall.web.form.member.trade.FavoriteForm;

/**
 * 
 * @author yaofang
 * @version $Id: FavoriteController.java, v 0.1 2014年10月3日 下午8:38:43 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/trade/")
public class FavoriteController {

    @RequestMapping(value = "/favorites", method = RequestMethod.GET)
    public String favorites(@ModelAttribute("form") FavoriteForm form) {

        return "member/trade/favorites";

    }

}
