package com.spring.autowiring.service;

import com.spring.autowiring.dao.AutoWiringDao;

public class AutoWiringService {
    private AutoWiringDao autoWiringDao;

    public AutoWiringService(AutoWiringDao autoWiringDao){
        System.out.println("constructor");
        this.autoWiringDao=autoWiringDao;
    }

    //设值注入
    public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
        this.autoWiringDao = autoWiringDao;
    }

    public void say(String word){
        this.autoWiringDao.say(word);
    }

}
