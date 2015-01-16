/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member.account;

import com.huiget.mall.web.form.BaseForm;

/**
 * 
 * @author yaofang
 * @version $Id: ModifyPasswordForm.java, v 0.1 2014年10月3日 上午10:23:16 yaofang Exp $
 */
public class ModifyPasswordForm extends BaseForm {

    private String oldPassword;

    private String password;

    private String confirmPassword;

    /**
     * Getter method for property <tt>oldPassword</tt>.
     * 
     * @return property value of oldPassword
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Setter method for property <tt>oldPassword</tt>.
     * 
     * @param oldPassword value to be assigned to property oldPassword
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
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
     * Getter method for property <tt>confirmPassword</tt>.
     * 
     * @return property value of confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * Setter method for property <tt>confirmPassword</tt>.
     * 
     * @param confirmPassword value to be assigned to property confirmPassword
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

}
