/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.entity.TempPic;
import com.huiget.mall.common.dal.mapper.BaseMapper;
import com.huiget.mall.common.dal.mapper.TempPicMapper;
import com.huiget.mall.common.util.DateUtil;
import com.huiget.mall.common.util.ImageUtil;

/**
 * 
 * @author yaofang
 * @version $Id: TempPicService.java, v 0.1 2014年10月7日 下午9:43:32 yaofang Exp $
 */
@Service
public class TempPicService extends BaseSevice {

    private Logger        logger = LoggerFactory.getLogger(TempPicService.class);

    @Autowired
    private TempPicMapper tempPicMapper;

    public TempPic addTempPic(InputStream inputStream, String picName, String picType) {
        int id = 0;
        try {
            String suffix = picName.substring(picName.lastIndexOf("."), picName.length()).toLowerCase();

            StringBuilder picDirPath = ImageUtil.getTempImageDir(picType, DateUtil.toDateString(new Date()));
            File picDir = new File(picDirPath.toString());
            if (!picDir.exists()) {
                picDir.mkdirs();
            }

            BufferedImage img = ImageIO.read(inputStream);

            TempPic tempPic = new TempPic();
            tempPic.setPath(picDirPath.toString());
            tempPic.setType(picType);
            tempPic.setCreateTime(new Date());
            tempPic.setSuffix(suffix);
            tempPic.setWidth(img.getWidth());
            tempPic.setHeight(img.getHeight());

            tempPicMapper.insert(tempPic);

            ImageIO.write(img, tempPic.getSuffix().substring(1), new File(tempPic.getPicPath()));

            //FileUtils.copyInputStreamToFile(inputStream, new File(tempPic.getPicPath()));
            return tempPic;
        } catch (Exception e) {
            deleteTempPicById(id);

            logger.error("上传文件到临时文件失败", e);
            return null;
        }
    }

    public List<TempPic> findTempPicByIds(List<Integer> ids) {
        return tempPicMapper.queryByIds(ids);
    }

    public void deleteTempPicByIds(List<Integer> ids) {
        for (int id : ids) {
            deleteTempPicById(id);
        }
    }

    public void deleteTempPicById(int id) {
        TempPic tempPic = findById(id);
        if (tempPic == null) {
            return;
        }

        FileUtils.deleteQuietly(new File(tempPic.getPicPath()));

        tempPicMapper.deleteById(id);
    }

    public void deleteTempPic(TempPic tempPic) {
        FileUtils.deleteQuietly(new File(tempPic.getPicPath()));

        tempPicMapper.deleteById(tempPic.getId());
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return tempPicMapper;
    }

}
