package com.seayon.designpattern.start.templateMethod;

public abstract class AbstractClass {

    public void TemplateMethod() {
        specificMethod();
        method1();
        method2();
    }

    public void specificMethod() {
        System.out.println("模板方法特有方法调用");
    }

    public abstract void method1();

    public abstract void method2();


}
