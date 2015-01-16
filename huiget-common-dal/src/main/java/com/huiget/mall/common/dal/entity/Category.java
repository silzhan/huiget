/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryInfo.java, v 0.1 2014年9月23日 下午5:12:27 yaofang Exp $
 */
public class Category extends BaseEntity {

    private String nameEn;

    private String nameCn;

    private String nameUrl;

    private int    level;

    private int    parentId;

    private String status;

    private int    weight;

    /**
     * Getter method for property <tt>nameEn</tt>.
     * 
     * @return property value of nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Setter method for property <tt>nameEn</tt>.
     * 
     * @param nameEn value to be assigned to property nameEn
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    /**
     * Getter method for property <tt>nameCn</tt>.
     * 
     * @return property value of nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    /**
     * Setter method for property <tt>nameCn</tt>.
     * 
     * @param nameCn value to be assigned to property nameCn
     */
    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    /**
     * Getter method for property <tt>nameUrl</tt>.
     * 
     * @return property value of nameUrl
     */
    public String getNameUrl() {
        return nameUrl;
    }

    /**
     * Setter method for property <tt>nameUrl</tt>.
     * 
     * @param nameUrl value to be assigned to property nameUrl
     */
    public void setNameUrl(String nameUrl) {
        this.nameUrl = nameUrl;
    }

    /**
     * Getter method for property <tt>level</tt>.
     * 
     * @return property value of level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Setter method for property <tt>level</tt>.
     * 
     * @param level value to be assigned to property level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Getter method for property <tt>parentId</tt>.
     * 
     * @return property value of parentId
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * Setter method for property <tt>parentId</tt>.
     * 
     * @param parentId value to be assigned to property parentId
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
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

}
