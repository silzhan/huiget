/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.util.constants;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author yaofang
 * @version $Id: SystemParameterType.java, v 0.1 2014年9月24日 下午3:44:55 yaofang
 *          Exp $
 */
public enum SystemParameterType {

    CATEGORY_INFO_LEVEL("类目级别", "CATEGORY_INFO_LEVEL");

    private String typeName;

    private String type;

    /**
     * @param typeName
     * @param type
     */
    private SystemParameterType(String typeName, String type) {
        this.typeName = typeName;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static Map<String, String> toMap() {
        Map<String, String> paramTypeMap = new LinkedHashMap<String, String>();
        for (SystemParameterType systemParamType : values()) {
            paramTypeMap.put(systemParamType.type, systemParamType.typeName);
        }
        return paramTypeMap;
    }

    public static String getTypeName(String type) {
        for (SystemParameterType systemParamType : values()) {
            if (systemParamType.type.equals(type)) {
                return systemParamType.typeName;
            }
        }
        return type;
    }
}
