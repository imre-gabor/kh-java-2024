package com.khb.hu.javacourse.designpatterns.prototype.framework;

public abstract class Graphic implements Cloneable {

    public abstract void draw();

    public Graphic clone() {
        try {
            return (Graphic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
