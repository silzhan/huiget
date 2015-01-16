/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.search;

import com.huiget.mall.common.dal.entity.Category;
import com.huiget.mall.web.form.BaseForm;

/**
 * 
 * @author yaofang
 * @version $Id: SearchForm.java, v 0.1 2014年10月7日 上午11:09:32 yaofang Exp $
 */
public class SearchForm extends BaseForm {

    private String   key;

    private int      categoryId;

    private int      brandId;

    private int      styleId;

    private String   price;

    private String   catName;

    private Category category;

    /**
     * Getter method for property <tt>key</tt>.
     * 
     * @return property value of key
     */
    public String getKey() {
        return key;
    }

    /**
     * Setter method for property <tt>key</tt>.
     * 
     * @param key value to be assigned to property key
     */
    public void setKey(String key) {
        this.key = key;
    }

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
     * Getter method for property <tt>brandId</tt>.
     * 
     * @return property value of brandId
     */
    public int getBrandId() {
        return brandId;
    }

    /**
     * Setter method for property <tt>brandId</tt>.
     * 
     * @param brandId value to be assigned to property brandId
     */
    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    /**
     * Getter method for property <tt>styleId</tt>.
     * 
     * @return property value of styleId
     */
    public int getStyleId() {
        return styleId;
    }

    /**
     * Setter method for property <tt>styleId</tt>.
     * 
     * @param styleId value to be assigned to property styleId
     */
    public void setStyleId(int styleId) {
        this.styleId = styleId;
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

    /**
     * Getter method for property <tt>catName</tt>.
     * 
     * @return property value of catName
     */
    public String getCatName() {
        return catName;
    }

    /**
     * Setter method for property <tt>catName</tt>.
     * 
     * @param catName value to be assigned to property catName
     */
    public void setCatName(String catName) {
        this.catName = catName;
    }

    /**
     * Getter method for property <tt>category</tt>.
     * 
     * @return property value of category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Setter method for property <tt>category</tt>.
     * 
     * @param category value to be assigned to property category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

}
