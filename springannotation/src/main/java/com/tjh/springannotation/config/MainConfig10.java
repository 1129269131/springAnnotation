package com.tjh.springannotation.config;

import com.tjh.springannotation.bean.ColorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * day10：
 *      组件注册-使用FactoryBean注册组件
 *
 *      说明：
 *          给容器中注册组件；
 *              使用Spring提供的 FactoryBean（工厂Bean）;
 * 		            1）、默认获取到的是工厂bean调用getObject创建的对象
 * 		            2）、要获取工厂Bean本身，我们需要给id前面加一个&
 * 			                &colorFactoryBean
 *
 * Create by koala on 2021-03-09
 */
@Configuration
public class MainConfig10 {

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }

}
