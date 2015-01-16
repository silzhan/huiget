/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.util.constants;

/**
 * 
 * @author yaofang
 * @version $Id: AccountConstants.java, v 0.1 2014年10月5日 上午7:59:10 yaofang Exp $
 */
public class AccountConstants {

    /**
     * 账户类型，基本借记户
     */
    public static final String ACCT_TYPE_BASEDT      = "BASEDT";

    /**
     * ‘N’ – 正常
     * ‘C’ – 被关闭，不能有账务往来
     * ‘F’ – 冻结，不能出账，可以入账
     * ‘D’ – 销户
     */
    public static final String ACCT_STATUS_NORMAL    = "N";
    public static final String ACCT_STATUS_CLOSE     = "C";
    public static final String ACCT_STATUS_FROZEN    = "F";
    public static final String ACCT_STATUS_DELETE    = "D";

    /**
     * ‘CS’ – 现金
     * ‘PT’ – 积分
     */
    public static final String CAP_TYPE_CASH         = "CS";
    public static final String CAP_TYPE_POINTS       = "PT";

    public static final String CURY_TYPE_CNY         = "CNY";

    /**
     * 'I' - 初始状态，取现交易发起
     * 'S' - 取现成功
     * 'F' - 取现失败
     * 'A' - 审核通过
     */
    public static final String TRANS_STATUS_INITIAL  = "I";
    public static final String TRANS_STATUS_SUCCESS  = "S";
    public static final String TRANS_STATUS_FAIL     = "F";
    public static final String TRANS_STATUS_APPROVED = "A";

    /**
     * ‘SELF’ – 主动取现，用户发起的
     */
    public static final String CASH_BUSI_TYPE        = "SELF";

    /**
     * ‘01’ 取现
     */
    public static final String TRANS_TYPE            = "01";

}
