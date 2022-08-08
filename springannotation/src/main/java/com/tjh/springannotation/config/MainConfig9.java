package com.tjh.springannotation.config;

import com.tjh.springannotation.bean.Red;
import com.tjh.springannotation.bean.Blue;
import com.tjh.springannotation.condition.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * day09：
 *      组件注册-@Import-使用ImportBeanDefinitionRegistrar
 *
 *      说明：
 *          ImportBeanDefinitionRegistrar：手动注册bean到容器中
 *
 * Create by koala on 2021-03-09
 */
@Configuration
@Import({Red.class, Blue.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig9 {
}
