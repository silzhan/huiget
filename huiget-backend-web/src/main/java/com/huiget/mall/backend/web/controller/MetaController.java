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

import com.huiget.mall.backend.web.form.MetaForm;
import com.huiget.mall.common.dal.entity.Meta;
import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.service.MetaService;

/**
 * 
 * @author yaofang
 * @version $Id: MetaInfoController.java, v 0.1 2014年9月25日 下午2:55:27 yaofang Exp $
 */
@Controller
@RequestMapping("/meta/")
public class MetaController {

    @Autowired
    private MetaService metaService;

    @RequestMapping(value = "list")
    public String list(@ModelAttribute("form") MetaForm form) {
        int count = metaService.count();
        form.setCount(count);

        if (count > 0) {
            int pageSize = form.getPageSize();
            form.setMetas(metaService.findForPage(form.getPageSize(), form.getPageNumber(), Meta.class));

            form.setTotalPageNumber(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        }

        return "meta/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(@ModelAttribute("form") MetaForm form) {

        return "meta/add";

    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String doAdd(@ModelAttribute("form") MetaForm form) {
        if (metaService.findByUri(form.getUri()) != null) {
            form.putError("uri", "uri：" + form.getUri() + " 已经存在");
        }

        if (form.hasError()) {
            return "meta/add";
        }

        Meta meta = new Meta();
        form.formToMeta(meta);

        metaService.add(meta);

        return "redirect:/meta/list";
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String edit(@ModelAttribute("form") MetaForm form) {
        Meta meta = metaService.findById(form.getId());
        if (meta == null) {
            return "redirect:/meta/list";
        }

        form.setMeta(meta);
        form.metaToForm();

        return "meta/edit";

    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String doEdit(@ModelAttribute("form") MetaForm form) {
        Meta meta = metaService.findById(form.getId());
        if (meta == null) {
            throw new IllegalArgumentException("ID为：" + form.getId() + "的信息不存在");
        }

        if (!meta.getUri().equalsIgnoreCase(form.getUri()) && metaService.findByUri(form.getUri()) != null) {
            form.putError("uri", "uri：" + form.getUri() + " 已经存在");
        }

        form.formToMeta(meta);
        metaService.edit(meta);

        return "redirect:/meta/list";

    }

    @RequestMapping(value = "delete.json")
    public Map<String, String> delete(@ModelAttribute("form") MetaForm form) {
        Meta meta = metaService.findById(form.getId());
        if (meta == null) {
            form.putError("errorMsg", "删除的信息不存在");
        }

        Map<String, String> ret = new HashMap<String, String>();
        if (form.hasError()) {
            ret.putAll(form.getErrors());
            ret.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_INVALID);
        } else {
            metaService.deleteById(meta.getId());

            ret.put(Constants.RESULT_KEY_STATUS, Constants.STATUS_VALID);
        }

        return ret;
    }

}
