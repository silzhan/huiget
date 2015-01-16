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
 * @version $Id: BaseEntity.java, v 0.1 2014年9月18日 上午11:47:32 yaofang Exp $
 */
public class BaseEntity {

    private int    id;

    private Date   createTime;

    private String creator;

    private Date   lastUpdateTime;

    private String updater;

    /**
     * Getter method for property <tt>id</tt>.
     * 
     * @return property value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     * 
     * @param id value to be assigned to property id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>createTime</tt>.
     * 
     * @return property value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     * 
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter method for property <tt>creator</tt>.
     * 
     * @return property value of creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Setter method for property <tt>creator</tt>.
     * 
     * @param creator value to be assigned to property creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * Getter method for property <tt>lastUpdateTime</tt>.
     * 
     * @return property value of lastUpdateTime
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Setter method for property <tt>lastUpdateTime</tt>.
     * 
     * @param lastUpdateTime value to be assigned to property lastUpdateTime
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * Getter method for property <tt>updater</tt>.
     * 
     * @return property value of updater
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * Setter method for property <tt>updater</tt>.
     * 
     * @param updater value to be assigned to property updater
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

}
