/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: Cart.java, v 0.1 2014年10月7日 下午1:17:01 yaofang Exp $
 */
public class Cart extends BaseEntity {

    private int    userId;

    private String sid;

    private int    productId;

    private int    quality;

    /**
     * Getter method for property <tt>userId</tt>.
     * 
     * @return property value of userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     * 
     * @param userId value to be assigned to property userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>sid</tt>.
     * 
     * @return property value of sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * Setter method for property <tt>sid</tt>.
     * 
     * @param sid value to be assigned to property sid
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * Getter method for property <tt>productId</tt>.
     * 
     * @return property value of productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Setter method for property <tt>productId</tt>.
     * 
     * @param productId value to be assigned to property productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * Getter method for property <tt>quality</tt>.
     * 
     * @return property value of quality
     */
    public int getQuality() {
        return quality;
    }

    /**
     * Setter method for property <tt>quality</tt>.
     * 
     * @param quality value to be assigned to property quality
     */
    public void setQuality(int quality) {
        this.quality = quality;
    }

}
