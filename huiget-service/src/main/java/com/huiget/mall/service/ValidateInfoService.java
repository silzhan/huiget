/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.entity.ValidateInfo;
import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.ValidateInfoMapper;

/**
 * 
 * @author yaofang
 * @version $Id: ValidateInfoService.java, v 0.1 2014年10月6日 下午4:01:20 yaofang Exp $
 */
@Service
public class ValidateInfoService extends BaseSevice {

    @Autowired
    private ValidateInfoMapper validateInfoMapper;

    public ValidateInfo findValidateInfoByCode(String code) {
        return validateInfoMapper.queryByCode(code);
    }

    public List<ValidateInfo> findValidateInfos(int userId, String target, String type) {
        return validateInfoMapper.queryValidValidateInfoByUserIdAndTargetAndType(userId, target,
            type);
    }

    public void updateStatus(ValidateInfo validateInfo) {
        validateInfo.setLastUpdateTime(new Date());
        validateInfoMapper.updateStatus(validateInfo);
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return validateInfoMapper;
    }

}
