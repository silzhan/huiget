/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiget.mall.common.dal.entity.Product;

/**
 * 
 * @author yaofang
 *
 * @version $Id: ProductMapper.java, v 0.1 2014年10月23日 下午8:32:21 yaofang Exp $
 */
public interface ProductMapper extends BaseMapper {

    public List<Product> queryByConditionForPage(@Param("channel") String channel, @Param("category") String category, @Param("begin") int begin, @Param("end") int end);

    public List<Product> queryByBigestDiscount(@Param("channel") String channel, @Param("category") String category, @Param("begin") int begin, @Param("end") int end);

    public int countByCondition(@Param("channel") String channel, @Param("category") String category);

    public int countByChannel(@Param("channel") String channel);

    public List<String> queryCategoryByChannel(@Param("channel") String channel);
}
