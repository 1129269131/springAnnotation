package com.tjh.springannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * day20：
 *      自动装配-方法.构造器位置的自动装配
 *
 *      说明：
 *          @Autowired:构造器，参数，方法，属性；都是从容器中获取参数组件的值
 * 		        1）、[标注在方法位置]：@Bean+方法参数；参数从容器中获取;默认不写@Autowired效果是一样的；都能自动装配
 * 		        2）、[标在构造器上]：如果组件只有一个有参构造器，这个有参构造器的@Autowired可以省略，参数位置的组件还是可以自动从容器中获取
 * 		        3）、放在参数位置
 *
 * Create by koala on 2021-03-11
 */
//默认加在ioc容器中的组件，容器启动会调用无参构造器创建对象，再进行初始化赋值等操作
@Component
public class Boss {

    private Car2 car;

    //构造器要用的组件，都是从容器中获取
    //@Autowired
    public Boss(Car2 car){
        this.car = car;
        System.out.println("Boss...有参构造器");
    }

    public Car2 getCar() {
        return car;
    }

    //标注在方法，Spring容器创建当前对象，就会调用方法，完成赋值；
    //方法使用的参数，自定义类型的值从ioc容器中获取
    //@Autowired
    public void setCar(@Autowired Car2 car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
