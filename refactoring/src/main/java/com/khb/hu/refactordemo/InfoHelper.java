package com.khb.hu.refactordemo;

public class InfoHelper {
    private String b;

    public InfoHelper(String b) {
        this.b = b;
    }

    public String getInfo() {
        return ("(" + b + ")");
    }
}