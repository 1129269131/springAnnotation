package com.tjh.springannotation.config;

import com.tjh.springannotation.bean.Person;
import com.tjh.springannotation.condition.LinuxCondition;
import com.tjh.springannotation.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Create by koala on 2021-03-09
 * day06：
 * @Conditional({Condition}) ： 按照一定的条件进行判断，满足条件给容器中注册bean
 *
 * 如果系统是windows，给容器中注册("bill")
 * 如果是linux系统，给容器中注册("linus")
 */
@Conditional({WindowsCondition.class})//类中组件统一设置。满足当前条件，这个类中配置的所有bean注册才能生效；
@Configuration
public class MainConfig6 {

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        return new Person("Bill Gates",62);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linus")
    public Person person02(){
        return new Person("linus", 48);
    }

}
