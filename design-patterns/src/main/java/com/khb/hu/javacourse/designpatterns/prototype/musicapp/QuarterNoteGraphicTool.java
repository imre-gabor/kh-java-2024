package com.khb.hu.javacourse.designpatterns.prototype.musicapp;

import com.khb.hu.javacourse.designpatterns.prototype.framework.Application;
import com.khb.hu.javacourse.designpatterns.prototype.framework.Graphic;
import com.khb.hu.javacourse.designpatterns.prototype.framework.GraphicTool;

public class QuarterNoteGraphicTool extends GraphicTool {

    public QuarterNoteGraphicTool(Application app) {
        super(app);
    }

    @Override
    public Graphic createGraphic() {
        return new MusicalNote(0.25);
    }
}
