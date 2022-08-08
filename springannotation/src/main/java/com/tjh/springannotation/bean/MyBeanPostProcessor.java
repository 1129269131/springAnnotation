package com.tjh.springannotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * day14：
 *      生命周期-BeanPostProcessor-后置处理器
 *
 *      说明：
 *          后置处理器：初始化前后进行处理工作
 *          将后置处理器加入到容器中
 *
 *          BeanPostProcessor【interface】：bean的后置处理器；
 *  		        在bean初始化前后进行一些处理工作；
 *  		        postProcessBeforeInitialization：在初始化之前工作
 *  		        postProcessAfterInitialization：在初始化之后工作
 *
 * Create by koala on 2021-03-10
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..." + beanName + "=>" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..." + beanName + "=>" + bean);
        return bean;
    }

}

