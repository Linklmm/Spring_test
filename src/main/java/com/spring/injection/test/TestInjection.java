package com.spring.injection.test;

import com.spring.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@ContextConfiguration(locations = {"classpath:spring-injection.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestInjection extends AbstractJUnit4SpringContextTests {
    @Autowired
    private InjectionService injectionService;

    @Test
    public void testSetter(){
        injectionService.save("保存的数据");
    }

    @Test
    public void testCons(){
        injectionService.save("构造器");
    }
}
