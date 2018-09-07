package com.spring.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String word) {
        return "Word form interface\"OneInterface\":"+word;
    }
}
