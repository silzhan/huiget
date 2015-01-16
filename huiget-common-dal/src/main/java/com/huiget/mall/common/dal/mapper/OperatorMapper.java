/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import org.apache.ibatis.annotations.Param;

import com.huiget.mall.common.dal.entity.Operator;

/**
 * 
 * @author yaofang
 * @version $Id: OperatorInfoMapper.java, v 0.1 2014年9月25日 下午4:11:28 yaofang Exp $
 */
public interface OperatorMapper extends BaseMapper {

    public Operator queryByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

    public Operator queryByUserName(@Param("userName") String userName);

    public void updateLastLoginTime(Operator operatorInfo);

}
