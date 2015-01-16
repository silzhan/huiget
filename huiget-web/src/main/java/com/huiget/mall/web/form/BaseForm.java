/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import com.huiget.mall.common.dal.entity.Channel;
import com.huiget.mall.common.util.web.context.WebContext;
import com.huiget.mall.common.util.web.context.WebContextHolder;

/**
 * 
 * @author yaofang
 * @version $Id: BaseForm.java, v 0.1 2014年9月25日 上午9:55:17 yaofang Exp $
 */
public class BaseForm {

    private int                  id;

    private Map<String, String>  errors = new LinkedHashMap<String, String>();

    private Map<String, Channel> allChannel;

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

    public void putErrors(Map<String, String> errors) {
        errors.putAll(errors);
    }

    public boolean hasError() {
        return errors.size() > 0;
    }

    public boolean hasError(String key) {
        return errors.containsKey(key);
    }

    /**
     * Getter method for property <tt>allChannel</tt>.
     * 
     * @return property value of allChannel
     */
    public Map<String, Channel> getAllChannel() {
        return allChannel;
    }

    /**
     * Setter method for property <tt>allChannel</tt>.
     * 
     * @param allChannel value to be assigned to property allChannel
     */
    public void setAllChannel(Map<String, Channel> allChannel) {
        this.allChannel = allChannel;
    }

    public final long getNanoTime() {
        return System.nanoTime();
    }

    public final WebContext getWebContext() {
        WebContext webContext = WebContextHolder.get();
        return webContext == null ? new WebContext() : webContext;
    }

    public final String getRequestURI() {
        try {
            return URLDecoder.decode(getWebContext().getRequestURI(), "UTF-8");
        } catch (Exception e) {
            return getWebContext().getRequestURI();
        }

    }

    public final boolean isLogon() {
        return getWebContext().isLogon();
    }

}
