package com.spring.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
    @Override
    public void outMoney(String out, Double money) {
        //System.out.println("111111");
        String sql="update account set money=money-? where name=?";
        //System.out.println("22222");
        this.getJdbcTemplate().update(sql,money,out);
    }

    @Override
    public void inMoney(String in, Double money) {

        String sql="update account set money=money+? where name=?";
        this.getJdbcTemplate().update(sql,money,in);
    }
}
