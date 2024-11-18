package com.khb.hu.javacourse.designpatterns.prototype.musicapp;

import com.khb.hu.javacourse.designpatterns.prototype.framework.Application;
import com.khb.hu.javacourse.designpatterns.prototype.framework.GraphicTool;

public class MusicApp extends Application {

    public static void main(String[] args) {
        MusicApp musicApp = new MusicApp();
        musicApp.init();
    }

    @Override
    public void init() {
        super.init();
        this.toolbar.add(new GraphicTool(this, new MusicalNote(1.0)));
        this.toolbar.add(new GraphicTool(this, new MusicalNote(0.5)));
        this.toolbar.add(new GraphicTool(this, new MusicalNote(0.25)));
        this.toolbar.add(new GraphicTool(this, new Staff()));
    }
}
