package com.seayon.designpattern.start.singlePattern;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.singlePattern
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/28 5:48 下午
 * @Version V1.0
 * @Description: 双重锁机制来新建
 */

public class DLCSingleton {
    public static DLCSingleton dlcSingleton = null;

    private DLCSingleton() {
    }

    public static DLCSingleton getInstance() {
        if (dlcSingleton == null) {
            synchronized (DLCSingleton.class) {
                dlcSingleton = new DLCSingleton();
            }
        }
        return dlcSingleton;
    }

    public DLCSingleton getDlcSingleton() {
        if (dlcSingleton == null) {
            synchronized (this) {
                if (dlcSingleton == null) {
                    dlcSingleton = new DLCSingleton();
                }
            }
        }
        return dlcSingleton;
    }
}
