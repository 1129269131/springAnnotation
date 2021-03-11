package com.tjh.springannotation.dao;

import org.springframework.stereotype.Repository;

/**
 * Create by koala on 2021-03-11
 * day17
 */
//名字默认是类名首字母小写
@Repository
public class BookDao2 {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao2{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
