package com.seayon.designpattern.start.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.visitor
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/6/2 4:01 下午
 * @Version V1.0
 * @Description:
 */

public class ObjectStructure {
    private List<Element> elementList = new ArrayList<>();

    public void accept(Visitor visitor) {
        elementList.stream().forEach(e -> e.accept(visitor));
    }

    public void add(Element element) {
        elementList.add(element);
    }

    public void remove(Element element) {
        elementList.remove(element);
    }
}
