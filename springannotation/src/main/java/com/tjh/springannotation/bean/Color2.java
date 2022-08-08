package com.tjh.springannotation.bean;

/**
 * day20
 * Create by koala on 2021-03-11
 */
public class Color2 {

    private Car2 car;

    public Car2 getCar() {
        return car;
    }

    public void setCar(Car2 car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color2{" +
                "car=" + car +
                '}';
    }
}
