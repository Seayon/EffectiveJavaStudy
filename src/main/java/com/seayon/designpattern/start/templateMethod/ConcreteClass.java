package com.seayon.designpattern.start.templateMethod;

public class ConcreteClass extends AbstractClass{
    @Override
    public void method1() {
        System.out.println("具体实现类实现方法 1");
    }

    @Override
    public void method2() {
        System.out.println("具体实现类实现方法 2");
    }
}
