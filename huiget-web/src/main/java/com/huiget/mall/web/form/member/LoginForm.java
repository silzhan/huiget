/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member;

import com.huiget.mall.web.form.BaseForm;

/**
 * 
 * @author yaofang
 * @version $Id: LoginForm.java, v 0.1 2014年10月3日 上午9:57:12 yaofang Exp $
 */
public class LoginForm extends BaseForm {

    private String userName;

    private String password;

    private int    remember;

    /**
     * 登录后重定向链接
     */
    private String redirectURL;

    /**
     * Getter method for property <tt>userName</tt>.
     * 
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     * 
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>password</tt>.
     * 
     * @return property value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property <tt>password</tt>.
     * 
     * @param password value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter method for property <tt>remember</tt>.
     * 
     * @return property value of remember
     */
    public int getRemember() {
        return remember;
    }

    /**
     * Setter method for property <tt>remember</tt>.
     * 
     * @param remember value to be assigned to property remember
     */
    public void setRemember(int remember) {
        this.remember = remember;
    }

    /**
     * Getter method for property <tt>redirectURL</tt>.
     * 
     * @return property value of redirectURL
     */
    public String getRedirectURL() {
        return redirectURL;
    }

    /**
     * Setter method for property <tt>redirectURL</tt>.
     * 
     * @param redirectURL value to be assigned to property redirectURL
     */
    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

}
