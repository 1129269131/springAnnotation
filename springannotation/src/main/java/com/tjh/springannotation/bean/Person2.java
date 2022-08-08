package com.tjh.springannotation.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * day16：
 *      属性赋值-@Value赋值
 *
 *      说明：
 *          使用@Value赋值：
 *              1、基本数值
 *              2、可以写SpEL：#{}
 *              3、可以写${}：取出配置文件【properties】中的值（在运行环境变量里面的值）
 *
 * Create by koala on 2021-03-10
 */
public class Person2 {

    @Value("张三")
    private String name;

    @Value("#{20-2}")
    private Integer age;

    @Value("${person2.nickName}")
    private String nickName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
