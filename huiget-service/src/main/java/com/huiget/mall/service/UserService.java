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

import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.UserMapper;
import com.huiget.mall.common.util.RegexUtil;

/**
 * 
 * @author yaofang
 * @version $Id: UserService.java, v 0.1 2014年10月4日 下午8:16:22 yaofang Exp $
 */

@Service
public class UserService extends BaseSevice {

    @Autowired
    private UserMapper userMapper;

    public int countUserByNickName(String nickName) {
        return userMapper.countByNickName(nickName);
    }

    public List<User> findUsers(int pageSize, int pageNumber) {
        return userMapper.queryForPage((pageNumber - 1) * pageSize, pageSize);
    }

    public boolean isNickNameExist(String nickName) {
        return countUserByNickName(nickName) > 0;
    }

    public int addUser(String userName) {
        User user = new User();
        if (RegexUtil.isEmail(userName)) {
            user.setEmail(userName);
        } else {
            user.setMobilePhone(userName);
        }
        user.setCreateTime(new Date());

        userMapper.insert(user);

        return user.getId();
    }

    public void modifyMobilePhone(int userId, String mobilePhone) {
        User user = new User();
        user.setId(userId);
        user.setMobilePhone(mobilePhone);
        user.setLastUpdateTime(new Date());

        userMapper.updateMobilePhone(user);
    }

    public void modifyMobilePhoneValidated(int userId, String mobilePhoneValidated) {
        User user = new User();
        user.setId(userId);
        user.setMobilePhoneValidated(mobilePhoneValidated);
        user.setLastUpdateTime(new Date());

        userMapper.updateMobilePhoneValidated(user);
    }

    public void modifyEmail(int userId, String email) {
        User user = new User();
        user.setId(userId);
        user.setEmail(email);
        user.setLastUpdateTime(new Date());

        userMapper.updateEmail(user);
    }

    public void modifyEmailValidated(int userId, String emailValidated) {
        User user = new User();
        user.setId(userId);
        user.setEmailValidated(emailValidated);
        user.setLastUpdateTime(new Date());

        userMapper.updateEmailValidated(user);
    }

    public void modifyAvatar(User user) {
        user.setLastUpdateTime(new Date());

        userMapper.updateAvatar(user);
    }

    public void modifyTransPassword(int userId, String transPassword) {
        User user = findById(userId);
        user.setTransPassword(transPassword);
        user.setLastUpdateTime(new Date());
        userMapper.updateTransPassword(user);
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return userMapper;
    }

}
