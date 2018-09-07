package com.spring.autowiring.test;

import com.spring.autowiring.service.AutoWiringService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring-autowiring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAutoWiring extends AbstractJUnit4SpringContextTests {
    @Autowired
    private AutoWiringService autoWiringService;

    @Test
    public void testAutoWiring(){
        autoWiringService.say("Bo Jun smiles");
    }
}
