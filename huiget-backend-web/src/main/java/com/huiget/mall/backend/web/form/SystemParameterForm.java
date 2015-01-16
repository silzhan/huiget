/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.List;
import java.util.Map;

import com.huiget.mall.common.dal.entity.SystemParameter;
import com.huiget.mall.common.util.constants.Constants;

/**
 * 
 * @author yaofang
 * @version $Id: SystemParameterForm.java, v 0.1 2014年9月24日 上午10:00:11 yaofang Exp $
 */
public class SystemParameterForm extends BaseForm {

    private String                paramType;

    private String                paramName;

    private String                paramKey;

    private String                paramValue;

    private String                status = Constants.STATUS_VALID;

    private Map<String, String>   paramTypeMap;

    private SystemParameter       systemParameter;

    private List<SystemParameter> systemParameters;

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

    /**
     * Getter method for property <tt>paramTypeMap</tt>.
     * 
     * @return property value of paramTypeMap
     */
    public Map<String, String> getParamTypeMap() {
        return paramTypeMap;
    }

    /**
     * Setter method for property <tt>paramTypeMap</tt>.
     * 
     * @param paramTypeMap value to be assigned to property paramTypeMap
     */
    public void setParamTypeMap(Map<String, String> paramTypeMap) {
        this.paramTypeMap = paramTypeMap;
    }

    /**
     * Getter method for property <tt>systemParameter</tt>.
     * 
     * @return property value of systemParameter
     */
    public SystemParameter getSystemParameter() {
        return systemParameter;
    }

    /**
     * Setter method for property <tt>systemParameter</tt>.
     * 
     * @param systemParameter value to be assigned to property systemParameter
     */
    public void setSystemParameter(SystemParameter systemParameter) {
        this.systemParameter = systemParameter;
    }

    /**
     * Getter method for property <tt>systemParameters</tt>.
     * 
     * @return property value of systemParameters
     */
    public List<SystemParameter> getSystemParameters() {
        return systemParameters;
    }

    /**
     * Setter method for property <tt>systemParameters</tt>.
     * 
     * @param systemParameters value to be assigned to property systemParameters
     */
    public void setSystemParameters(List<SystemParameter> systemParameters) {
        this.systemParameters = systemParameters;
    }

    public void systemParameterToForm() {
        setId(systemParameter.getId());
        setParamType(systemParameter.getParamType());
        setParamName(systemParameter.getParamName());
        setParamKey(systemParameter.getParamKey());
        setParamValue(systemParameter.getParamValue());
        setStatus(systemParameter.getStatus());
    }

    public void formToSystemParameter(SystemParameter systemParameter) {
        systemParameter.setParamType(paramType);
        systemParameter.setParamName(paramName);
        systemParameter.setParamKey(paramKey);
        systemParameter.setParamValue(paramValue);
        systemParameter.setStatus(status);
    }

}
