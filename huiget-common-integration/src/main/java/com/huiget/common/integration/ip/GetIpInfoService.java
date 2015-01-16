/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.common.integration.ip;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huiget.common.integration.IntegrationService;

/**
 * 
 * @author yaofang
 * @version $Id: GetIpInfoService.java, v 0.1 2014年9月26日 下午4:17:50 yaofang Exp $
 */
@Service
public class GetIpInfoService extends IntegrationService {

    public IpInfo getIpInfo(String ip) {
        Map<String, String> queryStrings = new HashMap<String, String>();
        queryStrings.put("ip", ip);

        String jsonString = getJsonString(queryStrings);

        ObjectMapper mapper = new ObjectMapper();
        IpInfo ipInfo = new IpInfo();
        try {
            ipInfo = mapper.readValue(jsonString, IpInfo.class);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return ipInfo;
    }

    public static void main(String[] args) {
        System.out.println(new GetIpInfoService().getIpInfo("210.75.225.254").isSuccess());
    }

    /** 
     * @see com.baoseed.common.integration.IntegrationService#getURI()
     */
    @Override
    protected String getURI() {
        return "http://ip.taobao.com/service/getIpInfo.php";
    }

}
