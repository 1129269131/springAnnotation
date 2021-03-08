package com.tjh.springannotation.config;

import com.tjh.springannotation.service.BookService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Create by koala on 2021-03-08
 * day02
 */
@Configuration
//@ComponentScan(value = "com.tjh")//指定要扫描的包
@ComponentScans(
        value = {
                @ComponentScan(value = "com.tjh", excludeFilters = {
                        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
                },includeFilters = {
                        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class})
                }, useDefaultFilters = false)//useDefaultFilters：是否使用默认过滤规则
        }
)

//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig2 {

}
