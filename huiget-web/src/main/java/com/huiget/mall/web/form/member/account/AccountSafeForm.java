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
 * @version $Id: AccountSafeForm.java, v 0.1 2014年10月5日 下午12:11:55 yaofang Exp $
 */
public class AccountSafeForm extends BaseForm {

    private User user;

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
