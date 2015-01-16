/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

import java.math.BigDecimal;

/**
 * 
 * @author yaofang
 * @version $Id: Product.java, v 0.1 2014年10月7日 下午2:31:38 yaofang Exp $
 */
public class Product extends BaseEntity {

    private String channel;

    private String category;

    private String prodId;

    private String prodName;

    private String price;

    private String discountPrice;

    private String discount;

    private String merName;

    private String detailLink;

    private String recommendReason;

    private String prodPic;

    /**
     * Getter method for property <tt>channel</tt>.
     * 
     * @return property value of channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Setter method for property <tt>channel</tt>.
     * 
     * @param channel value to be assigned to property channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * Getter method for property <tt>prodId</tt>.
     * 
     * @return property value of prodId
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * Setter method for property <tt>prodId</tt>.
     * 
     * @param prodId value to be assigned to property prodId
     */
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    /**
     * Getter method for property <tt>category</tt>.
     * 
     * @return property value of category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Setter method for property <tt>category</tt>.
     * 
     * @param category value to be assigned to property category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Getter method for property <tt>prodName</tt>.
     * 
     * @return property value of prodName
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * Setter method for property <tt>prodName</tt>.
     * 
     * @param prodName value to be assigned to property prodName
     */
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    /**
     * Getter method for property <tt>price</tt>.
     * 
     * @return property value of price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Setter method for property <tt>price</tt>.
     * 
     * @param price value to be assigned to property price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceForShow() {
        return price;
    }

    /**
     * Getter method for property <tt>discountPrice</tt>.
     * 
     * @return property value of discountPrice
     */
    public String getDiscountPrice() {
        return discountPrice;
    }

    /**
     * Setter method for property <tt>discountPrice</tt>.
     * 
     * @param discountPrice value to be assigned to property discountPrice
     */
    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDiscountPriceForShow() {
        return discountPrice;
    }

    /**
     * Getter method for property <tt>discount</tt>.
     * 
     * @return property value of discount
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Setter method for property <tt>discount</tt>.
     * 
     * @param discount value to be assigned to property discount
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public float getDiscountForShow() {
        return (new BigDecimal(discount).setScale(2, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100))).floatValue() / 10f;
    }

    /**
     * Getter method for property <tt>merName</tt>.
     * 
     * @return property value of merName
     */
    public String getMerName() {
        return merName;
    }

    /**
     * Setter method for property <tt>merName</tt>.
     * 
     * @param merName value to be assigned to property merName
     */
    public void setMerName(String merName) {
        this.merName = merName;
    }

    /**
     * Getter method for property <tt>detailLink</tt>.
     * 
     * @return property value of detailLink
     */
    public String getDetailLink() {
        return detailLink;
    }

    /**
     * Setter method for property <tt>detailLink</tt>.
     * 
     * @param detailLink value to be assigned to property detailLink
     */
    public void setDetailLink(String detailLink) {
        this.detailLink = detailLink;
    }

    /**
     * Getter method for property <tt>recommendReason</tt>.
     * 
     * @return property value of recommendReason
     */
    public String getRecommendReason() {
        return recommendReason;
    }

    /**
     * Setter method for property <tt>recommendReason</tt>.
     * 
     * @param recommendReason value to be assigned to property recommendReason
     */
    public void setRecommendReason(String recommendReason) {
        this.recommendReason = recommendReason;
    }

    /**
     * Getter method for property <tt>prodPic</tt>.
     * 
     * @return property value of prodPic
     */
    public String getProdPic() {
        return prodPic;
    }

    /**
     * Setter method for property <tt>prodPic</tt>.
     * 
     * @param prodPic value to be assigned to property prodPic
     */
    public void setProdPic(String prodPic) {
        this.prodPic = prodPic;
    }

}
