package com.seayon.designpattern.start.share;

public class ConcreteFlyweight1 implements Flyweight {

    //    定义一个标记唯一对象的 key
    public String key;

    ConcreteFlyweight1(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyWeight unsharedConcreteFlyWeight) {
        System.out.println("具体享元" + key + "被调用");
        System.out.println("非享元信息" + unsharedConcreteFlyWeight.getInfo());
    }
}
