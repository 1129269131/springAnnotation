package com.tjh.springannotation;

import com.tjh.springannotation.bean.Blue;
import com.tjh.springannotation.bean.Person;
import com.tjh.springannotation.config.MainConfig10;
import com.tjh.springannotation.config.MainConfig2;
import com.tjh.springannotation.config.MainConfig3;
import com.tjh.springannotation.config.MainConfig4;
import com.tjh.springannotation.config.MainConfig6;
import com.tjh.springannotation.config.MainConfig7;
import com.tjh.springannotation.config.MainConfig8;
import com.tjh.springannotation.config.MainConfig9;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

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

    //day05
    @Test
    public void test04(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig4.class);

        System.out.println("ioc容器创建完成....");
        Object bean = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println(bean == bean2);
    }

    //day06
    @Test
    public void test05(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig6.class);
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //动态获取环境变量的值；Windows 10
        String property = environment.getProperty("os.name");
        System.out.println(property);
        for (String name : namesForType) {
            System.out.println(name);
        }

        Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);
        System.out.println(persons);
    }

    //day07
    @Test
    public void testImport(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig7.class);

        printBeans(applicationContext);
    }

    //day08
    @Test
    public void testImport2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig8.class);

        Blue bean = applicationContext.getBean(Blue.class);
        System.out.println(bean);

        printBeans(applicationContext);
    }

    //day09
    @Test
    public void testImport3(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig10.class);

        printBeans(applicationContext);

        //工厂Bean获取的是调用getObject创建的对象
        Object bean1 = applicationContext.getBean("colorFactoryBean");
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        System.out.println("bean的类型："+bean1.getClass());
        System.out.println(bean1 == bean2);

        Object bean3 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(bean3.getClass());
    }

    //day10
    @Test
    public void testImport4(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig9.class);

        printBeans(applicationContext);
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

}
