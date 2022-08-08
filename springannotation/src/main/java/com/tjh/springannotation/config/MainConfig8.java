package com.tjh.springannotation.config;

import com.tjh.springannotation.condition.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * day08：
 *      组件注册-@Import-使用ImportSelector
 *
 *      说明：
 *          ImportSelector：返回需要导入的组件的全类名数组；
 *
 * Create by koala on 2021-03-09
 */
@Configuration
@Import({MyImportSelector.class})
public class MainConfig8 {
}
