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
 * @version $Id: ValidatePhoneForm.java, v 0.1 2014年10月6日 下午7:43:04 yaofang Exp $
 */
public class ValidateMobilePhoneForm extends BaseForm {

    private String mobilePhone;

    private String checkcode;

    private User   user;

    /**
     * Getter method for property <tt>mobilePhone</tt>.
     * 
     * @return property value of mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Setter method for property <tt>mobilePhone</tt>.
     * 
     * @param mobilePhone value to be assigned to property mobilePhone
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
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
