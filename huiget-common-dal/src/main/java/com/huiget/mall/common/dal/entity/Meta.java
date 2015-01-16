/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: MetaInfo.java, v 0.1 2014年9月25日 下午2:36:08 yaofang Exp $
 */
public class Meta extends BaseEntity {

    private String uri;

    private String title;

    private String keywords;

    private String description;

    /**
     * Getter method for property <tt>uri</tt>.
     * 
     * @return property value of uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Setter method for property <tt>uri</tt>.
     * 
     * @param uri value to be assigned to property uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Getter method for property <tt>title</tt>.
     * 
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property <tt>title</tt>.
     * 
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property <tt>keywords</tt>.
     * 
     * @return property value of keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Setter method for property <tt>keywords</tt>.
     * 
     * @param keywords value to be assigned to property keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * Getter method for property <tt>description</tt>.
     * 
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property <tt>description</tt>.
     * 
     * @param description value to be assigned to property description
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
