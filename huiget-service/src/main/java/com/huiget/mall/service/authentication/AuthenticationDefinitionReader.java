/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service.authentication;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;

/**
 * 
 * @author yaofang
 * @version $Id: AuthenticationDefinitionReader.java, v 0.1 2014年7月15日 上午10:39:34 yaofang Exp $
 */
public class AuthenticationDefinitionReader {

    private Logger              logger             = LoggerFactory
                                                       .getLogger(AuthenticationDefinitionReader.class);

    private static final String NEED_LOGIN_ATTR    = "needLogin";
    private static final String AUTHENTICATIONS_EL = "authentications";
    private static final String AUTHENTICATION_EL  = "authentication";
    private static final String URI_PREFIX_ATTR    = "uriPrefix";
    private static final String URI_ATTR           = "uri";
    private static final String ROLES_ATTR         = "roles";
    public static final String  ROLE_ALL           = "all";

    @SuppressWarnings("unchecked")
    public void loadAuthenticationDefinition(Resource resource,
                                             Map<String, AuthenticationDefinition> register) {
        SAXReader reader = new SAXReader();
        Document doc = null;
        try {
            doc = reader.read(resource.getInputStream());
            final Element rootEl = doc.getRootElement();
            final String globalLoginFlag = StringUtils.trimToEmpty(rootEl
                .attributeValue(NEED_LOGIN_ATTR));
            final String globalRoles = StringUtils.defaultIfEmpty(
                rootEl.attributeValue(ROLES_ATTR), ROLE_ALL);

            // <authentications>
            List<Element> authenticationsEls = rootEl.elements(AUTHENTICATIONS_EL);
            for (Element authenticationsEl : authenticationsEls) {
                String uriPrefix = StringUtils.trimToEmpty(authenticationsEl
                    .attributeValue(URI_PREFIX_ATTR));
                String parentLoginFlag = StringUtils.defaultIfEmpty(
                    authenticationsEl.attributeValue(NEED_LOGIN_ATTR), globalLoginFlag);
                String parentRoles = StringUtils.defaultIfEmpty(
                    authenticationsEl.attributeValue(ROLES_ATTR), globalRoles);

                //<authentication>
                List<Element> authenticationEls = authenticationsEl.elements(AUTHENTICATION_EL);
                for (Element authenticationEl : authenticationEls) {
                    processAuthenticationsEl(uriPrefix, parentLoginFlag, parentRoles,
                        authenticationEl, register);
                }
            }
        } catch (DocumentException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }

    private void processAuthenticationsEl(String uriPrefix, String parentLoginFlag,
                                          String parentRoles, Element authenticationEl,
                                          Map<String, AuthenticationDefinition> register) {
        String loginFlag = StringUtils.defaultIfEmpty(
            authenticationEl.attributeValue(NEED_LOGIN_ATTR), parentLoginFlag);
        String roles = StringUtils.defaultIfEmpty(authenticationEl.attributeValue(ROLES_ATTR),
            parentRoles);

        String uri = (uriPrefix + StringUtils
            .trimToEmpty(authenticationEl.attributeValue(URI_ATTR)));

        AuthenticationDefinition authenticationDefinition = new AuthenticationDefinition();
        authenticationDefinition.setNeedLogin("true".equalsIgnoreCase(loginFlag));
        authenticationDefinition.setUri(uri);
        authenticationDefinition.setRoles(roles.split(","));

        register.put(uri, authenticationDefinition);
    }

}
