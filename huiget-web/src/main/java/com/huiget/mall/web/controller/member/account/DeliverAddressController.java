/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.controller.member.account;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huiget.mall.biz.deliveraddress.DeliverAddressManager;
import com.huiget.mall.common.dal.entity.DeliverAddress;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.DeliverAddressService;
import com.huiget.mall.web.form.member.account.DeliverAddressForm;
import com.huiget.mall.web.form.member.account.validator.DeliverAddressFormValidator;

/**
 * 
 * @author yaofang
 * @version $Id: DeliverAddressController.java, v 0.1 2014年10月3日 下午7:19:12 yaofang Exp $
 */
@Controller
@RequestMapping(value = "/member/account/")
public class DeliverAddressController {

    @Autowired
    private DeliverAddressService       deliverAddressService;

    @Autowired
    private DeliverAddressManager       deliverAddressManager;

    @Autowired
    private DeliverAddressFormValidator validator;

    @RequestMapping(value = "/deliver-address", method = RequestMethod.GET)
    public String deliverAddress(@ModelAttribute("form") DeliverAddressForm form) {
        form.setDeliverAddresses(deliverAddressService.findDeliverAddressByUserId(form.getWebContext().getUserId()));

        if (form.getId() != 0) {
            DeliverAddress deliverAddress = deliverAddressService.findById(form.getId());
            form.setDeliverAddress(deliverAddress);
            form.deliverAddressToForm();
        }

        return "member/account/deliver-address";

    }

    @RequestMapping(value = "/deliver-address", method = RequestMethod.POST)
    public String doDeliverAddress(@ModelAttribute("form") DeliverAddressForm form) {
        validator.validate(form);

        if (form.hasError()) {
            form.setDeliverAddresses(deliverAddressService.findDeliverAddressByUserId(form.getWebContext().getUserId()));

            return "member/account/deliver-address";
        }

        DeliverAddress deliverAddress = form.formToDeliverAddress();
        if (form.getId() == 0) {
            deliverAddressManager.txAddDeliverAddress(deliverAddress);
        } else {
            deliverAddressManager.txModifyDeliverAddress(form.getId(), deliverAddress);
        }

        return "redirect:/member/account/deliver-address";
    }

    @RequestMapping(value = "delete-deliver-address.json")
    public Map<String, String> deleteDeliverAddress(@ModelAttribute("form") DeliverAddressForm form) {
        Map<String, String> result = new HashMap<String, String>();
        if (form.hasError()) {
            result.putAll(form.getErrors());
            result.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
        } else {
            deliverAddressService.deleteByIdAndUserId(form.getId(), form.getWebContext().getUserId());
            result.put(Constants.RESULT_KEY_STATUS, Constants.RESULT_VAL_STATUS_200);
        }

        return result;
    }

    @RequestMapping(value = "set-deliver-address-default-status")
    public String setDefaultStatus(@ModelAttribute("form") DeliverAddressForm form) {

        deliverAddressManager.txSetDefaultStatus(form.getId(), form.getWebContext().getUserId());

        return "redirect:/member/account/deliver-address";
    }

}
