package com.seayon.designpattern.start.factoryMethod;

public class Product2CreateFactory implements ProductCreateFactory{
    @Override
    public Product create() {
        return new Product2();
    }
    
}
