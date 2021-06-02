package com.seayon.designpattern.start.memento;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.memento
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/2 4:58 下午
 * @Version V1.0
 * @Description:
 */

public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("S1");
        System.out.println(originator);
        Memento memento = originator.createMemento();
        originator.setState("S0");
        System.out.println(originator);
        originator.restoreMemento(memento);
        System.out.println(originator);
    }
}
