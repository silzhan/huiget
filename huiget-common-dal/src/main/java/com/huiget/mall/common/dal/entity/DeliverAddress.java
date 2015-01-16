/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.common.util.constants.UserConstants;

/**
 * 
 * @author yaofang
 * @version $Id: DeliverAddress.java, v 0.1 2014年10月5日 上午8:29:46 yaofang Exp $
 */
public class DeliverAddress extends BaseEntity {

    private int    userId;

    private String receiverName;

    private String country       = UserConstants.USER_COUNTRY_CHINA;

    private String province;

    private String city;

    private String area;

    private String town;

    private String address;

    private String postcode;

    private String mobilePhone;

    private String telePhone;

    private String defaultStatus = Constants.STATUS_INVALID;

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
     * Getter method for property <tt>receiverName</tt>.
     * 
     * @return property value of receiverName
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Setter method for property <tt>receiverName</tt>.
     * 
     * @param receiverName value to be assigned to property receiverName
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * Getter method for property <tt>country</tt>.
     * 
     * @return property value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter method for property <tt>country</tt>.
     * 
     * @param country value to be assigned to property country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter method for property <tt>province</tt>.
     * 
     * @return property value of province
     */
    public String getProvince() {
        return province;
    }

    /**
     * Setter method for property <tt>province</tt>.
     * 
     * @param province value to be assigned to property province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Getter method for property <tt>city</tt>.
     * 
     * @return property value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for property <tt>city</tt>.
     * 
     * @param city value to be assigned to property city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter method for property <tt>area</tt>.
     * 
     * @return property value of area
     */
    public String getArea() {
        return area;
    }

    /**
     * Setter method for property <tt>area</tt>.
     * 
     * @param area value to be assigned to property area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Getter method for property <tt>town</tt>.
     * 
     * @return property value of town
     */
    public String getTown() {
        return town;
    }

    /**
     * Setter method for property <tt>town</tt>.
     * 
     * @param town value to be assigned to property town
     */
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * Getter method for property <tt>address</tt>.
     * 
     * @return property value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for property <tt>address</tt>.
     * 
     * @param address value to be assigned to property address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter method for property <tt>postcode</tt>.
     * 
     * @return property value of postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Setter method for property <tt>postcode</tt>.
     * 
     * @param postcode value to be assigned to property postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Getter method for property <tt>mobilePhone</tt>.
     * 
     * @return property value of mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Setter method for property <tt>mobilePhone</tt>.
     * 
     * @param mobilePhone value to be assigned to property mobilePhone
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * Getter method for property <tt>telePhone</tt>.
     * 
     * @return property value of telePhone
     */
    public String getTelePhone() {
        return telePhone;
    }

    /**
     * Setter method for property <tt>telePhone</tt>.
     * 
     * @param telePhone value to be assigned to property telePhone
     */
    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    /**
     * Getter method for property <tt>defaultStatus</tt>.
     * 
     * @return property value of defaultStatus
     */
    public String getDefaultStatus() {
        return defaultStatus;
    }

    /**
     * Setter method for property <tt>defaultStatus</tt>.
     * 
     * @param defaultStatus value to be assigned to property defaultStatus
     */
    public void setDefaultStatus(String defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

}
