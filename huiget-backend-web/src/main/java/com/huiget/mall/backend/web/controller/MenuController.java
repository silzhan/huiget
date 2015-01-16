/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.backend.web.form.MenuForm;
import com.huiget.mall.common.dal.entity.Menu;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.MenuService;

/**
 * 
 * @author yaofang
 * @version $Id: MenuController.java, v 0.1 2014年9月26日 上午11:15:36 yaofang Exp $
 */
@Controller
@RequestMapping("/menu/")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "list")
    public String list(@ModelAttribute("form") MenuForm form) {
        int count = menuService.count();
        form.setCount(count);

        if (count > 0) {
            int pageSize = form.getPageSize();
            form.setMenus(menuService.findForPage(pageSize, form.getPageNumber(), Menu.class));

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        }

        return "menu/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("form") MenuForm form) {
        form.setMenus(menuService.findAll(Menu.class));

        return "menu/add";
    }

    @RequestMapping(value = "add.json", method = RequestMethod.POST)
    public Map<String, String> doAdd(@ModelAttribute("form") MenuForm form) {
        Map<String, String> result = new HashMap<String, String>();

        if (form.hasError()) {
            result.putAll(form.getErrors());
            result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
        } else {
            Menu menu = new Menu();
            menu.setId(menuService.findNextId(form.getParentId()));
            form.formToMenu(menu);

            menuService.add(menu);
            result.put(Constants.RESULT_KEY_STATUS, Constants.RESULT_VAL_STATUS_200);
        }

        return result;
    }

}
