package com.tjh.springannotation;

import com.tjh.springannotation.bean.Person;
import com.tjh.springannotation.bean.Person2;
import com.tjh.springannotation.config.MainConfigOfPropertyValues;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Create by koala on 2021-03-10
 * day16
 */
public class IOCTest_PropertyValueDay16 {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test01(){
        printBeans(applicationContext);
        System.out.println("=============");

        Person2 person = (Person2) applicationContext.getBean("person2");
        System.out.println(person);

        //通过运行时环境获取配置文件中的数据
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("person2.nickName");
        System.out.println(property);
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

}
