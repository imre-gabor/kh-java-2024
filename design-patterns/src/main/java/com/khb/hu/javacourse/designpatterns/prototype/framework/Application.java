package com.khb.hu.javacourse.designpatterns.prototype.framework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    protected List<Tool> toolbar;
    protected List<Graphic> graphics;

    public void init(){
        toolbar = new ArrayList<>();
        toolbar.add(new RotateTool());
        graphics = new ArrayList<>();
    }

    public void addGraphics(Graphic g) {
        this.graphics.add(g);
    }

    public void onToolSelected(Tool tool){
        tool.manipulate();
    }
}
