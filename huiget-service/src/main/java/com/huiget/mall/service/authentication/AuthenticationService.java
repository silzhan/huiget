/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service.authentication;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

/**
 * 
 * @author yaofang
 * @version $Id: AuthenticationService.java, v 0.1 2014年7月15日 上午10:58:50 yaofang Exp $
 */
public class AuthenticationService implements InitializingBean {

    private static Map<String, AuthenticationDefinition> AUTHENTICATION_DEFINITION_REGISTER = new ConcurrentHashMap<String, AuthenticationDefinition>();

    private final AuthenticationDefinitionReader         authenticationDefinitionReader     = new AuthenticationDefinitionReader();

    private Resource                                     authenticationDefinitionLocation;

    /**
     * 判断当前访问资源是否认证
     * 
     * @param uri
     * @param isLogon
     * @return
     */
    public boolean isAuthentication(String uri, boolean isLogon) {
        AuthenticationDefinition authenticationDefinition = getAuthenticationDefinition(uri);
        return authenticationDefinition == null ? true
            : (authenticationDefinition.isNeedLogin() ? isLogon : true);
    }

    /**
     * 判断当前访问资源是否授权
     * 
     * @param uri
     * @param role
     * @return
     */
    public boolean isAuthorization(String uri, String role) {
        AuthenticationDefinition authenticationDefinition = getAuthenticationDefinition(uri);
        if (authenticationDefinition == null || authenticationDefinition.getRoles() == null) {
            return true;
        }

        return ArrayUtils.indexOf(authenticationDefinition.getRoles(),
            AuthenticationDefinitionReader.ROLE_ALL) != -1
               || ArrayUtils.indexOf(authenticationDefinition.getRoles(), role) != -1;
    }

    public AuthenticationDefinition getAuthenticationDefinition(String key) {
        return AUTHENTICATION_DEFINITION_REGISTER.get(key);
    }

    /** 
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        authenticationDefinitionReader.loadAuthenticationDefinition(
            authenticationDefinitionLocation, AUTHENTICATION_DEFINITION_REGISTER);
    }

    /**
     * Getter method for property <tt>authenticationDefinitionLocation</tt>.
     * 
     * @return property value of authenticationDefinitionLocation
     */
    public Resource getAuthenticationDefinitionLocation() {
        return authenticationDefinitionLocation;
    }

    /**
     * Setter method for property <tt>authenticationDefinitionLocation</tt>.
     * 
     * @param authenticationDefinitionLocation value to be assigned to property authenticationDefinitionLocation
     */
    public void setAuthenticationDefinitionLocation(Resource authenticationDefinitionLocation) {
        this.authenticationDefinitionLocation = authenticationDefinitionLocation;
    }

}
