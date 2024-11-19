package com.khb.hu.javacourse.designpatterns.state;

public class Document {

    private DocState state = new DraftDocState();

    public void setState(DocState state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);
    }

    //other methods with similar switch!!!

    public boolean isCurrentUserAdmin() {
        return true;
    }
}
