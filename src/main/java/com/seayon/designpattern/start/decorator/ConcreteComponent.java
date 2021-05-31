package com.seayon.designpattern.start.decorator;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.decorator
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/31 9:42 上午
 * @Version V1.0
 * @Description:
 */

public class ConcreteComponent implements Component{

    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void Operation() {
        System.out.println("具体装饰应用");
    }
}
