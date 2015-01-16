/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiget.mall.common.dal.entity.Category;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryInfoMapper.java, v 0.1 2014年9月23日 下午5:15:11 yaofang Exp $
 */
public interface CategoryMapper extends BaseMapper {

    public int queryNextIdByParentId(@Param("parentId") int parentId);

    public List<Category> queryByStatus(String status);

    public List<Category> queryByParentIdAndStatus(@Param("parentId") int parentId, @Param("status") String status);

    public List<Category> queryByLevelAndStatus(@Param("level") int level, @Param("status") String status);

    public Category queryByNameUrl(String nameUrl);

}
