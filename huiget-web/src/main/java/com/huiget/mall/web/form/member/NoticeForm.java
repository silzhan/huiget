/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.web.form.member;

import com.huiget.mall.common.util.constants.Constants;
import com.huiget.mall.web.form.BaseForm;

/**
 * 
 * @author yaofang
 * @version $Id: NoticeForm.java, v 0.1 2014年10月6日 下午1:30:09 yaofang Exp $
 */
public class NoticeForm extends BaseForm {

    private String  title;

    private String  returnURI;

    private boolean autoReturn;

    private String  status = Constants.STATUS_VALID;

    private String  reason;

    /**
     * Getter method for property <tt>title</tt>.
     * 
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property <tt>title</tt>.
     * 
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property <tt>returnURI</tt>.
     * 
     * @return property value of returnURI
     */
    public String getReturnURI() {
        return returnURI;
    }

    /**
     * Setter method for property <tt>returnURI</tt>.
     * 
     * @param returnURI value to be assigned to property returnURI
     */
    public void setReturnURI(String returnURI) {
        this.returnURI = returnURI;
    }

    /**
     * Getter method for property <tt>autoReturn</tt>.
     * 
     * @return property value of autoReturn
     */
    public boolean isAutoReturn() {
        return autoReturn;
    }

    /**
     * Setter method for property <tt>autoReturn</tt>.
     * 
     * @param autoReturn value to be assigned to property autoReturn
     */
    public void setAutoReturn(boolean autoReturn) {
        this.autoReturn = autoReturn;
    }

    /**
     * Getter method for property <tt>status</tt>.
     * 
     * @return property value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for property <tt>status</tt>.
     * 
     * @param status value to be assigned to property status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter method for property <tt>reason</tt>.
     * 
     * @return property value of reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * Setter method for property <tt>reason</tt>.
     * 
     * @param reason value to be assigned to property reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

}
