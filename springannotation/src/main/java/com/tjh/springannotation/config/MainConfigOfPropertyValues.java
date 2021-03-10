package com.tjh.springannotation.config;

import com.tjh.springannotation.bean.Person;
import com.tjh.springannotation.bean.Person2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Create by koala on 2021-03-10
 * day16：
 * 使用@PropertySource读取外部配置文件中的k/v保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
 */
@PropertySource(value={"classpath:/person2Day16.properties"})
@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Person2 person2(){
        return new Person2();
    }

}
