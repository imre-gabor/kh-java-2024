package com.khb.hu.javacourse.designpatterns.prototype.musicapp;

import com.khb.hu.javacourse.designpatterns.prototype.framework.Application;
import com.khb.hu.javacourse.designpatterns.prototype.framework.Graphic;
import com.khb.hu.javacourse.designpatterns.prototype.framework.GraphicTool;

public class StaffGraphicTool extends GraphicTool {

    public StaffGraphicTool(Application app) {
        super(app);
    }

    @Override
    public Graphic createGraphic() {
        return new Staff();
    }
}
