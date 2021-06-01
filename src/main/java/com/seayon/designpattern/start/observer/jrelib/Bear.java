package com.seayon.designpattern.start.observer.jrelib;

import java.util.Observable;
import java.util.Observer;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.observer.jrelib
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 2:16 下午
 * @Version V1.0
 * @Description:
 */

public class Bear implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if ((Float) arg > 0) {
            System.out.println("油价上涨" + arg + "元,空方伤心");
        } else {
            System.out.println("油价下跌" + arg + "元,空方高兴");
        }
    }
}
