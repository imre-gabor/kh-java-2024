package com.jetbrains;

import java.util.ArrayList;
import java.util.Map;

public class Tree {
    Map<String, Node> childNodes;

    public Map<String, Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(Map<String, Node> childNodes) {
        this.childNodes = childNodes;
    }

    ArrayList<Node> children;

    ArrayList<Node> getChildren() {
        return children;
    }
}