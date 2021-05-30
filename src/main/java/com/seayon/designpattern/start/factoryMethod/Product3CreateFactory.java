package com.seayon.designpattern.start.factoryMethod;

public class Product3CreateFactory implements ProductCreateFactory {
    @Override
    public Product create() {
        return new Product3();
    }
}
