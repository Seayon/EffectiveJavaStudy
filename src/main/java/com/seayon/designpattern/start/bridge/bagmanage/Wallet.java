package com.seayon.designpattern.start.bridge.bagmanage;

public class Wallet extends Bag {
    @Override
    public String getName() {
        return color.getColor() + " Wallet";
    }
}
