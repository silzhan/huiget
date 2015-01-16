/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huiget.mall.backend.web.form.CategoryForm;
import com.huiget.mall.service.CategoryService;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryInfoFormValidator.java, v 0.1 2014年9月25日 下午12:02:24 yaofang Exp $
 */
@Component
public class CategoryFormValidator {

    @Autowired
    private CategoryService categoryInfoService;

    public void validate(CategoryForm form) {
        String nameEn = form.getNameEn();
        if (StringUtils.isBlank(nameEn)) {
            form.putError("nameEn", "类目英文名称不能为空");
        } else {
            if (categoryInfoService.findByNameUrl(StringUtils.replace(nameEn, " ", "-").toLowerCase()) != null) {
                form.putError("nameEn", "类目英文名称已经存在");
            }
        }
    }

}
