/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.LinkedHashMap;
import java.util.Map;

import com.huiget.mall.common.util.constants.Constants;

/**
 * 
 * @author yaofang
 * @version $Id: BaseForm.java, v 0.1 2014年9月18日 上午11:56:44 yaofang Exp $
 */
public class BaseForm {

    public int                  id;

    private int                 count;

    private int                 pageSize   = 15;

    private int                 pageNumber = 1;

    private int                 totalPageNumber;

    private Map<String, String> errors     = new LinkedHashMap<String, String>();

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
     * Getter method for property <tt>count</tt>.
     * 
     * @return property value of count
     */
    public int getCount() {
        return count;
    }

    /**
     * Setter method for property <tt>count</tt>.
     * 
     * @param count value to be assigned to property count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Getter method for property <tt>pageSize</tt>.
     * 
     * @return property value of pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Setter method for property <tt>pageSize</tt>.
     * 
     * @param pageSize value to be assigned to property pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter method for property <tt>pageNumber</tt>.
     * 
     * @return property value of pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Setter method for property <tt>pageNumber</tt>.
     * 
     * @param pageNumber value to be assigned to property pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Getter method for property <tt>totalPageNumber</tt>.
     * 
     * @return property value of totalPageNumber
     */
    public int getTotalPageNumber() {
        return totalPageNumber;
    }

    /**
     * Setter method for property <tt>totalPageNumber</tt>.
     * 
     * @param totalPageNumber value to be assigned to property totalPageNumber
     */
    public void setTotalPageNumber(int totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
    }

    public int getBegin() {
        return (pageNumber - 1) * pageSize + 1;
    }

    public int getEnd() {
        return count > pageNumber * pageSize ? pageNumber * pageSize : count;
    }

    /**
     * Getter method for property <tt>errors</tt>.
     * 
     * @return property value of errors
     */
    public Map<String, String> getErrors() {
        return errors;
    }

    /**
     * Setter method for property <tt>errors</tt>.
     * 
     * @param errors value to be assigned to property errors
     */
    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    public void putError(String key, String val) {
        errors.put(key, val);
    }

    public boolean hasError() {
        return errors.size() > 0;
    }

    public String getDomain() {
        return Constants.BACKEND_DOMAIN;
    }

    public String getStaticResourceDomain() {
        return Constants.BACKEND_STATIC_RESOURCE_DOMAIN;
    }

}
