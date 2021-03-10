package com.tjh.springannotation.bean;

/**
 * Create by koala on 2021-03-10
 * day11：
 */
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car ... init...");
    }

    public void destroy(){
        System.out.println("car ... detory...");
    }

}
