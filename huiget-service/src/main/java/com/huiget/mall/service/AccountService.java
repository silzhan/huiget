/**
 * 
 * 惠购 - 惠购网 - www.huiget.com - 特别会购！
 * Copyright © 2014 惠购 www.huiget.com 版权所有
 */
package com.huiget.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huiget.mall.common.dal.entity.Account;
import com.huiget.mall.common.dal.mapper.AccountMapper;
import com.huiget.mall.common.dal.mapper.BaseMapper;

/**
 * 
 * @author yaofang
 * @version $Id: AccountService.java, v 0.1 2014年10月5日 上午8:18:40 yaofang Exp $
 */
@Service
public class AccountService extends BaseSevice {

    @Autowired
    private AccountMapper accountMapper;

    public Account findAccountInfoByUserIdAndAcctType(int userId, String acctType) {
        return accountMapper.queryByUserIdAndAcctType(userId, acctType);
    }

    public Account findAndLockAccountInfoByUserIdAndAcctType(int userId, String acctType) {
        return accountMapper.queryAndLockByUserIdAndAcctType(userId, acctType);
    }

    public void modifyAccountBal(Account account) {
        accountMapper.updateAccountBal(account);
    }

    /** 
     * @see com.baoseed.mall.service.BaseSevice#getMapper()
     */
    @Override
    protected BaseMapper getMapper() {
        return accountMapper;
    }

}
