/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.MenuMapper;

/**
 * 
 * @author yaofang
 * @version $Id: MenuInfoService.java, v 0.1 2014年9月26日 上午9:23:54 yaofang Exp $
 */
@Service
public class MenuService extends BaseSevice {

    @Autowired
    private MenuMapper menuMapper;

    public int findNextId(int parentId) {
        return menuMapper.queryNextIdByParentId(parentId);
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return menuMapper;
    }

}
