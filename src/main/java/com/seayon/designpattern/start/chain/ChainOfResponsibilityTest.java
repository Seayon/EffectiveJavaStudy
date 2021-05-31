package com.seayon.designpattern.start.chain;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
//        责任链模式,是同一个抽象类的几种不同的处理实现,每个处理实现可以用引用包含下一个处理类,实现链式连接,然后从第一个开始调用请求处理方法,在处理方法中判断能否处理,依次往下调用
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        concreteHandler1.setNext(concreteHandler2);

        concreteHandler1.handRequest("one");
        concreteHandler1.handRequest("two");
        concreteHandler1.handRequest("three");

    }
}
