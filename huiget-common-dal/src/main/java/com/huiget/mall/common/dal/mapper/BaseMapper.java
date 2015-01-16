/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author yaofang
 * @version $Id: BaseMapper.java, v 0.1 2014年8月6日 上午9:36:43 yaofang Exp $
 */
public interface BaseMapper {

    /**
     * 新增记录
     * 
     * @param t
     */
    public <T> int insert(T t);

    /**
     * 根据ID查询记录
     * 
     * @param id
     * @return
     */
    public <T> T queryById(int id);

    public <T> List<T> queryAll();

    public <T> List<T> queryForPage(@Param("begin") int begin, @Param("end") int end);

    /**
     * 根据ID删除记录
     * 
     * @param id
     */
    public <T> void deleteById(int id);

    /**
     * 根据ID、用户ID删除记录
     * 
     * @param id
     */
    public <T> void deleteByIdAndUserId(@Param("id") int id, @Param("userId") int userId);

    /**
     * 更新记录
     * 
     * @param t
     */
    public <T> void update(T t);

    public int count();

}
