/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiget.mall.common.dal.entity.TempPic;

/**
 * 
 * @author yaofang
 * @version $Id: TempPicMapper.java, v 0.1 2014年10月7日 下午9:37:23 yaofang Exp $
 */
public interface TempPicMapper extends BaseMapper {

    public List<TempPic> queryByIds(@Param("ids") List<Integer> ids);

}
