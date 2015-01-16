/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service.authentication;

/**
 * 
 * @author yaofang
 * @version $Id: AuthenticationDefinition.java, v 0.1 2014年7月15日 上午10:37:14 yaofang Exp $
 */
public class AuthenticationDefinition {

    private boolean  needLogin;

    private String   uri;

    private String[] roles;

    /**
     * Getter method for property <tt>needLogin</tt>.
     * 
     * @return property value of needLogin
     */
    public boolean isNeedLogin() {
        return needLogin;
    }

    /**
     * Setter method for property <tt>needLogin</tt>.
     * 
     * @param needLogin value to be assigned to property needLogin
     */
    public void setNeedLogin(boolean needLogin) {
        this.needLogin = needLogin;
    }

    /**
     * Getter method for property <tt>uri</tt>.
     * 
     * @return property value of uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Setter method for property <tt>uri</tt>.
     * 
     * @param uri value to be assigned to property uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Getter method for property <tt>roles</tt>.
     * 
     * @return property value of roles
     */
    public String[] getRoles() {
        return roles;
    }

    /**
     * Setter method for property <tt>roles</tt>.
     * 
     * @param roles value to be assigned to property roles
     */
    public void setRoles(String[] roles) {
        this.roles = roles;
    }

}
