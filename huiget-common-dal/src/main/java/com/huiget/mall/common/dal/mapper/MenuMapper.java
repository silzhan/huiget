/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author yaofang
 * @version $Id: MenuInfoMapper.java, v 0.1 2014年9月25日 下午4:50:59 yaofang Exp $
 */
public interface MenuMapper extends BaseMapper {

    public int queryNextIdByParentId(@Param("parentId") int parentId);

}
