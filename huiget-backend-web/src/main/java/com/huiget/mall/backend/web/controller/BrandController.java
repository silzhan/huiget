/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.backend.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.huiget.mall.backend.web.form.BrandForm;
import com.huiget.mall.biz.brand.BrandManager;
import com.huiget.mall.common.dal.entity.Brand;
import com.huiget.mall.common.dal.entity.TempPic;
import com.huiget.mall.common.util.URLUtil;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.BrandService;
import com.huiget.mall.service.TempPicService;

/**
 * 
 * @author yaofang
 * @version $Id: BrandController.java, v 0.1 2014年10月7日 下午4:59:39 yaofang Exp $
 */
@Controller
@RequestMapping("/brand/")
public class BrandController {

    @Autowired
    private BrandService   brandService;

    @Autowired
    private TempPicService tempPicService;

    @Autowired
    private BrandManager   brandManager;

    @RequestMapping(value = "list")
    public String list(@ModelAttribute("form") BrandForm form) {
        int count = brandService.count();
        form.setCount(count);

        if (count > 0) {
            int pageSize = form.getPageSize();
            form.setBrands(brandService.findForPage(pageSize, form.getPageNumber(), Brand.class));

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        }

        return "brand/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("form") BrandForm form) {

        return "brand/add";

    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String doAdd(@ModelAttribute("form") BrandForm form) throws Exception {
        if (form.hasError()) {
            return "brand/add";
        }

        Brand brand = new Brand();
        form.formToBrand(brand);

        brandManager.txAdd(brand, form.getTempId());

        return "redirect:/notice?title=" + URLUtil.encode("品牌新增") + "&returnURI=/brand/list";
    }

    @RequestMapping(value = "upload.json", method = RequestMethod.POST)
    public Map<String, Object> modifyAvatar(@ModelAttribute("form") BrandForm form) {
        Map<String, Object> result = new HashMap<String, Object>();
        if (form.hasError()) {
            result.putAll(form.getErrors());
            result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
            return result;
        }

        final MultipartFile file = form.getFile();
        try {
            TempPic tempPic = tempPicService.addTempPic(file.getInputStream(), file.getOriginalFilename(), Constants.TYPE_BRAND);
            if (tempPic == null) {
                result.put("file", "上传文件失败");
                result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
            } else {
                result.put(Constants.RESULT_KEY_STATUS, Constants.RESULT_VAL_STATUS_200);
                result.put("fileURL", tempPic.getPicPath());
                result.put("fileId", tempPic.getId());
            }
        } catch (Exception e) {
            result.put("file", "上传文件失败");
            result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
        }
        return result;
    }

}
