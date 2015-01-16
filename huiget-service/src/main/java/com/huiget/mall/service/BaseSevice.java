/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import java.util.Date;
import java.util.List;

import com.huiget.mall.common.dal.entity.BaseEntity;
import com.huiget.mall.common.dal.mapper.BaseMapper;

/**
 * 
 * @author yaofang
 * @version $Id: BaseSevice.java, v 0.1 2014年9月23日 下午6:02:13 yaofang Exp $
 */
public abstract class BaseSevice {

    public <T extends BaseEntity> int add(T t) {
        t.setCreateTime(new Date());

        return getMapper().insert(t);
    }

    public <T extends BaseEntity> T findById(int id) {
        return getMapper().queryById(id);
    }

    public <T extends BaseEntity> List<T> findAll(Class<T> clazz) {
        return getMapper().queryAll();
    }

    public <T extends BaseEntity> List<T> findForPage(int pageSize, int pageNumber, Class<T> clazz) {
        return getMapper().queryForPage((pageNumber - 1) * pageSize, pageSize);
    }

    public <T extends BaseEntity> void edit(T t) {
        t.setLastUpdateTime(new Date());

        getMapper().update(t);
    }

    public int count() {
        return getMapper().count();
    }

    public void deleteById(int id) {
        getMapper().deleteById(id);
    }

    public void deleteByIdAndUserId(int id, int userId) {
        getMapper().deleteByIdAndUserId(id, userId);
    }

    protected abstract BaseMapper getMapper();

}
