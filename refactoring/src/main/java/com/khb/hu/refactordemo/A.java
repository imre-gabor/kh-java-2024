package com.khb.hu.refactordemo;

import java.awt.*;

public class A {

    public void drawEdge(Graphics g, Edge edge) {
        final Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(edge.edgeWidth()));
        g.drawLine(edge.x1(), edge.y1(), edge.x2(), edge.y2());
    }

    public void m1() {
        extracted(1, 5);
        m4("abc");
    }

    private void extracted(int i, int i1) {
        m2(i);
        m3(i1);
    }

    public void m5() {
        extracted(4, 10);
        m4("abc");
    }

    private void m4(String abc) {
    }

    private void m3(int i) {

    }

    private void m2(int i) {

    }
}
