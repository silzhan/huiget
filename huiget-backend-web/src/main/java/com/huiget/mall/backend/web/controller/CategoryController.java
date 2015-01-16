/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.backend.web.form.CategoryForm;
import com.huiget.mall.backend.web.form.validator.CategoryFormValidator;
import com.huiget.mall.common.dal.entity.Category;
import com.huiget.mall.common.util.constants.BusinessConstants;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.CategoryService;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryInfoController.java, v 0.1 2014年9月24日 上午9:57:30 yaofang Exp $
 */
@Controller
@RequestMapping("/category/")
public class CategoryController {

    @Autowired
    private CategoryService       categoryService;

    @Autowired
    private CategoryFormValidator validator;

    @RequestMapping(value = "list")
    public String list(@ModelAttribute("form") CategoryForm form) {
        int count = categoryService.count();
        form.setCount(count);

        if (count > 0) {
            int pageSize = form.getPageSize();
            form.setCategories(categoryService.findForPage(pageSize, form.getPageNumber(), Category.class));

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        }

        return "category/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("form") CategoryForm form) {
        form.setCategories(categoryService.findByLevelAndStatus(BusinessConstants.CATEGORY_LEVEL_1, Constants.STATUS_VALID));

        return "category/add";
    }

    @RequestMapping(value = "listByLevel.json")
    public Map<String, Object> listByLevel(@ModelAttribute("form") CategoryForm form) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(Constants.RESULT_KEY_DATA, categoryService.findByLevelAndStatus(form.getLevel(), Constants.STATUS_VALID));
        result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_VALID);

        return result;
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String doAdd(@ModelAttribute("form") CategoryForm form) {
        validator.validate(form);

        if (form.hasError()) {
            form.setCategories(categoryService.findByLevelAndStatus(BusinessConstants.CATEGORY_LEVEL_1, Constants.STATUS_VALID));

            return "system-parameter/add";
        }

        Category category = new Category();
        form.formToCategory(category);
        category.setId(categoryService.getNextId(category.getParentId()));
        category.setNameUrl(StringUtils.replaceEach(form.getNameEn(), new String[] { " & ", " " }, new String[] { "-", "-" }));

        categoryService.add(category);

        return "redirect:/category/list";
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(@ModelAttribute("form") CategoryForm form) {
        return "category/list";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String doEdit(@ModelAttribute("form") CategoryForm form) {
        return "category/list";
    }

}
