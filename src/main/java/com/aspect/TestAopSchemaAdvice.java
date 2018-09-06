package com.aspect;

import com.aspect.AspectBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring-aop-scheme-advice.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAopSchemaAdvice extends AbstractJUnit4SpringContextTests {
    @Autowired
    private AspectBiz aspectBiz;

    @Test
    public void testBiz(){
        aspectBiz.biz();
    }
    @Autowired
    private Fit fit;
    @Test
    public void testFit(){
        fit.filter();
    }
}
