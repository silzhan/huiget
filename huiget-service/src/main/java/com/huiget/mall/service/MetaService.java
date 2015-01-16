/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.entity.Meta;
import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.MetaMapper;

/**
 * 
 * @author yaofang
 * @version $Id: MetaInfoService.java, v 0.1 2014年9月25日 下午2:44:58 yaofang Exp $
 */
@Service
public class MetaService extends BaseSevice {

    @Autowired
    private MetaMapper metaInfoMapper;

    public Meta findByUri(String uri) {
        return metaInfoMapper.queryByUri(uri);
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return metaInfoMapper;
    }

}
