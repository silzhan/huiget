/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.OperatorMapper;

/**
 * 
 * @author yaofang
 * @version $Id: OperatorInfoService.java, v 0.1 2014年9月26日 上午9:25:02 yaofang Exp $
 */
@Service
public class OperatorService extends BaseSevice {

    @Autowired
    private OperatorMapper operatorInfoMapper;

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return operatorInfoMapper;
    }

}
