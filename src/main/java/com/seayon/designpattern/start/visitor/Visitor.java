package com.seayon.designpattern.start.visitor;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.visitor
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/2 3:53 下午
 * @Version V1.0
 * @Description:
 */

public interface Visitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);

}
