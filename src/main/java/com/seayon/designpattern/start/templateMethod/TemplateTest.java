package com.seayon.designpattern.start.templateMethod;

public class TemplateTest {
    /**
     * 在上海异地实时交易中,BaseN2LService 方法及其继承实现的类, 就可以看做是模板方法
     * @param args
     */
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.TemplateMethod();
    }
}
