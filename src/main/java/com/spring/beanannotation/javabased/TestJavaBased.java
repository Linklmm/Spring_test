package com.spring.beanannotation.javabased;

import com.spring.beanannotation.jsr.service.JsrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring-beanannotation.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJavaBased extends AbstractJUnit4SpringContextTests {
//    @Autowired
//    private Store store;

    @Autowired
    private StoreConfig storeConfig;

    @Test
    public void test(){
        storeConfig.StringStore();
    }


}
