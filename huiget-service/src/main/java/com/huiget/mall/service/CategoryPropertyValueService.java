/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.CategoryPropertyValueMapper;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryPropertyValueService.java, v 0.1 2014年9月25日 下午6:07:04 yaofang Exp $
 */
@Service
public class CategoryPropertyValueService extends BaseSevice {

    @Autowired
    private CategoryPropertyValueMapper categoryPropertyValueMapper;

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return categoryPropertyValueMapper;
    }

}
