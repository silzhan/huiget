/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member.account;

import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.web.form.BaseForm;

/**
 * 
 * @author yaofang
 * @version $Id: SetTransPasswordForm.java, v 0.1 2014年10月6日 下午12:16:31 yaofang Exp $
 */
public class SetTransPasswordForm extends BaseForm {

    private String password;

    private String confirmPassword;

    private User   user;

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

    /**
     * Getter method for property <tt>user</tt>.
     * 
     * @return property value of user
     */
    public User getUser() {
        return user;
    }

    /**
     * Setter method for property <tt>user</tt>.
     * 
     * @param user value to be assigned to property user
     */
    public void setUser(User user) {
        this.user = user;
    }

}
