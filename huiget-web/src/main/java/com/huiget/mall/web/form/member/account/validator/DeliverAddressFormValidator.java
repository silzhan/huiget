/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member.account.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.huiget.mall.web.form.member.account.DeliverAddressForm;

/**
 * 
 * @author yaofang
 * @version $Id: DeliverAddressFormValidator.java, v 0.1 2014年10月6日 下午9:49:45 yaofang Exp $
 */
@Component
public class DeliverAddressFormValidator {

    public void validate(DeliverAddressForm form) {
        if (StringUtils.isBlank(form.getReceiverName())) {
            form.putError("receiverName", "请输入收货人姓名");
        } else if (form.getReceiverName().length() > 25) {
            form.putError("receiverName", "收货人姓名长度超过25个字符");
        }

        if (StringUtils.isBlank(form.getProvince()) || StringUtils.isBlank(form.getCity())
            || StringUtils.isBlank(form.getArea())) {
            form.putError("province", "请输入所在地区");
        }

        if (StringUtils.isBlank(form.getAddress())) {
            form.putError("address", "请输入详细地址");
        } else if (form.getReceiverName().length() > 25) {
            form.putError("address", "详细地址长度超过100个字符");
        }

        if (StringUtils.isBlank(form.getPostcode())) {
            form.putError("postcode", "请输入邮政编码");
        } else if (form.getReceiverName().length() > 10) {
            form.putError("postcode", "邮政编码长度超过25个字符");
        }

        if (StringUtils.isBlank(form.getMobilePhone()) && StringUtils.isBlank(form.getTelePhone())) {
            form.putError("mobilePhone", "手机、座机号码至少有一项必填");
        } else if (StringUtils.trimToEmpty(form.getMobilePhone()).length() > 20
                   || StringUtils.trimToEmpty(form.getTelePhone()).length() > 20) {
            form.putError("mobilePhone", "手机、座机号码至少有一项长度超过20个字符");
        }

    }
}
