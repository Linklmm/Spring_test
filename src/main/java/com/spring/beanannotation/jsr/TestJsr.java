package com.spring.beanannotation.jsr;

import com.spring.beanannotation.jsr.service.JsrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring-beanannotation.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJsr extends AbstractJUnit4SpringContextTests {

    @Autowired
    private JsrService jsrService;

    @Test
    public void testSave(){
        jsrService.save();
    }
}
