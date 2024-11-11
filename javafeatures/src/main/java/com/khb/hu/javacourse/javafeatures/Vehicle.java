package com.khb.hu.javacourse.javafeatures;

public abstract sealed class Vehicle permits Car {

    public abstract int getNumWheels();
}
