/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.common.util.constants.UserConstants;
import com.huiget.mall.common.util.constants.UserGender;

/**
 * 
 * @author yaofang
 * @version $Id: User.java, v 0.1 2014年10月4日 下午7:04:49 yaofang Exp $
 */
public class User extends BaseEntity {

    private String nickName;

    private String level                = UserConstants.USER_LEVEL_V1;

    private String realName;

    private String avatar;

    private String gender               = UserGender.SECRET.getCode();

    private String birthday;

    private String mobilePhone;

    private String mobilePhoneValidated = Constants.STATUS_INVALID;

    private String email;

    private String emailValidated       = Constants.STATUS_INVALID;

    private String country              = UserConstants.USER_COUNTRY_CHINA;

    private String province;

    private String city;

    private String area;

    private String address;

    private String status               = UserConstants.USER_STATUS_NORMAL;

    private String transPassword;

    /**
     * Getter method for property <tt>nickName</tt>.
     * 
     * @return property value of nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Setter method for property <tt>nickName</tt>.
     * 
     * @param nickName value to be assigned to property nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * Getter method for property <tt>level</tt>.
     * 
     * @return property value of level
     */
    public String getLevel() {
        return level;
    }

    /**
     * Setter method for property <tt>level</tt>.
     * 
     * @param level value to be assigned to property level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Getter method for property <tt>realName</tt>.
     * 
     * @return property value of realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Setter method for property <tt>realName</tt>.
     * 
     * @param realName value to be assigned to property realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * Getter method for property <tt>avatar</tt>.
     * 
     * @return property value of avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Setter method for property <tt>avatar</tt>.
     * 
     * @param avatar value to be assigned to property avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Getter method for property <tt>gender</tt>.
     * 
     * @return property value of gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter method for property <tt>gender</tt>.
     * 
     * @param gender value to be assigned to property gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter method for property <tt>birthday</tt>.
     * 
     * @return property value of birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Setter method for property <tt>birthday</tt>.
     * 
     * @param birthday value to be assigned to property birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
     * Getter method for property <tt>mobilePhoneValidated</tt>.
     * 
     * @return property value of mobilePhoneValidated
     */
    public String getMobilePhoneValidated() {
        return mobilePhoneValidated;
    }

    /**
     * Setter method for property <tt>mobilePhoneValidated</tt>.
     * 
     * @param mobilePhoneValidated value to be assigned to property mobilePhoneValidated
     */
    public void setMobilePhoneValidated(String mobilePhoneValidated) {
        this.mobilePhoneValidated = mobilePhoneValidated;
    }

    /**
     * Getter method for property <tt>email</tt>.
     * 
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property <tt>email</tt>.
     * 
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method for property <tt>emailValidated</tt>.
     * 
     * @return property value of emailValidated
     */
    public String getEmailValidated() {
        return emailValidated;
    }

    /**
     * Setter method for property <tt>emailValidated</tt>.
     * 
     * @param emailValidated value to be assigned to property emailValidated
     */
    public void setEmailValidated(String emailValidated) {
        this.emailValidated = emailValidated;
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
     * Getter method for property <tt>transPassword</tt>.
     * 
     * @return property value of transPassword
     */
    public String getTransPassword() {
        return transPassword;
    }

    /**
     * Setter method for property <tt>transPassword</tt>.
     * 
     * @param transPassword value to be assigned to property transPassword
     */
    public void setTransPassword(String transPassword) {
        this.transPassword = transPassword;
    }

}
