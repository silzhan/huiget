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

import com.huiget.mall.backend.web.form.AuthForm;
import com.huiget.mall.common.dal.entity.Auth;
import com.huiget.mall.common.dal.entity.Menu;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.AuthService;
import com.huiget.mall.service.MenuService;

/**
 * 
 * @author yaofang
 * @version $Id: AuthController.java, v 0.1 2014年9月26日 上午10:30:50 yaofang Exp $
 */
@Controller
@RequestMapping("/auth/")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "list")
    public String list(@ModelAttribute("form") AuthForm form) {
        int count = authService.count();
        form.setCount(count);

        if (count > 0) {
            int pageSize = form.getPageSize();
            form.setAuths(authService.findForPage(pageSize, form.getPageNumber(), Auth.class));

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        }

        return "auth/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("form") AuthForm form) {
        form.setMenus(menuService.findAll(Menu.class));

        return "auth/add";
    }

    @RequestMapping(value = "add.json", method = RequestMethod.POST)
    public Map<String, String> doAdd(@ModelAttribute("form") AuthForm form) {
        Map<String, String> result = new HashMap<String, String>();

        if (form.hasError()) {
            result.putAll(form.getErrors());
            result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
        } else {
            Auth auth = new Auth();
            form.formToAuth(auth);

            authService.add(auth);
            result.put(Constants.RESULT_KEY_STATUS, Constants.RESULT_VAL_STATUS_200);
        }

        return result;
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(@ModelAttribute("form") AuthForm form) {
        return "auth/list";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String doEdit(@ModelAttribute("form") AuthForm form) {
        return "auth/list";
    }

}
