/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import com.huiget.mall.common.dal.entity.LoginLog;

/**
 * 
 * @author yaofang
 * @version $Id: LoginLogMapper.java, v 0.1 2014年10月4日 下午7:21:38 yaofang Exp $
 */
public interface LoginLogMapper extends BaseMapper {

    public int countByUserId(int userId);

    public List<LoginLog> queryByUserId(int userId);

}
