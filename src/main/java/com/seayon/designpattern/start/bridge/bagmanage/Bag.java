package com.seayon.designpattern.start.bridge.bagmanage;

abstract class Bag {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
