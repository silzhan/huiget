/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.common.dal.entity.Channel;
import com.huiget.mall.common.dal.entity.Product;
import com.huiget.mall.service.ChannelService;
import com.huiget.mall.service.ProductService;
import com.huiget.mall.web.form.IndexForm;

/**
 * 
 * @author yaofang
 * @version $Id: IndexController.java, v 0.1 2014年9月18日 下午12:22:23 yaofang Exp $
 */
@Controller
public class IndexController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ChannelService channelService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(@ModelAttribute("form") IndexForm form) {

        Map<String, Channel> allChannel = channelService.getAllChannel();
        form.setAllChannel(allChannel);

        Map<String, List<Product>> productsByChannel = new LinkedHashMap<String, List<Product>>();
        for (String channel : allChannel.keySet()) {
            productsByChannel.put(channel, productService.findProductsForIndex(channel, 0, 16));
        }
        form.setProductsByChannel(productsByChannel);

        return "index";
    }
}
