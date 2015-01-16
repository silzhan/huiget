/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form;

import java.util.List;
import java.util.Map;

import com.huiget.mall.common.dal.entity.Category;
import com.huiget.mall.common.dal.entity.Product;

/**
 * 
 * @author yaofang
 * @version $Id: IndexForm.java, v 0.1 2014年9月18日 下午12:22:36 yaofang Exp $
 */
public class IndexForm extends BaseForm {

    private List<Category>             categories;

    private Map<String, List<Product>> productsByChannel;

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

    /**
     * Getter method for property <tt>productsByChannel</tt>.
     * 
     * @return property value of productsByChannel
     */
    public Map<String, List<Product>> getProductsByChannel() {
        return productsByChannel;
    }

    /**
     * Setter method for property <tt>productsByChannel</tt>.
     * 
     * @param productsByChannel value to be assigned to property productsByChannel
     */
    public void setProductsByChannel(Map<String, List<Product>> productsByChannel) {
        this.productsByChannel = productsByChannel;
    }

}
