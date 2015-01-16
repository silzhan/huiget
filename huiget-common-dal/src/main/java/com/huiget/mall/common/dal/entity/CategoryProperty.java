/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryProperty.java, v 0.1 2014年9月25日 下午4:57:06 yaofang Exp $
 */
public class CategoryProperty extends BaseEntity {

    private int    categoryId;

    private String name;

    private String status;

    private int    weight;

    /**
     * Getter method for property <tt>categoryId</tt>.
     * 
     * @return property value of categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Setter method for property <tt>categoryId</tt>.
     * 
     * @param categoryId value to be assigned to property categoryId
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
