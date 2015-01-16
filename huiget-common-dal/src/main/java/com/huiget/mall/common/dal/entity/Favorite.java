/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: Favorite.java, v 0.1 2014年10月7日 下午1:12:10 yaofang Exp $
 */
public class Favorite extends BaseEntity {

    private int    userId;

    private String type;

    private int    targetId;

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
     * Getter method for property <tt>targetId</tt>.
     * 
     * @return property value of targetId
     */
    public int getTargetId() {
        return targetId;
    }

    /**
     * Setter method for property <tt>targetId</tt>.
     * 
     * @param targetId value to be assigned to property targetId
     */
    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

}
