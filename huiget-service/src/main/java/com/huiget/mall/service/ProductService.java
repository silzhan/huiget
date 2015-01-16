/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.entity.Product;
import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.ProductMapper;

/**
 * 
 * @author yaofang
 *
 * @version $Id: ProductService.java, v 0.1 2014年10月23日 下午8:52:03 yaofang Exp $
 */
@Service
public class ProductService extends BaseSevice {

    @Autowired
    private ProductMapper productMapper;

    public List<Product> findProductsForIndex(String channel, int begin, int end) {
        return productMapper.queryByConditionForPage(channel, null, begin, end);
    }

    public List<Product> findProductsByConditionForPage(String channel, String category, int pageSize, int pageNumber) {
        return productMapper.queryByConditionForPage(channel, category, (pageNumber - 1) * pageSize, pageSize);
    }

    public List<Product> findBigestDiscountProducts(String channel, String category, int pageSize, int pageNumber) {
        return productMapper.queryByBigestDiscount(channel, category, (pageNumber - 1) * pageSize, pageSize);
    }

    public int count(String channel, String category) {
        return productMapper.countByCondition(channel, category);
    }

    public List<String> findCategoryByChannel(String channel) {
        return productMapper.queryCategoryByChannel(channel);
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return productMapper;
    }

}
