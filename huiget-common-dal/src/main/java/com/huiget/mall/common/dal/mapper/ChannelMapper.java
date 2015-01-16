/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import com.huiget.mall.common.dal.entity.Channel;

/**
 * 
 * @author yaofang
 *
 * @version $Id: ChannelMapper.java, v 0.1 2014年10月24日 下午8:38:27 yaofang Exp $
 */
public interface ChannelMapper extends BaseMapper {

    List<Channel> queryByStatus(String status);

}
