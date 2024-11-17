package com.khb.hu.javacourse.designpatterns.state;

public class Document {

    private DocState state;

    public void publish() {
        switch (state) {
            case DRAFT -> state = DocState.MODERATION;
            case MODERATION -> {
                if (isCurrentUserAdmin())
                    state = DocState.PUBLISHED;
            }
            case PUBLISHED -> {} //do nothing;
        }
    }

    //other methods with similar switch!!!

    private boolean isCurrentUserAdmin() {
        return true;
    }
}
