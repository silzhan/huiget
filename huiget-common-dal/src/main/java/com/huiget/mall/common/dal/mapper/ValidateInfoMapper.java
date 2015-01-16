/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiget.mall.common.dal.entity.ValidateInfo;

/**
 * 
 * @author yaofang
 * @version $Id: ValidateInfomapper.java, v 0.1 2014年10月6日 下午3:48:13 yaofang Exp $
 */
public interface ValidateInfoMapper extends BaseMapper {

    public ValidateInfo queryByCode(String code);

    public List<ValidateInfo> queryValidValidateInfoByUserIdAndTargetAndType(@Param("userId") int userId, @Param("target") String target, @Param("type") String type);

    public void updateStatus(ValidateInfo validateInfo);

}
