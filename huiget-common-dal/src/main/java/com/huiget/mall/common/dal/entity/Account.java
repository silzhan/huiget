/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

import com.huiget.mall.common.util.constants.AccountConstants;

/**
 * 
 * @author yaofang
 * @version $Id: Account.java, v 0.1 2014年10月5日 上午7:58:46 yaofang Exp $
 */
public class Account extends BaseEntity {

    private int    userId;

    private String acctType   = AccountConstants.ACCT_TYPE_BASEDT;

    private String capType    = AccountConstants.CAP_TYPE_CASH;

    private String curyType   = AccountConstants.CURY_TYPE_CNY;

    private String acctName;

    private int    acctBal;

    private int    avlBal;

    private int    frzBal;

    private String acctStatus = AccountConstants.ACCT_STATUS_NORMAL;

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
     * Getter method for property <tt>acctType</tt>.
     * 
     * @return property value of acctType
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Setter method for property <tt>acctType</tt>.
     * 
     * @param acctType value to be assigned to property acctType
     */
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    /**
     * Getter method for property <tt>capType</tt>.
     * 
     * @return property value of capType
     */
    public String getCapType() {
        return capType;
    }

    /**
     * Setter method for property <tt>capType</tt>.
     * 
     * @param capType value to be assigned to property capType
     */
    public void setCapType(String capType) {
        this.capType = capType;
    }

    /**
     * Getter method for property <tt>curyType</tt>.
     * 
     * @return property value of curyType
     */
    public String getCuryType() {
        return curyType;
    }

    /**
     * Setter method for property <tt>curyType</tt>.
     * 
     * @param curyType value to be assigned to property curyType
     */
    public void setCuryType(String curyType) {
        this.curyType = curyType;
    }

    /**
     * Getter method for property <tt>acctName</tt>.
     * 
     * @return property value of acctName
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Setter method for property <tt>acctName</tt>.
     * 
     * @param acctName value to be assigned to property acctName
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    /**
     * Getter method for property <tt>acctBal</tt>.
     * 
     * @return property value of acctBal
     */
    public int getAcctBal() {
        return acctBal;
    }

    /**
     * Setter method for property <tt>acctBal</tt>.
     * 
     * @param acctBal value to be assigned to property acctBal
     */
    public void setAcctBal(int acctBal) {
        this.acctBal = acctBal;
    }

    /**
     * Getter method for property <tt>avlBal</tt>.
     * 
     * @return property value of avlBal
     */
    public int getAvlBal() {
        return avlBal;
    }

    /**
     * Setter method for property <tt>avlBal</tt>.
     * 
     * @param avlBal value to be assigned to property avlBal
     */
    public void setAvlBal(int avlBal) {
        this.avlBal = avlBal;
    }

    /**
     * Getter method for property <tt>frzBal</tt>.
     * 
     * @return property value of frzBal
     */
    public int getFrzBal() {
        return frzBal;
    }

    /**
     * Setter method for property <tt>frzBal</tt>.
     * 
     * @param frzBal value to be assigned to property frzBal
     */
    public void setFrzBal(int frzBal) {
        this.frzBal = frzBal;
    }

    /**
     * Getter method for property <tt>acctStatus</tt>.
     * 
     * @return property value of acctStatus
     */
    public String getAcctStatus() {
        return acctStatus;
    }

    /**
     * Setter method for property <tt>acctStatus</tt>.
     * 
     * @param acctStatus value to be assigned to property acctStatus
     */
    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }

}
