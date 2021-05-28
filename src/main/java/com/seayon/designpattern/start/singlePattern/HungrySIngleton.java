package com.seayon.designpattern.start.singlePattern;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.singlePattern
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/28 4:32 下午
 * @Version V1.0
 * @Description:
 */

public class HungrySIngleton {
    public final static HungrySIngleton hu = new HungrySIngleton();

    private HungrySIngleton() {

    }

    public static HungrySIngleton getInstance() {
        return hu;
    }
}
