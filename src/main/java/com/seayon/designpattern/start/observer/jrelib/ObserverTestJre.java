package com.seayon.designpattern.start.observer.jrelib;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.observer.jrelib
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 2:21 下午
 * @Version V1.0
 * @Description:
 */

public class ObserverTestJre {
    public static void main(String[] args) {
        OilFutures oilFutures = new OilFutures();
        Bear bear = new Bear();
        Bull bull = new Bull();
        oilFutures.addObserver(bear);
        oilFutures.addObserver(bull);

        oilFutures.setPrice(-1);
        oilFutures.setPrice(100);
    }
}
