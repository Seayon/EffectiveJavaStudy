package com.seayon.designpattern.start.singlePattern;

import org.junit.Test;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.singlePattern
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/28 2:43 下午
 * @Version V1.0
 * @Description:
 */

public class SingletonTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Thread myThread = new MyThreadDLC();
            myThread.start();
        }
        while (true) {

        }

    }
}
