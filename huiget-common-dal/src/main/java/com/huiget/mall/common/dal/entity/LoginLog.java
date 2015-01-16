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
 * @version $Id: LoginLog.java, v 0.1 2014年10月4日 下午7:20:27 yaofang Exp $
 */
public class LoginLog extends BaseEntity {

    private int    loginId;

    private int    userId;

    private String loginType;

    private String loginIp;

    private String loginAddress;

    private Date   loginTime;

    /**
     * Getter method for property <tt>loginId</tt>.
     * 
     * @return property value of loginId
     */
    public int getLoginId() {
        return loginId;
    }

    /**
     * Setter method for property <tt>loginId</tt>.
     * 
     * @param loginId value to be assigned to property loginId
     */
    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

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
     * Getter method for property <tt>loginIp</tt>.
     * 
     * @return property value of loginIp
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * Setter method for property <tt>loginIp</tt>.
     * 
     * @param loginIp value to be assigned to property loginIp
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * Getter method for property <tt>loginAddress</tt>.
     * 
     * @return property value of loginAddress
     */
    public String getLoginAddress() {
        return loginAddress;
    }

    /**
     * Setter method for property <tt>loginAddress</tt>.
     * 
     * @param loginAddress value to be assigned to property loginAddress
     */
    public void setLoginAddress(String loginAddress) {
        this.loginAddress = loginAddress;
    }

    /**
     * Getter method for property <tt>loginTime</tt>.
     * 
     * @return property value of loginTime
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * Setter method for property <tt>loginTime</tt>.
     * 
     * @param loginTime value to be assigned to property loginTime
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

}
