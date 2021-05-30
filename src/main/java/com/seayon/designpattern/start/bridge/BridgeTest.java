package com.seayon.designpattern.start.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        ConcreteImplA concreteImplA = new ConcreteImplA();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(concreteImplA);

        refinedAbstraction.Operation();
    }
}
