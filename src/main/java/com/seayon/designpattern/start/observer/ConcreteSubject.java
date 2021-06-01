package com.seayon.designpattern.start.observer;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.observer
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 2:07 下午
 * @Version V1.0
 * @Description:
 */

public class ConcreteSubject extends Subject {

    @Override
    public void notifyObservers() {
        System.out.println("被观察类发生改变");
        //通知每个观察者
        observerList.stream().forEach(Observer::response);
    }
}
