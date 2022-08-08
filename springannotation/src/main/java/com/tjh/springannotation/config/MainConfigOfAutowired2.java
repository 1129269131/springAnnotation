package com.tjh.springannotation.config;

import com.tjh.springannotation.bean.Car2;
import com.tjh.springannotation.bean.Color2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * day20
 * Create by koala on 2021-03-11
 */
@Configuration
@ComponentScan({"com.tjh.springannotation.bean"})
public class MainConfigOfAutowired2 {

    //@Bean标注的方法创建对象的时候，方法参数的值从容器中获取
    @Bean
    public Color2 color(Car2 car){
        Color2 color = new Color2();
        color.setCar(car);
        return color;
    }

}
