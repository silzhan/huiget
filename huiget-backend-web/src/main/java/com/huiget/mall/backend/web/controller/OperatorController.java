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

import com.huiget.mall.backend.web.form.OperatorForm;
import com.huiget.mall.common.dal.entity.Operator;
import com.huiget.mall.common.dal.entity.Role;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.OperatorService;
import com.huiget.mall.service.RoleService;

/**
 * 
 * @author yaofang
 * @version $Id: OperatorController.java, v 0.1 2014年9月26日 下午2:29:07 yaofang Exp $
 */
@Controller
@RequestMapping("/operator/")
public class OperatorController {

    @Autowired
    private OperatorService operatorService;

    @Autowired
    private RoleService     roleService;

    @RequestMapping(value = "list")
    public String list(@ModelAttribute("form") OperatorForm form) {
        int count = roleService.count();
        form.setCount(count);

        if (count > 0) {
            int pageSize = form.getPageSize();
            form.setOperators(operatorService.findForPage(pageSize, form.getPageNumber(), Operator.class));

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        }

        return "operator/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("form") OperatorForm form) {
        form.setRoles(roleService.findAll(Role.class));

        return "operator/add";
    }

    @RequestMapping(value = "add.json", method = RequestMethod.POST)
    public Map<String, String> doAdd(@ModelAttribute("form") OperatorForm form) {
        Map<String, String> result = new HashMap<String, String>();

        if (form.hasError()) {
            result.putAll(form.getErrors());
            result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
        } else {
            Operator operator = new Operator();
            form.formToOperator(operator);

            operatorService.add(operator);
            result.put(Constants.RESULT_KEY_STATUS, Constants.RESULT_VAL_STATUS_200);
        }

        return result;
    }

}
