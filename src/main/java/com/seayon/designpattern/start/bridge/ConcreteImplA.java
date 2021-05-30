package com.seayon.designpattern.start.bridge;

public class ConcreteImplA implements Implementor{

    @Override
    public void OperationImpl() {
        System.out.println("具体实现类 A...");
    }
}
