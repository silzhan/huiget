/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.List;

import com.huiget.mall.common.dal.entity.Auth;
import com.huiget.mall.common.dal.entity.Menu;
import com.huiget.mall.common.util.CollectionUtil;
import com.huiget.mall.common.util.constants.Constants;

/**
 * 
 * @author yaofang
 * @version $Id: AuthForm.java, v 0.1 2014年9月26日 上午10:32:15 yaofang Exp $
 */
public class AuthForm extends BaseForm {

    private String        name;

    private List<Integer> menuId;

    private Auth          auth;

    private List<Auth>    auths;

    private List<Menu>    menus;

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
     * Getter method for property <tt>menuId</tt>.
     * 
     * @return property value of menuId
     */
    public List<Integer> getMenuId() {
        return menuId;
    }

    /**
     * Setter method for property <tt>menuId</tt>.
     * 
     * @param menuId value to be assigned to property menuId
     */
    public void setMenuId(List<Integer> menuId) {
        this.menuId = menuId;
    }

    /**
     * Getter method for property <tt>auth</tt>.
     * 
     * @return property value of auth
     */
    public Auth getAuth() {
        return auth;
    }

    /**
     * Setter method for property <tt>auth</tt>.
     * 
     * @param auth value to be assigned to property auth
     */
    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    /**
     * Getter method for property <tt>auths</tt>.
     * 
     * @return property value of auths
     */
    public List<Auth> getAuths() {
        return auths;
    }

    /**
     * Setter method for property <tt>auths</tt>.
     * 
     * @param auths value to be assigned to property auths
     */
    public void setAuths(List<Auth> auths) {
        this.auths = auths;
    }

    /**
     * Getter method for property <tt>menus</tt>.
     * 
     * @return property value of menus
     */
    public List<Menu> getMenus() {
        return menus;
    }

    /**
     * Setter method for property <tt>menus</tt>.
     * 
     * @param menus value to be assigned to property menus
     */
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void formToAuth(Auth auth) {
        auth.setName(name);
        auth.setMenuIds(CollectionUtil.integerListToString(menuId, Constants.SEGMENTATION));
    }

}
