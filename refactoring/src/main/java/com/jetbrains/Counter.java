package com.jetbrains;

public class Counter implements Comparable<Counter>{
    public final static Counter EMPTY = new Counter();
    private int count;

    public void incrementCount() {
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(Counter o) {
        return count-o.count;
    }
}