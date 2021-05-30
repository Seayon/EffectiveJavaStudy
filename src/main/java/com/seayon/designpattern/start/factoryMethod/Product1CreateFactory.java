package com.seayon.designpattern.start.factoryMethod;

public class Product1CreateFactory implements ProductCreateFactory {
    @Override
    public Product create() {
        return new Product1();
    }
}
