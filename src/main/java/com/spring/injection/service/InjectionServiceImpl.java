package com.spring.injection.service;

import com.spring.injection.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {
    private InjectionDao injectionDao;
    //构造器注入
    public InjectionServiceImpl(InjectionDao injectionDao){
        this.injectionDao=injectionDao;
    }
//设值注入
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    @Override
    public void save(String arg) {
        System.out.println("Service 接收参数："+arg);
        arg=arg+":"+this.hashCode();
        injectionDao.save(arg);
    }
}
