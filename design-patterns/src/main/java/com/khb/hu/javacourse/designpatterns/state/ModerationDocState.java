package com.khb.hu.javacourse.designpatterns.state;

public class ModerationDocState extends DocState {

    @Override
    public void publish(Document doc) {
        if(doc.isCurrentUserAdmin())
            doc.setState(new PublishedDocState());
    }
}
