package com.tjh.springannotation;

import com.tjh.springannotation.bean.Boss;
import com.tjh.springannotation.bean.Car;
import com.tjh.springannotation.bean.Car2;
import com.tjh.springannotation.bean.Color2;
import com.tjh.springannotation.config.MainConfigOfAutowired;
import com.tjh.springannotation.config.MainConfigOfAutowired2;
import com.tjh.springannotation.config.MainConfigOfAutowired3;
import com.tjh.springannotation.dao.BookDao2;
import com.tjh.springannotation.service.BookService2;
import com.tjh.springannotation.service.BookService3;
import com.tjh.springannotation.service.BookService4;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create by koala on 2021-03-11
 */
public class IOCTest_AutowiredDay17 {

    //day17
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService2 bookService = applicationContext.getBean(BookService2.class);
        System.out.println(bookService);

        BookDao2 bean = applicationContext.getBean(BookDao2.class);
        System.out.println(bean);

        applicationContext.close();
    }

    //day18
    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService3 bookService = applicationContext.getBean(BookService3.class);
        System.out.println(bookService);

        applicationContext.close();
    }

    //day19
    @Test
    public void test03(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService4 bookService = applicationContext.getBean(BookService4.class);
        System.out.println(bookService);

        applicationContext.close();
    }

    //day20
    @Test
    public void test04(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired2.class);

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);

        Car2 car = applicationContext.getBean(Car2.class);
        System.out.println(car);

        Color2 color = applicationContext.getBean(Color2.class);
        System.out.println(color);
        applicationContext.close();
    }

    //day21
    @Test
    public void test05(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired3.class);

        System.out.println(applicationContext);
        applicationContext.close();
    }

}
