/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.util.constants;

/**
 * 
 * @author yaofang
 * @version $Id: UserGender.java, v 0.1 2014年10月4日 下午7:34:37 yaofang Exp $
 */
public enum UserGender {

    SECRET("S", "保密"),

    MALE("M", "男"),

    FEMALE("F", "女");

    private String code;

    private String name;

    /**
     * @param code
     * @param name
     */
    private UserGender(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public static String getName(String code) {
        for (UserGender userGender : values()) {
            if (userGender.code.equals(code)) {
                return userGender.name;
            }
        }
        return code;
    }

}
