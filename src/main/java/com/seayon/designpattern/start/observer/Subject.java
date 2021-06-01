package com.seayon.designpattern.start.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.observer
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 2:06 下午
 * @Version V1.0
 * @Description:
 */

public abstract class Subject {

    protected List<Observer> observerList = new ArrayList<>();


    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public abstract void notifyObservers();

}
