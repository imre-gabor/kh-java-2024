package com.khb.hu.refactordemo;

public class MyMap<K, V> {
    int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int Count) {
        this.count = count;
    }

    public static void main(String[] args) {
        MyMap<String, Object> myMap = new MyMap<>();
        System.out.println(myMap.getCount());
    }
}
