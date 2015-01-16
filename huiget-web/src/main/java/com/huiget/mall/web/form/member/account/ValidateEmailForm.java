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
 * @version $Id: EmailValidateForm.java, v 0.1 2014年10月6日 下午3:08:22 yaofang Exp $
 */
public class ValidateEmailForm extends BaseForm {

    private String email;

    private String checkcode;

    private User   user;

    /**
     * Getter method for property <tt>email</tt>.
     * 
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property <tt>email</tt>.
     * 
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method for property <tt>checkcode</tt>.
     * 
     * @return property value of checkcode
     */
    public String getCheckcode() {
        return checkcode;
    }

    /**
     * Setter method for property <tt>checkcode</tt>.
     * 
     * @param checkcode value to be assigned to property checkcode
     */
    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
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
