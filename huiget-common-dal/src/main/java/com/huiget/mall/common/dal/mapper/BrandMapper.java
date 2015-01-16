/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiget.mall.common.dal.entity.Brand;

/**
 * 
 * @author yaofang
 * @version $Id: BrandInfoMapper.java, v 0.1 2014年9月25日 下午4:55:41 yaofang Exp $
 */
public interface BrandMapper extends BaseMapper {

    public List<Brand> queryByStatus(String status);

    public void updateLogo(@Param("id") int id, @Param("logo") String logo);

}
