/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: BrandInfo.java, v 0.1 2014年9月25日 下午4:54:25 yaofang Exp $
 */
public class Brand extends BaseEntity {

    private String nameEn;

    private String nameCn;

    private String logo;

    private String description;

    private String status;

    private int    weight;

    /**
     * Getter method for property <tt>nameEn</tt>.
     * 
     * @return property value of nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Setter method for property <tt>nameEn</tt>.
     * 
     * @param nameEn value to be assigned to property nameEn
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    /**
     * Getter method for property <tt>nameCn</tt>.
     * 
     * @return property value of nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    /**
     * Setter method for property <tt>nameCn</tt>.
     * 
     * @param nameCn value to be assigned to property nameCn
     */
    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    /**
     * Getter method for property <tt>logo</tt>.
     * 
     * @return property value of logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Setter method for property <tt>logo</tt>.
     * 
     * @param logo value to be assigned to property logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
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
     * Getter method for property <tt>status</tt>.
     * 
     * @return property value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for property <tt>status</tt>.
     * 
     * @param status value to be assigned to property status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter method for property <tt>weight</tt>.
     * 
     * @return property value of weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Setter method for property <tt>weight</tt>.
     * 
     * @param weight value to be assigned to property weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

}
