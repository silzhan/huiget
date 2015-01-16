/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service.mail;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.mail.internet.MimeMessage;

import org.apache.commons.lang.StringUtils;
import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.huiget.mall.common.util.constants.Constants;

/**
 * 
 * @author yaofang
 * @version $Id: MailService.java, v 0.1 2014年7月18日 上午9:38:41 yaofang Exp $
 */
public class MailService implements InitializingBean {

    private Logger                  logger             = LoggerFactory.getLogger(MailService.class);

    private Map<String, MailConfig> mailConfigRegister = new ConcurrentHashMap<String, MailConfig>();

    private final MailConfigReader  mailConfigReader   = new MailConfigReader();

    private Resource                mailConfigLocation;

    private VelocityEngine          velocityEngine;

    private JavaMailSender          mailSender;

    // private final ExecutorService   executorService    = Executors.newFixedThreadPool(1);

    /** 
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        mailConfigRegister = mailConfigReader.loadMailConfig(mailConfigLocation);
    }

    /**
     * 发送邮件
     * 
     * @param templateId 邮件模板编号
     * @param model 邮件内容动态数据
     * @param to 收件人
     * @return 邮件发送标志
     */
    public int sendMail(String templateId, Map<String, Object> model, String to) {
        return sendMail(templateId, Constants.DEFAULT_MAIL_ENCODING, model, to, Constants.DEFAULT_MAIL_HTML);
    }

    /**
     * 发送邮件
     * 
     * @param templateId 邮件模板编号
     * @param encoding 邮件编码
     * @param model 邮件内容动态数据
     * @param to 收件人
     * @return 邮件发送标志
     */
    public int sendMail(String templateId, String encoding, Map<String, Object> model, String to) {
        return sendMail(templateId, encoding, model, to, Constants.DEFAULT_MAIL_HTML);
    }

    /**
     * 发送邮件
     * 
     * @param templateId 邮件模板编号
     * @param model 邮件内容动态数据
     * @param to 收件人
     * @param html 是否html邮件
     * @return 邮件发送标志
     */
    public int sendMail(String templateId, Map<String, Object> model, String to, boolean html) {
        return sendMail(templateId, Constants.DEFAULT_MAIL_ENCODING, model, to, html);
    }

    /**
     * 发送邮件
     * 
     * @param templateId 邮件模板编号
     * @param encoding 邮件编码
     * @param model 邮件内容动态数据
     * @param to 收件人
     * @param html 是否html邮件
     * @return 邮件发送标志
     */
    public int sendMail(String templateId, String encoding, Map<String, Object> model, String to, boolean html) {
        MailConfig mailConfig = mailConfigRegister.get(templateId);
        try {
            if (mailConfig == null) {
                throw new IllegalArgumentException("邮件模板 id=" + templateId + " 对应的配置信息不存在！");
            }

            final MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, encoding);

            messageHelper.setFrom(mailConfig.getFrom());
            if (StringUtils.isNotBlank(mailConfig.getReplyTo())) {
                messageHelper.setReplyTo(mailConfig.getReplyTo());
            }
            messageHelper.setSubject(mailConfig.getSubject());
            messageHelper.setTo(to);
            String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, mailConfig.getTemplatePath(), encoding, model);
            messageHelper.setText(text, html);

            mailSender.send(mimeMessage);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);

            return Constants.MAIL_SEND_FAIL;
        }

        return Constants.MAIL_SEND_SUCC;
    }

    /**
     * Getter method for property <tt>mailConfigLocation</tt>.
     * 
     * @return property value of mailConfigLocation
     */
    public Resource getMailConfigLocation() {
        return mailConfigLocation;
    }

    /**
     * Setter method for property <tt>mailConfigLocation</tt>.
     * 
     * @param mailConfigLocation value to be assigned to property mailConfigLocation
     */
    public void setMailConfigLocation(Resource mailConfigLocation) {
        this.mailConfigLocation = mailConfigLocation;
    }

    /**
     * Getter method for property <tt>velocityEngine</tt>.
     * 
     * @return property value of velocityEngine
     */
    public VelocityEngine getVelocityEngine() {
        return velocityEngine;
    }

    /**
     * Setter method for property <tt>velocityEngine</tt>.
     * 
     * @param velocityEngine value to be assigned to property velocityEngine
     */
    public void setVelocityEngine(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }

    /**
     * Getter method for property <tt>mailSender</tt>.
     * 
     * @return property value of mailSender
     */
    public JavaMailSender getMailSender() {
        return mailSender;
    }

    /**
     * Setter method for property <tt>mailSender</tt>.
     * 
     * @param mailSender value to be assigned to property mailSender
     */
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

}
