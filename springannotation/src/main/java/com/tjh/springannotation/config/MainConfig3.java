package com.tjh.springannotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Create by koala on 2021-03-08
 * day03
 */
@Configuration
@ComponentScans(
        value = {
                @ComponentScan(value = "com.tjh",includeFilters = {
                        @ComponentScan.Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
                }, useDefaultFilters = false)//useDefaultFilters：是否使用默认过滤规则
        }
)
public class MainConfig3 {

}
