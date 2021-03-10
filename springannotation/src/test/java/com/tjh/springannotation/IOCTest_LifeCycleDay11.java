package com.tjh.springannotation;

import com.tjh.springannotation.config.MainConfigOfLifeCycle;
import com.tjh.springannotation.config.MainConfigOfLifeCycle2;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create by koala on 2021-03-10
 */
public class IOCTest_LifeCycleDay11 {

    //day11
    @Test
    public void test01(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");

        //applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
    }

    //day12
    @Test
    public void test02(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle2.class);
        System.out.println("容器创建完成...");

        //关闭容器
        applicationContext.close();
    }

    //day13
    @Test
    public void test03(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle2.class);
        System.out.println("容器创建完成...");

        //关闭容器
        applicationContext.close();
    }

    //day14
    @Test
    public void test04(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle2.class);
        System.out.println("容器创建完成...");

        //关闭容器
        applicationContext.close();
    }

    //day15
    @Test
    public void test05(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle2.class);
        System.out.println("容器创建完成...");

        //关闭容器
        applicationContext.close();
    }

}
