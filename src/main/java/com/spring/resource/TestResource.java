package com.spring.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@ContextConfiguration(locations = {"classpath:spring-resource.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestResource extends AbstractJUnit4SpringContextTests {
    @Autowired
    private LmmResource lmmResource;
    @Test
    public void test() throws IOException {
        lmmResource.resource();
    }
}
