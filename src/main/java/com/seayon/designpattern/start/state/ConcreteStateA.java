package com.seayon.designpattern.start.state;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.state
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/1 11:55 上午
 * @Version V1.0
 * @Description:
 */

public class ConcreteStateA implements State{
    @Override
    public void handle(Context context) {
        System.out.println("状态 A");
        context.setState(new ConcreteStateB());
    }
}
