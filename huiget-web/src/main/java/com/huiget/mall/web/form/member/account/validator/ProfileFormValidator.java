/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member.account.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huiget.mall.service.UserService;
import com.huiget.mall.web.form.member.account.ProfileForm;

/**
 * 
 * @author yaofang
 * @version $Id: ProfileFormValidator.java, v 0.1 2014年10月6日 下午10:06:05 yaofang Exp $
 */
@Component
public class ProfileFormValidator {

    @Autowired
    private UserService userService;

    public void validate(ProfileForm form, String nickName) {
        if (StringUtils.isBlank(form.getNickName())) {
            form.putError("nickName", "请输入昵称");
        } else if (form.getNickName().length() > 25) {
            form.putError("nickName", "昵称长度超过25个字符");
        } else if (!StringUtils.equals(form.getNickName(), nickName)
                   && userService.isNickNameExist(form.getNickName())) {
            form.putError("nickName", "昵称已经存在");
        }
    }

}
