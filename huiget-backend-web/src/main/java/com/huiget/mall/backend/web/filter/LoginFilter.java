/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.filter;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import com.huiget.mall.common.util.ApplicationContextUtil;
import com.huiget.mall.common.util.CookieUtil;
import com.huiget.mall.common.util.IPUtil;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.common.util.web.context.WebContext;
import com.huiget.mall.common.util.web.context.WebContextHolder;
import com.huiget.mall.service.authentication.AuthenticationService;

/**
 * 
 * @author yaofang
 * @version $Id: LoginFilter.java, v 0.1 2014年7月16日 下午3:16:59 yaofang Exp $
 */
public class LoginFilter extends OncePerRequestFilter {

    private Logger logger = LoggerFactory.getLogger(LoginFilter.class);

    /** 
     * @see org.springframework.web.filter.OncePerRequestFilter#doFilterInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        WebContext context = WebContextHolder.get();

        try {
            // 上下文不为空，忽略
            if (context != null) {
                return;
            }

            context = getWebContext(request, response);

            String uri = request.getRequestURI();
            context.setRequestURI("".equals(uri) ? "/" : uri);

            // 保存上下文
            WebContextHolder.set(context);

            AuthenticationService authenticationService = ApplicationContextUtil.getBean(AuthenticationService.class);
            if (authenticationService.isAuthentication(uri, context.isLogon())) {
                filterChain.doFilter(request, response);

                return;
            }

            if (isAjax(request)) {
                response.setContentType("application/json");
                response.getWriter().write("{\"status\":\"403\"}");
            } else {
                String encodeURL = URLEncoder.encode((uri + (StringUtils.isBlank(request.getQueryString()) ? "" : "?" + request.getQueryString())), "UTF-8");

                response.sendRedirect("/member/login?redirectURL=" + encodeURL);
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);

            if (isAjax(request)) {
                response.setContentType("application/json");
                response.getWriter().write("{\"status\":\"500\"}");
            }
        } finally {
            WebContextHolder.remove();
        }
    }

    private WebContext getWebContext(HttpServletRequest request, HttpServletResponse response) {
        WebContext context = new WebContext();
        context.setIp(IPUtil.getIpAddr(request));

        // 该处实现登录控制
        CookieUtil cookieUtil = new CookieUtil(request, response);
        cookieUtil.getCookie(Constants.COOKIE_CONTEXT_ID);

        return context;
    }

    private boolean isAjax(HttpServletRequest request) {
        return StringUtils.equalsIgnoreCase(request.getHeader("X-Requested-With"), "XMLHttpRequest");
    }

}
