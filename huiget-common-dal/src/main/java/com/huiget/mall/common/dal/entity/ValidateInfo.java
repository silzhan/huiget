/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.huiget.mall.common.util.constants.Constants;

/**
 * 
 * @author yaofang
 * @version $Id: ValidateInfo.java, v 0.1 2014年10月6日 下午3:45:19 yaofang Exp $
 */
public class ValidateInfo extends BaseEntity {

    private int    userId;

    private String type;

    private String target;

    private String code;

    private int    expireTime;

    private String status = Constants.STATUS_VALID;

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
     * Getter method for property <tt>type</tt>.
     * 
     * @return property value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     * 
     * @param type value to be assigned to property type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter method for property <tt>target</tt>.
     * 
     * @return property value of target
     */
    public String getTarget() {
        return target;
    }

    /**
     * Setter method for property <tt>target</tt>.
     * 
     * @param target value to be assigned to property target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>expireTime</tt>.
     * 
     * @return property value of expireTime
     */
    public int getExpireTime() {
        return expireTime;
    }

    /**
     * Setter method for property <tt>expireTime</tt>.
     * 
     * @param expireTime value to be assigned to property expireTime
     */
    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * Getter method for property <tt>status</tt>.
     * 
     * @return property value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for property <tt>status</tt>.
     * 
     * @param status value to be assigned to property status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public boolean valid(String type) {
        return StringUtils.equals(Constants.STATUS_VALID, status) && StringUtils.equals(type, this.type) && (new Date().getTime() - getCreateTime().getTime() < expireTime);
    }
}
