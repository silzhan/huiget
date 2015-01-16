/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.entity;

/**
 * 
 * @author yaofang
 * @version $Id: TempPic.java, v 0.1 2014年10月7日 下午9:36:16 yaofang Exp $
 */
public class TempPic extends BaseEntity {

    private String type;

    private String path;

    private String suffix;

    private int    width;

    private int    height;

    /**
     * Getter method for property <tt>type</tt>.
     * 
     * @return property value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     * 
     * @param type value to be assigned to property type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter method for property <tt>path</tt>.
     * 
     * @return property value of path
     */
    public String getPath() {
        return path;
    }

    /**
     * Setter method for property <tt>path</tt>.
     * 
     * @param path value to be assigned to property path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter method for property <tt>suffix</tt>.
     * 
     * @return property value of suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Setter method for property <tt>suffix</tt>.
     * 
     * @param suffix value to be assigned to property suffix
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * Getter method for property <tt>width</tt>.
     * 
     * @return property value of width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Setter method for property <tt>width</tt>.
     * 
     * @param width value to be assigned to property width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Getter method for property <tt>height</tt>.
     * 
     * @return property value of height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Setter method for property <tt>height</tt>.
     * 
     * @param height value to be assigned to property height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public String getPicPath() {
        return path + String.valueOf(getId()) + suffix;
    }

}
