package com.jetbrains;

public class Foo {
    private String b;
    private int state;

    public Foo(String b, int state) {
        this.b = b;
        this.state = state;
    }

    public String getInfo() {
        return ("(" + b + ")");
    }

    public int calculate() {
        return state * 5;
    }
}
