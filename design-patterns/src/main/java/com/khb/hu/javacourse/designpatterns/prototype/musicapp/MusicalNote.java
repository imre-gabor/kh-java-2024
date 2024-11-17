package com.khb.hu.javacourse.designpatterns.prototype.musicapp;

import com.khb.hu.javacourse.designpatterns.prototype.framework.Graphic;

public class MusicalNote extends Graphic {
    private double duration;

    private String pitch;

    public MusicalNote(double duration) {
        this.duration = duration;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    @Override
    public void draw() {
        //draw based on duration
    }
}
