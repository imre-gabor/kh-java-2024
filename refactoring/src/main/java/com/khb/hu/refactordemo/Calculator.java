package com.khb.hu.refactordemo;

public class Calculator {
    private int state;

    public Calculator(int state) {
        this.state = state;
    }

    public int calculate() {
        return state * 5;
    }
}