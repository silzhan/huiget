/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.huiget.mall.common.dal.entity.Brand;
import com.huiget.mall.common.util.constants.Constants;

/**
 * 
 * @author yaofang
 * @version $Id: BrandForm.java, v 0.1 2014年10月7日 下午5:00:54 yaofang Exp $
 */
public class BrandForm extends BaseForm {

    private String        nameEn;

    private String        nameCn;

    private String        logo;

    private MultipartFile file;

    private int           tempId;

    private String        description;

    private String        status = Constants.STATUS_VALID;

    private int           weight;

    private Brand         brand;

    private List<Brand>   brands;

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
     * Getter method for property <tt>logo</tt>.
     * 
     * @return property value of logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Setter method for property <tt>logo</tt>.
     * 
     * @param logo value to be assigned to property logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
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
     * Getter method for property <tt>tempId</tt>.
     * 
     * @return property value of tempId
     */
    public int getTempId() {
        return tempId;
    }

    /**
     * Setter method for property <tt>tempId</tt>.
     * 
     * @param tempId value to be assigned to property tempId
     */
    public void setTempId(int tempId) {
        this.tempId = tempId;
    }

    /**
     * Getter method for property <tt>description</tt>.
     * 
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property <tt>description</tt>.
     * 
     * @param description value to be assigned to property description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * Getter method for property <tt>brand</tt>.
     * 
     * @return property value of brand
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Setter method for property <tt>brand</tt>.
     * 
     * @param brand value to be assigned to property brand
     */
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    /**
     * Getter method for property <tt>brands</tt>.
     * 
     * @return property value of brands
     */
    public List<Brand> getBrands() {
        return brands;
    }

    /**
     * Setter method for property <tt>brands</tt>.
     * 
     * @param brands value to be assigned to property brands
     */
    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

    public void brandToForm() {
        setDescription(brand.getDescription());
        setId(brand.getId());
        setNameCn(brand.getNameCn());
        setNameEn(brand.getNameEn());
        setStatus(brand.getStatus());
        setWeight(brand.getWeight());
        setLogo(brand.getLogo());
    }

    public void formToBrand(Brand brand) {
        brand.setDescription(description);
        brand.setNameCn(nameCn);
        brand.setNameEn(nameEn);
        brand.setStatus(getStatus());
        brand.setWeight(weight);
    }

}
