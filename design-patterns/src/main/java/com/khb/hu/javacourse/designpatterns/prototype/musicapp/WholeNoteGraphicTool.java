package com.khb.hu.javacourse.designpatterns.prototype.musicapp;

import com.khb.hu.javacourse.designpatterns.prototype.framework.Application;
import com.khb.hu.javacourse.designpatterns.prototype.framework.Graphic;
import com.khb.hu.javacourse.designpatterns.prototype.framework.GraphicTool;
import com.khb.hu.javacourse.designpatterns.prototype.framework.Tool;

public class WholeNoteGraphicTool extends GraphicTool {

    public WholeNoteGraphicTool(Application app) {
        super(app);
    }

    @Override
    public Graphic createGraphic() {
        return new MusicalNote(1.0);
    }
}
