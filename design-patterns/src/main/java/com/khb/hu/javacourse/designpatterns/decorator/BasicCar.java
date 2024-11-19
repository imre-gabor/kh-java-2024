package com.khb.hu.javacourse.designpatterns.decorator;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}
