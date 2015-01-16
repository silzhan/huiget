/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.common.integration;

/**
 * 
 * @author yaofang
 * @version $Id: BaseInfo.java, v 0.1 2014年9月26日 下午4:13:44 yaofang Exp $
 */
public class BaseInfo {

    private int code;

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public int getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return code == 0;
    }

}
