package com.tjh.springannotation.config;

import com.tjh.springannotation.condition.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Create by koala on 2021-03-09
 * day08：
 *   ImportSelector:返回需要导入的组件的全类名数组；
 */
@Configuration
@Import({MyImportSelector.class})
public class MainConfig8 {

}
