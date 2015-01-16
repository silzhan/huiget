/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.common.integration;

import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author yaofang
 * @version $Id: IntegrationService.java, v 0.1 2014年9月26日 下午4:19:05 yaofang Exp $
 */
public abstract class IntegrationService {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected String getJsonString(Map<String, String> queryStrings) {
        HttpClient httpclient = new DefaultHttpClient();

        HttpGet httpget = new HttpGet(getURI(queryStrings));
        try {
            HttpResponse response = httpclient.execute(httpget);

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                return EntityUtils.toString(entity, "UTF-8");
            }
        } catch (Exception e) {
            httpget.abort();
            logger.error(e.getMessage(), e);
        }

        httpclient.getConnectionManager().shutdown();

        return "{\"code\":1}";
    }

    protected abstract String getURI();

    private String getURI(Map<String, String> queryStrings) {
        StringBuilder uri = new StringBuilder();
        uri.append(getURI());
        uri.append("?");
        for (String queryString : queryStrings.keySet()) {
            uri.append(queryString);
            uri.append("=");
            uri.append(queryStrings.get(queryString));
            uri.append("&");
        }
        return uri.substring(0, uri.length() - 1);
    }
}
