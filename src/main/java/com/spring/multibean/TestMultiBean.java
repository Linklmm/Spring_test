package com.spring.multibean;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring-beanannotation.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMultiBean extends AbstractJUnit4SpringContextTests {
    @Autowired
    private BeanInvoker invoker;

//    @Before
//    public void setInvoker(BeanInvoker invoker) {
//        this.invoker = invoker;
//    }

    @Test
    public void testMultiBean(){
        invoker.say();
    }
}
