/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import com.huiget.mall.common.util.constants.Constants;

/**
 * 
 * @author yaofang
 * @version $Id: URLUtil.java, v 0.1 2014年10月6日 下午1:52:07 yaofang Exp $
 */
public class URLUtil {

    public static String encode(String url) {
        try {
            return URLEncoder.encode(url, Constants.ENCODING_UTF_8);
        } catch (UnsupportedEncodingException e) {
            return url;
        }
    }

    public static String decode(String url) {
        try {
            return URLDecoder.decode(url, Constants.ENCODING_UTF_8);
        } catch (UnsupportedEncodingException e) {
            return url;
        }
    }

}
