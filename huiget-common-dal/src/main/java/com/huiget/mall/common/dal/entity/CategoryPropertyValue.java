/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryPropertyValue.java, v 0.1 2014年9月25日 下午5:00:50 yaofang Exp $
 */
public class CategoryPropertyValue extends BaseEntity {

    private int    propertyId;

    private String name;

    private int    value;

    private String status;

    private int    weight;

    /**
     * Getter method for property <tt>propertyId</tt>.
     * 
     * @return property value of propertyId
     */
    public int getPropertyId() {
        return propertyId;
    }

    /**
     * Setter method for property <tt>propertyId</tt>.
     * 
     * @param propertyId value to be assigned to property propertyId
     */
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
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
     * Getter method for property <tt>value</tt>.
     * 
     * @return property value of value
     */
    public int getValue() {
        return value;
    }

    /**
     * Setter method for property <tt>value</tt>.
     * 
     * @param value value to be assigned to property value
     */
    public void setValue(int value) {
        this.value = value;
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
