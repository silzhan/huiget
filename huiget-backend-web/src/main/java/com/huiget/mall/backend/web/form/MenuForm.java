/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.form;

import java.util.List;

import com.huiget.mall.common.dal.entity.Menu;

/**
 * 
 * @author yaofang
 * @version $Id: MenuForm.java, v 0.1 2014年9月26日 上午11:16:14 yaofang Exp $
 */
public class MenuForm extends BaseForm {

    private String     uri;

    private String     name;

    private int        level;

    private int        parentId;

    private int        weight;

    private Menu       menu;

    private List<Menu> menus;

    /**
     * Getter method for property <tt>uri</tt>.
     * 
     * @return property value of uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Setter method for property <tt>uri</tt>.
     * 
     * @param uri value to be assigned to property uri
     */
    public void setUri(String uri) {
        this.uri = uri;
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
     * Getter method for property <tt>menu</tt>.
     * 
     * @return property value of menu
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Setter method for property <tt>menu</tt>.
     * 
     * @param menu value to be assigned to property menu
     */
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    /**
     * Getter method for property <tt>menus</tt>.
     * 
     * @return property value of menus
     */
    public List<Menu> getMenus() {
        return menus;
    }

    /**
     * Setter method for property <tt>menus</tt>.
     * 
     * @param menus value to be assigned to property menus
     */
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void menuToForm() {
        setId(menu.getId());
        setLevel(menu.getLevel());
        setName(menu.getName());
        setParentId(menu.getParentId());
        setUri(menu.getUri());
        setWeight(menu.getWeight());
    }

    public void formToMenu(Menu menu) {
        menu.setLevel(level);
        menu.setName(name);
        menu.setParentId(parentId);
        menu.setUri(uri);
        menu.setWeight(weight);
    }

}
