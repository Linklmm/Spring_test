package com.spring.beanannotation.jsr.service;

import com.spring.beanannotation.jsr.dao.JsrDAO;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class JsrService {

    @Resource
    private JsrDAO jsrDAO;

    @PostConstruct
    public void init(){
        System.out.println("JsrService init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("JsrService destroy");
    }

    public void save(){
        jsrDAO.save();
    }
}
