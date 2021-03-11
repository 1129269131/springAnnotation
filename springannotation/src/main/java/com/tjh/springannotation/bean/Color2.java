package com.tjh.springannotation.bean;

/**
 * Create by koala on 2021-03-11
 * day20
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
