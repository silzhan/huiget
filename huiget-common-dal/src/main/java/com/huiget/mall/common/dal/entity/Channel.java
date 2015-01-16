/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 *
 * @version $Id: Channel.java, v 0.1 2014年10月24日 下午8:33:37 yaofang Exp $
 */
public class Channel extends BaseEntity {

    private String channelId;

    private String name;

    private int    weight;

    private String status;

    /**
     * Getter method for property <tt>channelId</tt>.
     * 
     * @return property value of channelId
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Setter method for property <tt>channelId</tt>.
     * 
     * @param channelId value to be assigned to property channelId
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>weight</tt>.
     * 
     * @return property value of weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Setter method for property <tt>weight</tt>.
     * 
     * @param weight value to be assigned to property weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
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

}
