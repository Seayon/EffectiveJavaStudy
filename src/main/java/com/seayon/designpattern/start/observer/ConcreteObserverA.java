package com.seayon.designpattern.start.observer;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.observer
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 2:10 下午
 * @Version V1.0
 * @Description:
 */

public class ConcreteObserverA implements Observer{
    @Override
    public void response() {
        System.out.println("观察者 A响应");
    }
}
