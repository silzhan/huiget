/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.util.constants;

/**
 * 
 * @author yaofang
 * @version $Id: ValidateInfoConstants.java, v 0.1 2014年10月6日 下午4:05:05 yaofang Exp $
 */
public class ValidateInfoConstants {

    public static final String VALIDATE_TYPE_VALIDATE_EMAIL               = "VALIDATE_EMAIL";
    public static final int    VALIDATE_EXPIRE_TIME_VALIDATE_EMAIL        = 24 * 3600 * 1000;

    public static final String VALIDATE_TYPE_VALIDATE_MOBILE_PHONE        = "VALIDATE_MOBILE_PHONE";
    public static final int    VALIDATE_EXPIRE_TIME_VALIDATE_MOBILE_PHONE = 1800 * 1000;

    public static final String VALIDATE_TYPE_FIND_PASSWORD                = "FIND_PASSWORD";
    public static final int    VALIDATE_EXPIRE_TIME_FIND_PASSWORD         = VALIDATE_EXPIRE_TIME_VALIDATE_EMAIL;

}
