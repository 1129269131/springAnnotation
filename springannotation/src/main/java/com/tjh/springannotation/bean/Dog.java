package com.tjh.springannotation.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * day13：
 *      生命周期-@PostConstruct&@PreDestroy
 *
 *      说明：
 *          可以使用JSR250；
 *  	        @PostConstruct：在bean创建完成并且属性赋值完成；来执行初始化方法
 *   	        @PreDestroy：在容器销毁bean之前通知我们进行清理工作
 *
 * Create by koala on 2021-03-10
 */
@Component
public class Dog {

    public Dog(){
        System.out.println("dog constructor...");
    }

    //对象创建并赋值之后调用
    @PostConstruct
    public void init(){
        System.out.println("Dog....@PostConstruct...");
    }

    //容器移除对象之前
    @PreDestroy
    public void detory(){
        System.out.println("Dog....@PreDestroy...");
    }

}
