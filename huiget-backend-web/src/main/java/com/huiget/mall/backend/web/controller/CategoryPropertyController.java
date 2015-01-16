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

import com.huiget.mall.backend.web.form.CategoryPropertyForm;
import com.huiget.mall.common.dal.entity.Category;
import com.huiget.mall.common.dal.entity.CategoryProperty;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.CategoryPropertyService;
import com.huiget.mall.service.CategoryService;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryPropertyController.java, v 0.1 2014年9月26日 下午3:45:05 yaofang Exp $
 */
@Controller
@RequestMapping("/category-property/")
public class CategoryPropertyController {

    @Autowired
    private CategoryPropertyService categoryPropertyService;

    @Autowired
    private CategoryService         categoryService;

    @RequestMapping(value = "list")
    public String list(@ModelAttribute("form") CategoryPropertyForm form) {
        int count = categoryPropertyService.count();
        form.setCount(count);

        if (count > 0) {
            int pageSize = form.getPageSize();
            form.setCategoryProperties(categoryPropertyService.findForPage(pageSize, form.getPageNumber(), CategoryProperty.class));

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        }

        return "category-property/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("form") CategoryPropertyForm form) {
        form.setCategories(categoryService.findAll(Category.class));

        return "category-property/add";
    }

    @RequestMapping(value = "add.json", method = RequestMethod.POST)
    public Map<String, String> doAdd(@ModelAttribute("form") CategoryPropertyForm form) {
        Map<String, String> result = new HashMap<String, String>();

        if (form.hasError()) {
            result.putAll(form.getErrors());
            result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
        } else {
            CategoryProperty categoryProperty = new CategoryProperty();
            form.formToCategoryProperty(categoryProperty);

            categoryPropertyService.add(categoryProperty);
            result.put(Constants.RESULT_KEY_STATUS, Constants.RESULT_VAL_STATUS_200);
        }

        return result;
    }

}
