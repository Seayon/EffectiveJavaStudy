package com.seayon.designpattern.start.bridge.bagmanage;

public class HandBag extends Bag {
    @Override
    public String getName() {
        return color.getColor() + " HandBag";
    }
}
