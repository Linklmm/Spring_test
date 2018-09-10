package com.spring.demo1;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);
        accountDao.inMoney(in,money);
    }
}
