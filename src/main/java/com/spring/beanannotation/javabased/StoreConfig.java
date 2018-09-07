package com.spring.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {


    //以方法名为名称
    @Bean(name = "store",initMethod = "init",destroyMethod = "destroy")
    public StringStore StringStore(){
        return new StringStore();
    }

//    @Autowired
//    private Store<String> s1;
//    @Autowired
//    private Store<Integer> s2;
//    @Bean
//    public StringStore stringStore(){
//        return new StringStore();
//    }
//
//    @Bean
//    public IntegerStore integerStore(){
//        return new IntegerStore();
//    }
//
//    @Bean
//    public Store stringStoreTest(){
//        System.out.println("S1;"+s1.getClass().getName());
//        System.out.println("S2;"+s2.getClass().getName());
//        return new StringStore();
//    }

}
