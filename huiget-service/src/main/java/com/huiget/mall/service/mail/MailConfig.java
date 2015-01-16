/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service.mail;

/**
 * 
 * @author yaofang
 * @version $Id: MailConfig.java, v 0.1 2014年7月18日 上午9:51:01 yaofang Exp $
 */
public class MailConfig {

    private String templateId;

    private String templatePath;

    private String from;

    private String subject;

    private String replyTo;

    /**
     * @param templateId
     * @param from
     * @param subject
     * @param replyTo
     */
    public MailConfig(String templateId, String templatePath, String from, String subject, String replyTo) {
        super();
        this.templateId = templateId;
        this.templatePath = templatePath;
        this.from = from;
        this.subject = subject;
        this.replyTo = replyTo;
    }

    /**
     * Getter method for property <tt>templateId</tt>.
     * 
     * @return property value of templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Setter method for property <tt>templateId</tt>.
     * 
     * @param templateId value to be assigned to property templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * Getter method for property <tt>templatePath</tt>.
     * 
     * @return property value of templatePath
     */
    public String getTemplatePath() {
        return templatePath;
    }

    /**
     * Setter method for property <tt>templatePath</tt>.
     * 
     * @param templatePath value to be assigned to property templatePath
     */
    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    /**
     * Getter method for property <tt>from</tt>.
     * 
     * @return property value of from
     */
    public String getFrom() {
        return from;
    }

    /**
     * Setter method for property <tt>from</tt>.
     * 
     * @param from value to be assigned to property from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Getter method for property <tt>subject</tt>.
     * 
     * @return property value of subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Setter method for property <tt>subject</tt>.
     * 
     * @param subject value to be assigned to property subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Getter method for property <tt>replyTo</tt>.
     * 
     * @return property value of replyTo
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Setter method for property <tt>replyTo</tt>.
     * 
     * @param replyTo value to be assigned to property replyTo
     */
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

}
