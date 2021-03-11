package com.tjh.springannotation.service;

import com.tjh.springannotation.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Create by koala on 2021-03-11
 * day19
 */
@Service
public class BookService4 {

    @Inject
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService4{" +
                "bookDao=" + bookDao +
                '}';
    }
}
