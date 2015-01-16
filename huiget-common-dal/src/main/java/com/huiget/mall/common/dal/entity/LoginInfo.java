/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

import java.util.Date;

/**
 * 
 * @author yaofang
 * @version $Id: LoginInfo.java, v 0.1 2014年10月4日 下午7:06:07 yaofang Exp $
 */
public class LoginInfo extends BaseEntity {

    private int    userId;

    private String userName;

    private String loginType;

    private String password;

    private Date   lastLoginTime;

    /**
     * Getter method for property <tt>userId</tt>.
     * 
     * @return property value of userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     * 
     * @param userId value to be assigned to property userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>userName</tt>.
     * 
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     * 
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>loginType</tt>.
     * 
     * @return property value of loginType
     */
    public String getLoginType() {
        return loginType;
    }

    /**
     * Setter method for property <tt>loginType</tt>.
     * 
     * @param loginType value to be assigned to property loginType
     */
    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    /**
     * Getter method for property <tt>password</tt>.
     * 
     * @return property value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property <tt>password</tt>.
     * 
     * @param password value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter method for property <tt>lastLoginTime</tt>.
     * 
     * @return property value of lastLoginTime
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Setter method for property <tt>lastLoginTime</tt>.
     * 
     * @param lastLoginTime value to be assigned to property lastLoginTime
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

}
