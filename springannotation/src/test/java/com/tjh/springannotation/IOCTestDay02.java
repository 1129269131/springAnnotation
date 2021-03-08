package com.tjh.springannotation;

import com.tjh.springannotation.config.MainConfig2;
import com.tjh.springannotation.config.MainConfig3;
import com.tjh.springannotation.config.MainConfig4;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create by koala on 2021-03-08
 */
public class IOCTestDay02 {

    //day02
    @SuppressWarnings("resource")
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    //day03
    @SuppressWarnings("resource")
    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    //day04
    @Test
    public void test03(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig4.class);
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}

        System.out.println("ioc容器创建完成....");
        Object bean = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println(bean == bean2);
    }

}
