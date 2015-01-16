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

import com.huiget.mall.backend.web.form.RoleForm;
import com.huiget.mall.common.dal.entity.Auth;
import com.huiget.mall.common.dal.entity.Role;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.AuthService;
import com.huiget.mall.service.RoleService;

/**
 * 
 * @author yaofang
 * @version $Id: RoleController.java, v 0.1 2014年9月26日 下午2:12:10 yaofang Exp $
 */
@Controller
@RequestMapping("/role/")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private AuthService authService;

    @RequestMapping(value = "list")
    public String list(@ModelAttribute("form") RoleForm form) {
        int count = roleService.count();
        form.setCount(count);

        if (count > 0) {
            int pageSize = form.getPageSize();
            form.setRoles(roleService.findForPage(pageSize, form.getPageNumber(), Role.class));

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        }

        return "role/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("form") RoleForm form) {
        form.setAuths(authService.findAll(Auth.class));

        return "role/add";
    }

    @RequestMapping(value = "add.json", method = RequestMethod.POST)
    public Map<String, String> doAdd(@ModelAttribute("form") RoleForm form) {
        Map<String, String> result = new HashMap<String, String>();

        if (form.hasError()) {
            result.putAll(form.getErrors());
            result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
        } else {
            Role role = new Role();
            form.formToRole(role);

            roleService.add(role);
            result.put(Constants.RESULT_KEY_STATUS, Constants.RESULT_VAL_STATUS_200);
        }

        return result;
    }

}
