package com.tjh.springannotation.service;

import com.tjh.springannotation.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * day18：
 *      自动装配-@Resource&@Inject
 *
 * Create by koala on 2021-03-11
 */
@Service
public class BookService3 {

    @Resource(name="bookDao")
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService3{" +
                "bookDao=" + bookDao +
                '}';
    }
}
