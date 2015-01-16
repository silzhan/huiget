/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: SystemParameter.java, v 0.1 2014年9月23日 下午5:45:43 yaofang Exp $
 */
public class SystemParameter extends BaseEntity {

    private String paramType;

    private String paramName;

    private String paramKey;

    private String paramValue;

    private String status;

    /**
     * Getter method for property <tt>paramType</tt>.
     * 
     * @return property value of paramType
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * Setter method for property <tt>paramType</tt>.
     * 
     * @param paramType value to be assigned to property paramType
     */
    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    /**
     * Getter method for property <tt>paramName</tt>.
     * 
     * @return property value of paramName
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * Setter method for property <tt>paramName</tt>.
     * 
     * @param paramName value to be assigned to property paramName
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * Getter method for property <tt>paramKey</tt>.
     * 
     * @return property value of paramKey
     */
    public String getParamKey() {
        return paramKey;
    }

    /**
     * Setter method for property <tt>paramKey</tt>.
     * 
     * @param paramKey value to be assigned to property paramKey
     */
    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    /**
     * Getter method for property <tt>paramValue</tt>.
     * 
     * @return property value of paramValue
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * Setter method for property <tt>paramValue</tt>.
     * 
     * @param paramValue value to be assigned to property paramValue
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
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
