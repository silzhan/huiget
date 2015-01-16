/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.product;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.common.dal.entity.Channel;
import com.huiget.mall.service.ChannelService;
import com.huiget.mall.service.ProductService;
import com.huiget.mall.web.form.product.ProductForm;

/**
 * 
 * @author yaofang
 *
 * @version $Id: ProductController.java, v 0.1 2014年10月24日 下午11:52:53 yaofang Exp $
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ChannelService channelService;

    @RequestMapping(value = "/channel/{channelName}", method = RequestMethod.GET)
    public String channel(@ModelAttribute("form") ProductForm form) {
        Map<String, Channel> allChannel = channelService.getAllChannel();
        form.setAllChannel(allChannel);
        Channel channel = allChannel.get(form.getChannelName());
        form.setChannel(channel);
        if (channel == null) {
            return "redirect:/";
        }

        int count = productService.count(channel.getName(), form.getCategory());
        form.setCount(count);
        if (count > 0) {
            int pageSize = form.getPageSize();

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);

            form.setProducts(productService.findProductsByConditionForPage(channel.getName(), form.getCategory(), form.getPageSize(), form.getPageNumber()));

            form.setCategories(productService.findCategoryByChannel(channel.getName()));
        }

        return "product/channel";
    }

}
