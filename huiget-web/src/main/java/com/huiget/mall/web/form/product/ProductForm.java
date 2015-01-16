/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.product;

import java.util.List;

import com.huiget.mall.common.dal.entity.Channel;
import com.huiget.mall.common.dal.entity.Product;
import com.huiget.mall.web.form.BaseForm;

/**
 * 
 * @author yaofang
 *
 * @version $Id: ProductForm.java, v 0.1 2014年10月24日 下午11:55:08 yaofang Exp $
 */
public class ProductForm extends BaseForm {

    private int           pageSize   = 40;

    private int           pageNumber = 1;

    private int           count;

    private int           totalPageNumber;

    private String        channelName;

    private String        location;

    private String        category;

    private Channel       channel;

    private String        searchWord;

    private List<Product> products;

    private List<String>  categories;

    /**
     * Getter method for property <tt>pageSize</tt>.
     * 
     * @return property value of pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Setter method for property <tt>pageSize</tt>.
     * 
     * @param pageSize value to be assigned to property pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter method for property <tt>pageNumber</tt>.
     * 
     * @return property value of pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Setter method for property <tt>pageNumber</tt>.
     * 
     * @param pageNumber value to be assigned to property pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Getter method for property <tt>count</tt>.
     * 
     * @return property value of count
     */
    public int getCount() {
        return count;
    }

    /**
     * Setter method for property <tt>count</tt>.
     * 
     * @param count value to be assigned to property count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Getter method for property <tt>totalNumber</tt>.
     * 
     * @return property value of totalNumber
     */
    public int getTotalPageNumber() {
        return totalPageNumber;
    }

    /**
     * Setter method for property <tt>totalNumber</tt>.
     * 
     * @param totalNumber value to be assigned to property totalNumber
     */
    public void setTotalPageNumber(int totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
    }

    /**
     * Getter method for property <tt>channelName</tt>.
     * 
     * @return property value of channelName
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Setter method for property <tt>channelName</tt>.
     * 
     * @param channelName value to be assigned to property channelName
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * Getter method for property <tt>location</tt>.
     * 
     * @return property value of location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Setter method for property <tt>location</tt>.
     * 
     * @param location value to be assigned to property location
     */
    public void setLocation(String location) {
        this.location = location;
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
     * Getter method for property <tt>channel</tt>.
     * 
     * @return property value of channel
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Setter method for property <tt>channel</tt>.
     * 
     * @param channel value to be assigned to property channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    /**
     * Getter method for property <tt>searchWord</tt>.
     * 
     * @return property value of searchWord
     */
    public String getSearchWord() {
        return searchWord;
    }

    /**
     * Setter method for property <tt>searchWord</tt>.
     * 
     * @param searchWord value to be assigned to property searchWord
     */
    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    /**
     * Getter method for property <tt>products</tt>.
     * 
     * @return property value of products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Setter method for property <tt>products</tt>.
     * 
     * @param products value to be assigned to property products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Getter method for property <tt>categories</tt>.
     * 
     * @return property value of categories
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     * Setter method for property <tt>categories</tt>.
     * 
     * @param categories value to be assigned to property categories
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

}
