package com.seayon.designpattern.start.abstractFactoryMethod;

public class SGFactory implements Fram {

    @Override
    public Animal createAnimel() {
        return new Chicken();
    }

    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
