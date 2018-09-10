package com.spring.demo1;
/**
 *
 * 转账业务层
 * */
public interface AccountService {
    /**
     * @param out 转出账号
     * @param in 转入账号
     * @param money 转账金额
     *
     * */
    public void transfer(String out,String in,Double money);
}
