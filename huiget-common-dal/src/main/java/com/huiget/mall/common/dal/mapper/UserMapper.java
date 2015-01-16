/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import com.huiget.mall.common.dal.entity.User;

/**
 * 
 * @author yaofang
 * @version $Id: UserMapper.java, v 0.1 2014年10月4日 下午7:58:12 yaofang Exp $
 */
public interface UserMapper extends BaseMapper {

    /**
     * 修改手机号码
     * 
     * @param user
     */
    public void updateMobilePhone(User user);

    /**
     * 修改手机号码验证标志
     * 
     * @param user
     */
    public void updateMobilePhoneValidated(User user);

    /**
     * 修改EMAIL
     * 
     * @param user
     */
    public void updateEmail(User user);

    /**
     * 修改EMAIL验证标志
     * 
     * @param user
     */
    public void updateEmailValidated(User user);

    /**
     * 修改用户头像
     * 
     * @param user
     */
    public void updateAvatar(User user);

    /**
     * 根据昵称统计
     * 
     * @return
     */
    public int countByNickName(String nickName);

    /**
     * 修改交易密码
     * 
     * @param user
     */
    public void updateTransPassword(User user);

}
