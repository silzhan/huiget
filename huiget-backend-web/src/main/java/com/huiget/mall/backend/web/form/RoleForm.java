/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.List;

import com.huiget.mall.common.dal.entity.Auth;
import com.huiget.mall.common.dal.entity.Role;

/**
 * 
 * @author yaofang
 * @version $Id: RoleForm.java, v 0.1 2014年9月26日 下午2:13:36 yaofang Exp $
 */
public class RoleForm extends BaseForm {

    private String     name;

    private String     description;

    private int        authId;

    private Role       role;

    private List<Role> roles;

    private List<Auth> auths;

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
     * Getter method for property <tt>description</tt>.
     * 
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property <tt>description</tt>.
     * 
     * @param description value to be assigned to property description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter method for property <tt>authId</tt>.
     * 
     * @return property value of authId
     */
    public int getAuthId() {
        return authId;
    }

    /**
     * Setter method for property <tt>authId</tt>.
     * 
     * @param authId value to be assigned to property authId
     */
    public void setAuthId(int authId) {
        this.authId = authId;
    }

    /**
     * Getter method for property <tt>role</tt>.
     * 
     * @return property value of role
     */
    public Role getRole() {
        return role;
    }

    /**
     * Setter method for property <tt>role</tt>.
     * 
     * @param role value to be assigned to property role
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Getter method for property <tt>roles</tt>.
     * 
     * @return property value of roles
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * Setter method for property <tt>roles</tt>.
     * 
     * @param roles value to be assigned to property roles
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
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

    public void formToRole(Role role) {
        role.setName(name);
        role.setDescription(description);
        role.setAuthId(authId);
    }

}
