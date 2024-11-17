package com.khb.hu.javacourse.designpatterns.prototype.musicapp;

import com.khb.hu.javacourse.designpatterns.prototype.framework.Application;

public class MusicApp extends Application {

    public static void main(String[] args) {
        MusicApp musicApp = new MusicApp();
        musicApp.init();
    }

    @Override
    public void init() {
        super.init();
        this.toolbar.add(new WholeNoteGraphicTool(this));
        this.toolbar.add(new HalfNoteGraphicTool(this));
        this.toolbar.add(new QuarterNoteGraphicTool(this));
        this.toolbar.add(new StaffGraphicTool(this));
    }
}
