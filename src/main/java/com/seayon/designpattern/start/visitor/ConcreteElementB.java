package com.seayon.designpattern.start.visitor;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.visitor
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/2 3:54 下午
 * @Version V1.0
 * @Description:
 */

public class ConcreteElementB implements Element{


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素 B 的操作";
    }
}
