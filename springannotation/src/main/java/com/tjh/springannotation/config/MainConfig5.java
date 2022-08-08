package com.tjh.springannotation.config;

import com.tjh.springannotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * day05:
 *      组件注册-@Lazy-bean懒加载：
 * 		    单实例bean：默认在容器启动的时候创建对象；
 * 		    懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
 *
 * Create by koala on 2021-03-09
 */
@Configuration
@ComponentScan(value = "com.tjh")
public class MainConfig5 {

    @Lazy
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加Person....");
        return new Person("张三", 25);
    }

}
