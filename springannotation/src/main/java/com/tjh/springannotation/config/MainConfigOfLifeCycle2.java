package com.tjh.springannotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create by koala on 2021-03-10
 * day12：
 * 通过让Bean实现InitializingBean（定义初始化逻辑），
 * 				DisposableBean（定义销毁逻辑）;
 */
@ComponentScan("com.tjh.springannotation.bean")
@Configuration
public class MainConfigOfLifeCycle2 {

}
