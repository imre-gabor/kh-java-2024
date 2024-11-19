package com.khb.hu.javacourse.designpatterns.state;

public class DraftDocState extends DocState {

    @Override
    public void publish(Document doc) {
        doc.setState(new ModerationDocState());
    }
}
