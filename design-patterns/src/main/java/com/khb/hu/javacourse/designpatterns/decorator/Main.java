package com.khb.hu.javacourse.designpatterns.decorator;

public class Main {

    public static void main(String[] args) {
        //new LuxuryCar().assemble();
        //new SportsCar().assemble();
        //cannot create luxury sports car

        new LuxuryCar(new SportsCar(new BasicCar())).assemble();
    }
}
