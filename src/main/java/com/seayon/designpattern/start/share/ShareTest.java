package com.seayon.designpattern.start.share;

public class ShareTest {
    //    享元模式就是将已经创建的对象缓存在某个地方,再次使用的时候直接拿出来用而不是重新创建
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight a1 = flyweightFactory.flyweight("a");
        Flyweight a2 = flyweightFactory.flyweight("a");
        Flyweight a3 = flyweightFactory.flyweight("a");
        Flyweight b1 = flyweightFactory.flyweight("b");
        Flyweight b2 = flyweightFactory.flyweight("b");

        a1.operation(new UnsharedConcreteFlyWeight("unshare1"));
        a2.operation(new UnsharedConcreteFlyWeight("unshare2"));
        a3.operation(new UnsharedConcreteFlyWeight("unshare3"));

        b1.operation(new UnsharedConcreteFlyWeight("unshare1"));
        b2.operation(new UnsharedConcreteFlyWeight("unshare1"));
    }
}
