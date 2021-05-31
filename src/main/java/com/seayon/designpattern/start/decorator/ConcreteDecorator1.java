package com.seayon.designpattern.start.decorator;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.decorator
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/31 9:44 上午
 * @Version V1.0
 * @Description:
 */

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    public void Operation() {
        super.Operation();
        this.addedFunction();
    }

    public void addedFunction() {
        System.out.println("额外装饰方法调用1");
    }
}
