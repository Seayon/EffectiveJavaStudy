package com.seayon.designpattern.start.chain;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        concreteHandler1.setNext(concreteHandler2);

        concreteHandler1.handRequest("one");
        concreteHandler1.handRequest("two");
        concreteHandler1.handRequest("three");

    }
}
