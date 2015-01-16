/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.List;

import com.huiget.mall.common.dal.entity.Category;
import com.huiget.mall.common.dal.entity.CategoryProperty;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryPropertyForm.java, v 0.1 2014年9月26日 下午3:46:31 yaofang Exp $
 */
public class CategoryPropertyForm extends BaseForm {

    private int                    categoryId;

    private String                 name;

    private String                 status;

    private int                    weight;

    private CategoryProperty       categoryProperty;

    private List<CategoryProperty> categoryProperties;

    private List<Category>         categories;

    /**
     * Getter method for property <tt>categoryId</tt>.
     * 
     * @return property value of categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Setter method for property <tt>categoryId</tt>.
     * 
     * @param categoryId value to be assigned to property categoryId
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

    /**
     * Getter method for property <tt>categoryProperty</tt>.
     * 
     * @return property value of categoryProperty
     */
    public CategoryProperty getCategoryProperty() {
        return categoryProperty;
    }

    /**
     * Setter method for property <tt>categoryProperty</tt>.
     * 
     * @param categoryProperty value to be assigned to property categoryProperty
     */
    public void setCategoryProperty(CategoryProperty categoryProperty) {
        this.categoryProperty = categoryProperty;
    }

    /**
     * Getter method for property <tt>categoryProperties</tt>.
     * 
     * @return property value of categoryProperties
     */
    public List<CategoryProperty> getCategoryProperties() {
        return categoryProperties;
    }

    /**
     * Setter method for property <tt>categoryProperties</tt>.
     * 
     * @param categoryProperties value to be assigned to property categoryProperties
     */
    public void setCategoryProperties(List<CategoryProperty> categoryProperties) {
        this.categoryProperties = categoryProperties;
    }

    /**
     * Getter method for property <tt>categories</tt>.
     * 
     * @return property value of categories
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * Setter method for property <tt>categories</tt>.
     * 
     * @param categories value to be assigned to property categories
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void formToCategoryProperty(CategoryProperty categoryProperty) {
        categoryProperty.setCategoryId(categoryId);
        categoryProperty.setName(name);
        categoryProperty.setStatus(status);
        categoryProperty.setWeight(weight);
    }

}
