package com.tjh.springannotation;

import com.tjh.springannotation.bean.Yellow;
import com.tjh.springannotation.config.MainConfigOfProfile;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.activation.DataSource;

/**
 * Create by koala on 2021-03-11
 * day22：
 *     1、使用命令行动态参数: 在虚拟机参数位置加载 -Dspring.profiles.active=test
 *     2、代码的方式激活某种环境
 */
public class IOCTest_ProfileDay22 {

    //方式一：使用命令行动态参数: 在虚拟机参数位置加载 -Dspring.profiles.active=test
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigOfProfile.class);

        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String string : namesForType) {
            System.out.println(string);
        }

        /*Yellow bean = applicationContext.getBean(Yellow.class);
        System.out.println(bean);*/
        applicationContext.close();
    }

    //方式二：代码的方式激活某种环境
    @Test
    public void test02(){
        //1、创建一个applicationContext
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        //2、设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("test");
        //3、注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        //4、启动刷新容器
        applicationContext.refresh();

        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String string : namesForType) {
            System.out.println(string);
        }

        /*Yellow bean = applicationContext.getBean(Yellow.class);
        System.out.println(bean);*/
        applicationContext.close();
    }

}
