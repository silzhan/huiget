/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member.account;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.common.util.constants.UserConstants;
import com.huiget.mall.common.util.constants.UserGender;
import com.huiget.mall.web.form.BaseForm;

/**
 * 
 * @author yaofang
 * @version $Id: ProfileForm.java, v 0.1 2014年10月3日 下午7:22:38 yaofang Exp $
 */
public class ProfileForm extends BaseForm {

    private String        nickName;

    private String        realName;

    private String        avatar;

    private MultipartFile file;

    private String        gender               = UserGender.SECRET.getCode();

    private String        birthday;

    private String        mobilePhone;

    private String        mobilePhoneValidated = Constants.STATUS_INVALID;

    private String        email;

    private String        emailValidated       = Constants.STATUS_INVALID;

    private String        country              = UserConstants.USER_COUNTRY_CHINA;

    private String        province;

    private String        city;

    private String        area;

    private String        address;

    private User          user;

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
     * Getter method for property <tt>file</tt>.
     * 
     * @return property value of file
     */
    public MultipartFile getFile() {
        return file;
    }

    /**
     * Setter method for property <tt>file</tt>.
     * 
     * @param file value to be assigned to property file
     */
    public void setFile(MultipartFile file) {
        this.file = file;
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
     * Getter method for property <tt>user</tt>.
     * 
     * @return property value of user
     */
    public User getUser() {
        return user;
    }

    /**
     * Setter method for property <tt>user</tt>.
     * 
     * @param user value to be assigned to property user
     */
    public void setUser(User user) {
        this.user = user;
    }

    public void userToForm() {
        if (user != null) {
            setNickName(user.getNickName());
            setAddress(user.getAddress());
            setArea(user.getArea());
            setBirthday(user.getBirthday());
            setCity(user.getCity());
            setMobilePhone(user.getMobilePhone());
            setMobilePhoneValidated(user.getMobilePhoneValidated());
            setEmail(user.getEmail());
            setEmailValidated(user.getEmailValidated());
            setProvince(user.getProvince());
            setRealName(user.getRealName());
            setGender(user.getGender());
        }
    }

    public void formToUser(User user) {
        user.setNickName(nickName);
        user.setAddress(address);
        user.setArea(area);
        user.setBirthday(birthday);
        user.setCity(city);
        if (StringUtils.equals(Constants.STATUS_INVALID, user.getMobilePhoneValidated())) {
            user.setMobilePhone(mobilePhone);
        }
        if (StringUtils.equals(Constants.STATUS_INVALID, user.getEmailValidated())) {
            user.setEmail(email);
        }
        user.setProvince(province);
        user.setRealName(realName);
        user.setGender(gender);
    }

}
