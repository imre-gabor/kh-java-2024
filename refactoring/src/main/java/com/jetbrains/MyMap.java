package com.jetbrains;

public class MyMap {
    int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int Count) {
        this.count = count;
    }

    public static void main(String[] args) {
        MyMap myMap = new MyMap();
        System.out.println(myMap.getCount());
    }
}
