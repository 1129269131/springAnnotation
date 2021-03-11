package com.tjh.springannotation.controller;

import com.tjh.springannotation.service.BookService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Create by koala on 2021-03-11
 * day17
 */
@Controller
public class BookController2 {

    @Autowired
    private BookService2 bookService;

}
