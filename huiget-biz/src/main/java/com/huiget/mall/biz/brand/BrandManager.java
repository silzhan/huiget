/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.biz.brand;

import java.io.File;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huiget.mall.common.dal.entity.Brand;
import com.huiget.mall.common.dal.entity.TempPic;
import com.huiget.mall.common.util.ImageUtil;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.BrandService;
import com.huiget.mall.service.TempPicService;

/**
 * 
 * @author yaofang
 * @version $Id: BrandManager.java, v 0.1 2014年10月10日 下午12:26:47 yaofang Exp $
 */
@Component
public class BrandManager {

    @Autowired
    private BrandService   brandService;

    @Autowired
    private TempPicService tempPicService;

    public void txAdd(Brand brand, int tempPicId) throws Exception {

        brandService.add(brand);

        if (tempPicId != 0) {
            TempPic tempPic = tempPicService.findById(tempPicId);
            if (tempPic == null) {
                return;
            }

            String path = ImageUtil.getImageDir(Constants.TYPE_BRAND).append(DigestUtils.md5Hex((brand.getId() + "").getBytes())).append(tempPic.getSuffix()).toString();

            FileUtils.copyFile(new File(tempPic.getPicPath()), new File(path));

            brandService.setLogo(brand.getId(), path);

            tempPicService.deleteTempPicById(tempPicId);
        }

    }
}
