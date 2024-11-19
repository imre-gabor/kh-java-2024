package com.khb.hu.javacourse.designpatterns.state;

public abstract class DocState {
    //DRAFT, MODERATION, PUBLISHED;
    public abstract void publish(Document doc);
}
