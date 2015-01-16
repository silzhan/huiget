/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.common.dal.mapper;

import org.apache.ibatis.annotations.Param;

import com.huiget.mall.common.dal.entity.Account;

/**
 * 
 * @author yaofang
 * @version $Id: AccountMapper.java, v 0.1 2014年10月5日 上午8:03:21 yaofang Exp $
 */
public interface AccountMapper extends BaseMapper {

    public Account queryByUserIdAndAcctType(@Param("userId") int userId, @Param("acctType") String acctType);

    public Account queryAndLockByUserIdAndAcctType(@Param("userId") int userId, @Param("acctType") String acctType);

    public void updateAccountBal(Account account);

}
