package com.spring.beanannotation.javabased;

public class IntegerStore implements Store<Integer> {

    public void init() {
    System.out.println("integer");
    }

    public void destroy() {
        System.out.println("integer");
    }
}
