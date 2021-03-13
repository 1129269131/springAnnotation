package com.tjh.springannotation.config;

import com.tjh.springannotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by koala on 2021-03-08
 * day01
 */
//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类
public class MainConfig {

    //给容器中注册一个Bean;类型为返回值的类型，默认是用方法名作为id
    @Bean("person01")
    public Person person(){
        return new Person("lisi", 20);
    }

}
