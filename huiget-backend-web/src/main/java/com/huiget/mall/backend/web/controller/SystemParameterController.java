/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.controller;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.backend.web.form.SystemParameterForm;
import com.huiget.mall.common.dal.entity.SystemParameter;
import com.huiget.mall.common.util.constants.SystemParameterType;
import com.huiget.mall.service.SystemParameterService;

/**
 * 
 * @author yaofang
 * @version $Id: SystemParameterController.java, v 0.1 2014年9月24日 上午9:58:07 yaofang Exp $
 */
@Controller
@RequestMapping("/system-parameter/")
public class SystemParameterController {

    @Autowired
    private SystemParameterService systemParameterService;

    @RequestMapping(value = "list")
    public String list(@ModelAttribute("form") SystemParameterForm form) {
        Map<String, String> paramTypeMap = SystemParameterType.toMap();
        form.setParamTypeMap(paramTypeMap);
        form.setParamType(StringUtils.isBlank(form.getParamType()) ? paramTypeMap.keySet().iterator().next() : form.getParamType());

        int count = systemParameterService.countByParamType(form.getParamType());

        form.setCount(count);
        if (count > 0) {
            int pageSize = form.getPageSize();
            form.setSystemParameters(systemParameterService.findSystemParameters(form.getParamType(), form.getPageSize(), form.getPageNumber()));

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        }

        return "system-parameter/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("form") SystemParameterForm form) {
        form.setParamTypeMap(SystemParameterType.toMap());

        return "system-parameter/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String doAdd(@ModelAttribute("form") SystemParameterForm form) {
        if (form.hasError()) {
            form.setParamTypeMap(SystemParameterType.toMap());

            return "system-parameter/add";
        }

        SystemParameter systemParameter = new SystemParameter();
        form.formToSystemParameter(systemParameter);

        systemParameterService.add(systemParameter);

        return "redirect:/system-parameter/list";
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(@ModelAttribute("form") SystemParameterForm form) {
        return "system-parameter/list";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String doEdit(@ModelAttribute("form") SystemParameterForm form) {
        return "system-parameter/list";
    }

}
