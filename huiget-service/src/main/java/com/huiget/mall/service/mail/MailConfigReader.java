/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service.mail;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;

import com.huiget.mall.common.util.RegexUtil;

/**
 * 
 * @author yaofang
 * @version $Id: MailConfigReader.java, v 0.1 2014年7月18日 上午10:01:11 yaofang Exp $
 */
public class MailConfigReader {

    private Logger              logger        = LoggerFactory.getLogger(MailConfigReader.class);

    private static final String FROM          = "from";

    private static final String REPLY_TO      = "replyTo";

    private static final String TEMPLATE_ID   = "templateId";

    private static final String SUBJECT       = "subject";

    private static final String TEMPLATE_PATH = "templatePath";

    private static final String MAIL_CONFIG   = "mail-config";

    @SuppressWarnings("unchecked")
    public Map<String, MailConfig> loadMailConfig(Resource resource) {
        SAXReader reader = new SAXReader();
        Document doc = null;
        Map<String, MailConfig> mailConfigRegister = new ConcurrentHashMap<String, MailConfig>();
        try {
            doc = reader.read(resource.getInputStream());
            final Element rootEl = doc.getRootElement();
            final String globalFrom = StringUtils.trimToEmpty(rootEl.attributeValue(FROM));
            final String globalReplyTo = StringUtils.trimToEmpty(rootEl.attributeValue(REPLY_TO));

            // <authentications>
            List<Element> mailConfigEls = rootEl.elements(MAIL_CONFIG);
            for (Element mailConfigEl : mailConfigEls) {
                String templateId = StringUtils.trimToEmpty(mailConfigEl.attributeValue(TEMPLATE_ID));
                String templatePath = StringUtils.trimToEmpty(mailConfigEl.attributeValue(TEMPLATE_PATH));
                if (mailConfigRegister.containsKey(templateId)) {
                    throw new IllegalArgumentException("邮件模板id=" + templateId + "重复！");
                }

                String from = StringUtils.defaultIfEmpty(mailConfigEl.elementText(FROM), globalFrom);
                if (!RegexUtil.isEmail(from)) {
                    throw new IllegalArgumentException("邮件模板id=" + templateId + " 对应from=" + from + "格式错误！");
                }
                String replyTo = StringUtils.defaultIfEmpty(mailConfigEl.elementText(REPLY_TO), globalReplyTo);
                String subject = StringUtils.trimToEmpty(mailConfigEl.elementText(SUBJECT));

                MailConfig mailConfig = new MailConfig(templateId, templatePath, from, subject, replyTo);

                mailConfigRegister.put(templateId, mailConfig);

            }
        } catch (DocumentException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }

        return mailConfigRegister;
    }

}
