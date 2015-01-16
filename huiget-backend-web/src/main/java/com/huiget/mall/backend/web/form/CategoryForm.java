/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.huiget.mall.common.dal.entity.Category;
import com.huiget.mall.common.util.constants.BusinessConstants;
import com.huiget.mall.common.util.constants.Constants;

/**
 * 
 * @author yaofang
 * @version $Id: CategoryInfoController.java, v 0.1 2014年9月24日 上午10:04:25 yaofang Exp $
 */
public class CategoryForm extends BaseForm {

    private String         nameEn;

    private String         nameCn;

    private int            level  = BusinessConstants.CATEGORY_LEVEL_1;

    private int            parentId;

    private String         status = Constants.STATUS_VALID;

    private int            weight;

    private Category       category;

    private List<Category> categories;

    /**
     * Getter method for property <tt>nameEn</tt>.
     * 
     * @return property value of nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Setter method for property <tt>nameEn</tt>.
     * 
     * @param nameEn value to be assigned to property nameEn
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    /**
     * Getter method for property <tt>nameCn</tt>.
     * 
     * @return property value of nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    /**
     * Setter method for property <tt>nameCn</tt>.
     * 
     * @param nameCn value to be assigned to property nameCn
     */
    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    /**
     * Getter method for property <tt>level</tt>.
     * 
     * @return property value of level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Setter method for property <tt>level</tt>.
     * 
     * @param level value to be assigned to property level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Getter method for property <tt>parentId</tt>.
     * 
     * @return property value of parentId
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * Setter method for property <tt>parentId</tt>.
     * 
     * @param parentId value to be assigned to property parentId
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
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
     * Getter method for property <tt>categoryInfo</tt>.
     * 
     * @return property value of categoryInfo
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Setter method for property <tt>categoryInfo</tt>.
     * 
     * @param categoryInfo value to be assigned to property categoryInfo
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Getter method for property <tt>categoryInfos</tt>.
     * 
     * @return property value of categoryInfos
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * Setter method for property <tt>categoryInfos</tt>.
     * 
     * @param categoryInfos value to be assigned to property categoryInfos
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void categoryToForm() {
        setId(category.getId());
        setLevel(category.getLevel());
        setParentId(category.getParentId());
        setNameCn(category.getNameCn());
        setNameEn(category.getNameEn());
        setStatus(category.getStatus());
        setWeight(category.getWeight());
    }

    public void formToCategory(Category category) {
        category.setLevel(level);
        category.setParentId(level == 1 ? 0 : parentId);
        category.setNameCn(StringUtils.trimToEmpty(nameCn));
        category.setNameEn(StringUtils.trimToEmpty(nameEn));
        category.setStatus(status);
        category.setWeight(weight);
    }

}
