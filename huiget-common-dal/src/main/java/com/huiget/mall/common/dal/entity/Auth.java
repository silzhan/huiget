/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: AuthInfo.java, v 0.1 2014年9月25日 下午4:35:55 yaofang Exp $
 */
public class Auth extends BaseEntity {

    private String name;

    private String menuIds;

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>menuIds</tt>.
     * 
     * @return property value of menuIds
     */
    public String getMenuIds() {
        return menuIds;
    }

    /**
     * Setter method for property <tt>menuIds</tt>.
     * 
     * @param menuIds value to be assigned to property menuIds
     */
    public void setMenuIds(String menuIds) {
        this.menuIds = menuIds;
    }

}
