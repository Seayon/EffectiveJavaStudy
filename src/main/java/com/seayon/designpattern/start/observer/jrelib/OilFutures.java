package com.seayon.designpattern.start.observer.jrelib;

import java.util.Observable;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.observer.jrelib
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 2:17 下午
 * @Version V1.0
 * @Description:
 */

public class OilFutures extends Observable {
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        //调用父类被观察者的方法,指明被观察者有所改变
        super.setChanged();
        //调用父类通知观察者,并且将价格传入进去
        super.notifyObservers(price);
    }


}
