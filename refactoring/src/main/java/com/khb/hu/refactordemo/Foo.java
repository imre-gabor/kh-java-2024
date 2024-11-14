package com.khb.hu.refactordemo;

public class Foo {

    private final InfoHelper infoHelper;
    private final Calculator calculator;

    public Foo(String b, int state) {
        this.infoHelper = new InfoHelper(b);
        this.calculator = new Calculator(state);
    }

    public String getInfo() {
        return infoHelper.getInfo();
    }

    public int calculate() {
        return calculator.calculate();
    }
}
