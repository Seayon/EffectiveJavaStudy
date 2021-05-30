package com.seayon.designpattern.start.abstractFactoryMethod;

public class SRFactory implements Fram{

    @Override
    public Animal createAnimel() {
        return new Pig();
    }

    @Override
    public Fruit createFruit() {
        return new Orange();
    }
}
