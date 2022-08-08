package com.tjh.springannotation.service;

import com.tjh.springannotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * day17
 * Create by koala on 2021-03-11
 */
@Service
public class BookService2 {

    @Qualifier("bookDao")//使用@Qualifier指定需要装配的组件的id，而不是使用属性名
    @Autowired(required=false)//自动装配默认一定要将属性赋值好，没有就会报错；为false时属性不赋值也不会报错
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService [bookDao=" + bookDao + "]";
    }

}
