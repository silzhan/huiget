/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

import com.huiget.mall.common.dal.entity.Operator;
import com.huiget.mall.common.dal.entity.Role;

/**
 * 
 * @author yaofang
 * @version $Id: OperatorForm.java, v 0.1 2014年9月26日 下午2:29:51 yaofang Exp $
 */
public class OperatorForm extends BaseForm {

    private String         userName;

    private String         password;

    private int            roleId;

    private String         status;

    private String         name;

    private String         number;

    private String         department;

    private String         remark;

    private Operator       operator;

    private List<Operator> operators;

    private List<Role>     roles;

    /**
     * Getter method for property <tt>userName</tt>.
     * 
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     * 
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>password</tt>.
     * 
     * @return property value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property <tt>password</tt>.
     * 
     * @param password value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter method for property <tt>roleId</tt>.
     * 
     * @return property value of roleId
     */
    public int getRoleId() {
        return roleId;
    }

    /**
     * Setter method for property <tt>roleId</tt>.
     * 
     * @param roleId value to be assigned to property roleId
     */
    public void setRoleId(int roleId) {
        this.roleId = roleId;
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
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>number</tt>.
     * 
     * @return property value of number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Setter method for property <tt>number</tt>.
     * 
     * @param number value to be assigned to property number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter method for property <tt>department</tt>.
     * 
     * @return property value of department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Setter method for property <tt>department</tt>.
     * 
     * @param department value to be assigned to property department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Getter method for property <tt>remark</tt>.
     * 
     * @return property value of remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Setter method for property <tt>remark</tt>.
     * 
     * @param remark value to be assigned to property remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Getter method for property <tt>operator</tt>.
     * 
     * @return property value of operator
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Setter method for property <tt>operator</tt>.
     * 
     * @param operator value to be assigned to property operator
     */
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    /**
     * Getter method for property <tt>operators</tt>.
     * 
     * @return property value of operators
     */
    public List<Operator> getOperators() {
        return operators;
    }

    /**
     * Setter method for property <tt>operators</tt>.
     * 
     * @param operators value to be assigned to property operators
     */
    public void setOperators(List<Operator> operators) {
        this.operators = operators;
    }

    /**
     * Getter method for property <tt>roles</tt>.
     * 
     * @return property value of roles
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * Setter method for property <tt>roles</tt>.
     * 
     * @param roles value to be assigned to property roles
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void formToOperator(Operator operator) {
        operator.setDepartment(department);
        operator.setName(name);
        operator.setNumber(number);
        operator.setPassword(DigestUtils.md5Hex(password));
        operator.setRemark(remark);
        operator.setRoleId(roleId);
        operator.setStatus(status);
        operator.setUserName(userName);
    }

}
