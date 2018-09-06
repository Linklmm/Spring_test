package com.ioc.interfaces;

public class Test {
    public static void main(String[] args) {
        OneInterface oif=new OneInterfaceImpl();
        System.out.println(oif.hello("word"));
    }
}
