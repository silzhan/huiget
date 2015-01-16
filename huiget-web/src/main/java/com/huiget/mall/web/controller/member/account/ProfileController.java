/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member.account;

import java.awt.Color;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.huiget.mall.common.dal.entity.User;
import com.huiget.mall.common.util.DateUtil;
import com.huiget.mall.common.util.ImageUtil;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.UserService;
import com.huiget.mall.web.form.member.account.ProfileForm;
import com.huiget.mall.web.form.member.account.validator.ProfileFormValidator;

/**
 * 
 * @author yaofang
 * @version $Id: ProfileController.java, v 0.1 2014年10月3日 下午7:21:41 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/account/")
public class ProfileController {

    @Autowired
    private UserService          userService;

    @Autowired
    private ProfileFormValidator validator;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(@ModelAttribute("form") ProfileForm form) {
        User user = userService.findById(form.getWebContext().getUserId());
        form.setUser(user);
        form.userToForm();

        return "member/account/profile";

    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String doProfile(@ModelAttribute("form") ProfileForm form) {
        User user = userService.findById(form.getWebContext().getUserId());
        validator.validate(form, user.getNickName());
        if (form.hasError()) {
            return "member/account/profile";
        }

        form.formToUser(user);
        user.setUpdater(form.getWebContext().getUserName());

        userService.edit(user);

        return "redirect:/member/account/profile";

    }

    @RequestMapping(value = "upload-avatar.json", method = RequestMethod.POST)
    public Map<String, String> uploadAvatar(@ModelAttribute("form") ProfileForm form) {
        int userId = form.getWebContext().getUserId();
        User user = userService.findById(userId);
        form.setUser(user);

        Map<String, String> result = new HashMap<String, String>();
        if (form.hasError()) {
            result.putAll(form.getErrors());
            result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
        } else {
            final MultipartFile file = form.getFile();
            String avatarName = file.getOriginalFilename();
            try {
                String suffix = avatarName.substring(avatarName.lastIndexOf("."), avatarName.length()).toLowerCase();

                StringBuilder dir = ImageUtil.getImageDir(Constants.TYPE_AVATAR, DateUtil.toDateString(user.getCreateTime()));
                File avatarDir = new File(dir.toString());
                if (!avatarDir.exists()) {
                    avatarDir.mkdirs();
                }

                String avatar = dir.append(DigestUtils.md5Hex((userId + "").getBytes())).append(suffix).toString();

                ImageUtil.resize(file.getBytes(), new File(avatar), 128, 128, suffix.substring(1), new Color(246, 246, 246));
                User userInfo = new User();
                userInfo.setId(userId);
                userInfo.setAvatar(avatar);
                userService.modifyAvatar(userInfo);

                result.put(Constants.RESULT_KEY_STATUS, Constants.RESULT_VAL_STATUS_200);
                result.put("fileURL", avatar);
            } catch (Exception e) {
                result.put("file", "上传文件失败");
                result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
            }
        }
        return result;
    }

}
