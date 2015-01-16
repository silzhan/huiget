/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.huiget.mall.common.dal.entity.LoginInfo;
import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.common.util.ApplicationContextUtil;
import com.huiget.mall.common.util.CookieUtil;
import com.huiget.mall.common.util.IPUtil;
import com.huiget.mall.common.util.URLUtil;
import com.huiget.mall.common.util.ValidateCodeGenerater;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.common.util.web.context.WebContext;
import com.huiget.mall.common.util.web.context.WebContextHolder;
import com.huiget.mall.service.LoginService;
import com.huiget.mall.service.UserService;
import com.huiget.mall.service.authentication.AuthenticationService;

/**
 * 
 * @author yaofang
 * @version $Id: LoginFilter.java, v 0.1 2014年10月3日 上午10:08:20 yaofang Exp $
 */
public class LoginFilter extends OncePerRequestFilter {

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
                String encodeURL = URLUtil.encode(uri + (StringUtils.isBlank(request.getQueryString()) ? "" : "?" + request.getQueryString()));

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
        String sid = cookieUtil.getCookie(Constants.COOKIE_SESSION_ID);
        if (StringUtils.isBlank(sid)) {
            cookieUtil.setCookie(Constants.COOKIE_SESSION_ID, ValidateCodeGenerater.generateSid(), 1000 * 24 * 3600);
        }
        context.setSid(sid);

        String cid = cookieUtil.getCookie(Constants.COOKIE_CONTEXT_ID);

        final ContextId contextId = new ContextId(cid);
        if (!contextId.isValid()) {
            return context;
        }

        LoginService loginService = ApplicationContextUtil.getBean(LoginService.class);
        LoginInfo loginInfo = loginService.findById(contextId.getloginId());
        if (loginInfo == null) {
            return context;
        }

        context.setLoginId(loginInfo.getId());
        context.setUserName(loginInfo.getUserName());

        UserService userService = ApplicationContextUtil.getBean(UserService.class);
        User user = userService.findById(contextId.getUserId());
        if (user != null) {
            context.setLogon(true);
            context.setNickName(StringUtils.isBlank(user.getNickName()) ? loginInfo.getUserName() : user.getNickName());
            context.setUserId(user.getId());
        }

        return context;
    }

    private boolean isAjax(HttpServletRequest request) {
        return StringUtils.equalsIgnoreCase(request.getHeader("X-Requested-With"), "XMLHttpRequest");
    }

    public static class ContextId {
        private Integer[] contextIdSplits;

        public ContextId(String cid) {
            String[] cidSplits = StringUtils.trimToEmpty(cid).split(":");
            if (cidSplits.length == 2) {
                contextIdSplits = new Integer[2];
                contextIdSplits[0] = Integer.parseInt(cidSplits[0]);
                contextIdSplits[1] = Integer.parseInt(cidSplits[1]);
            }
        }

        public int getUserId() {
            return contextIdSplits[0];
        }

        public int getloginId() {
            return contextIdSplits[1];
        }

        public boolean isValid() {
            return contextIdSplits != null && contextIdSplits.length == 2;
        }

    }

}
