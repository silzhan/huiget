/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member;

/**
 * 
 * @author yaofang
 * @version $Id: ResetPasswordForm.java, v 0.1 2014年10月3日 上午10:24:47 yaofang Exp $
 */
public class ResetPasswordForm {

    private String password;

    private String confirmPassword;

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
