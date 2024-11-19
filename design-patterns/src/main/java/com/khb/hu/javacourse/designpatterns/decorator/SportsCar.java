package com.khb.hu.javacourse.designpatterns.decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Sports car");
    }
}
