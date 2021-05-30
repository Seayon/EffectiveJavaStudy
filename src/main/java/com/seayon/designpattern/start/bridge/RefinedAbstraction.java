package com.seayon.designpattern.start.bridge;

public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        implementor.OperationImpl();
    }
}
