package com.khb.hu.javacourse.designpatterns.prototype.framework;

public abstract class GraphicTool extends Tool {

    protected Application app;

    public GraphicTool(Application app) {
        this.app = app;
    }

    @Override
    public void manipulate() {
        Graphic g = createGraphic();
        while(isMouseDragged()) {
            g.draw();
        }
        app.addGraphics(g);
    }

    private boolean isMouseDragged() {
        return true;
    }
    public abstract Graphic createGraphic();
}
