/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.entity.Channel;
import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.ChannelMapper;
import com.huiget.mall.common.util.constants.Constants;

/**
 * 
 * @author yaofang
 *
 * @version $Id: ChannelService.java, v 0.1 2014年10月24日 下午8:43:27 yaofang Exp $
 */
@Service
public class ChannelService extends BaseSevice implements InitializingBean {

    private Map<String, Channel> CHANNEL_REGISTER = new LinkedHashMap<String, Channel>();

    @Autowired
    private ChannelMapper        channelMapper;

    public Map<String, Channel> getAllChannel() {
        return CHANNEL_REGISTER;
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return channelMapper;
    }

    /** 
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        List<Channel> channels = channelMapper.queryByStatus(Constants.STATUS_VALID);
        for (Channel channel : channels) {
            CHANNEL_REGISTER.put(channel.getName(), channel);
        }
    }

}
