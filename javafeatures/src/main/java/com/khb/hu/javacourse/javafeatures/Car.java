package com.khb.hu.javacourse.javafeatures;

public non-sealed class Car extends Vehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getNumWheels() {
        return 4;
    }
}
