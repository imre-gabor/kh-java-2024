package com.khb.hu.javacourse.designpatterns.prototype.framework;

public class GraphicTool extends Tool {

    protected Application app;
    protected Graphic prototype;

    public GraphicTool(Application app, Graphic prototype) {
        this.app = app;
        this.prototype = prototype;
    }

    @Override
    public void manipulate() {
        Graphic g = prototype.clone();
        while(isMouseDragged()) {
            g.draw();
        }
        app.addGraphics(g);
    }

    private boolean isMouseDragged() {
        return true;
    }
}
