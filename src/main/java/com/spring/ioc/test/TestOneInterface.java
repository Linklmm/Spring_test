package com.spring.ioc.test;

import com.spring.ioc.interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring-ioc.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestOneInterface extends AbstractJUnit4SpringContextTests {

    @Autowired
    private OneInterface oneInterface;
    @Test
    public void testHello(){
        System.out.println(oneInterface.hello("flower"));
    }
}
