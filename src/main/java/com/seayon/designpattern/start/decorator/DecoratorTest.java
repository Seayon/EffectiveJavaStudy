package com.seayon.designpattern.start.decorator;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.decorator
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/31 9:46 上午
 * @Version V1.0
 * @Description:
 */

public class DecoratorTest {
    public static void main(String[] args) {

        Component component = new ConcreteComponent();
        component.Operation();
        System.out.println("-----------------");
        Component component1 = new ConcreteDecorator1(component);
        Component component2 = new ConcreteDecorator2(component);

        component1.Operation();
        component2.Operation();

    }
}
