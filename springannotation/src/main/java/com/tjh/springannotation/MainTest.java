package com.tjh.springannotation;

import com.tjh.springannotation.bean.Person;
import com.tjh.springannotation.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * day01
 * Create by koala on 2021-03-08
 */
public class MainTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        System.out.println("------------------------------------------------------");

        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : namesForType) {
            System.out.println(name);
        }
    }

}
