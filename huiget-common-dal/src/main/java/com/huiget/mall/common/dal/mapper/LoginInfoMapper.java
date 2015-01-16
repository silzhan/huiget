/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huiget.mall.common.dal.entity.LoginInfo;

/**
 * 
 * @author yaofang
 * @version $Id: LoginInfoMapper.java, v 0.1 2014年10月4日 下午7:07:40 yaofang Exp $
 */
public interface LoginInfoMapper extends BaseMapper {

    /**
     * 根据用户名、密码查询登录信息
     * 
     * @param userName
     * @param password
     * @return
     */
    public LoginInfo queryByUserNameAndPassword(@Param("userName") String userName,
                                                @Param("password") String password);

    /**
     * 根据用户名查询登录信息
     * 
     * @param userName
     * @return
     */
    public LoginInfo queryByUserName(String userName);

    /**
     * 修改登录密码
     * 
     * @param loginInfo
     */
    public void updatePassword(LoginInfo loginInfo);

    /**
     * 根据用户id查询登录信息
     * 
     * @param userId
     * @return
     */
    public List<LoginInfo> queryByUserId(int userId);

    public LoginInfo queryByUserIdAndLoginType(@Param("userId") int userId,
                                               @Param("loginType") String loginType);

    /**
     * 修改用户名
     * 
     * @param loginInfo
     */
    public void updateUserName(LoginInfo loginInfo);

    /**
     * 修改最后登录时间
     * 
     * @param loginInfo
     */
    public void updateLastLoginTime(LoginInfo loginInfo);

}
