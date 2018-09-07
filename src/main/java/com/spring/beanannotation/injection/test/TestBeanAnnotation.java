package com.spring.beanannotation.injection.test;

import com.spring.beanannotation.BeanAnnotation;
import com.spring.beanannotation.injection.dao.InjectionDao;
import com.spring.beanannotation.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring-beanannotation.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestBeanAnnotation extends AbstractJUnit4SpringContextTests {

    @Autowired
    private BeanAnnotation beanAnnotation;
    @Autowired
    private BeanAnnotation beanAnnotation2;
//    @Autowired
//    private InjectionDao injectionDao;
    @Autowired
    private InjectionService injectionService;

    @Test
    public void testSay(){
        beanAnnotation.say("Let Jun smiles");
    }

    @Test
    public void  testScope(){
        beanAnnotation.myHashCode();
        beanAnnotation2.myHashCode();
    }

    @Test
    public void testAutowired(){
        injectionService.save("let Jun smiles");
    }
}
