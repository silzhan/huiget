/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.List;

import com.huiget.mall.common.dal.entity.Meta;

/**
 * 
 * @author yaofang
 * @version $Id: MetaInfoForm.java, v 0.1 2014年9月25日 下午2:59:06 yaofang Exp $
 */
public class MetaForm extends BaseForm {

    private String     uri;

    private String     title;

    private String     keywords;

    private String     description;

    private Meta       meta;

    private List<Meta> metas;

    /**
     * Getter method for property <tt>url</tt>.
     * 
     * @return property value of url
     */
    public String getUri() {
        return uri;
    }

    /**
     * Setter method for property <tt>url</tt>.
     * 
     * @param url value to be assigned to property url
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

    /**
     * Getter method for property <tt>metaInfo</tt>.
     * 
     * @return property value of metaInfo
     */
    public Meta getMetaInfo() {
        return meta;
    }

    /**
     * Setter method for property <tt>metaInfo</tt>.
     * 
     * @param metaInfo value to be assigned to property metaInfo
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * Getter method for property <tt>metaInfos</tt>.
     * 
     * @return property value of metaInfos
     */
    public List<Meta> getMetas() {
        return metas;
    }

    /**
     * Setter method for property <tt>metaInfos</tt>.
     * 
     * @param metaInfos value to be assigned to property metaInfos
     */
    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }

    public void metaToForm() {
        setId(meta.getId());
        setDescription(meta.getDescription());
        setKeywords(meta.getKeywords());
        setTitle(meta.getTitle());
        setUri(meta.getUri());
    }

    public void formToMeta(Meta meta) {
        meta.setDescription(description);
        meta.setKeywords(keywords);
        meta.setTitle(title);
        meta.setUri(uri);
    }

}
