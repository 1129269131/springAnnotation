package com.tjh.springannotation.config;

import com.tjh.springannotation.bean.Red;
import com.tjh.springannotation.bean.Blue;
import com.tjh.springannotation.condition.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Create by koala on 2021-03-09
 * day09：
 *   ImportBeanDefinitionRegistrar:手动注册bean到容器中
 */
@Configuration
@Import({Red.class, Blue.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig9 {

}
