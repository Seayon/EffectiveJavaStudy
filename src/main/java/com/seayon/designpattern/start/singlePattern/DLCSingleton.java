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

public class DLCSingleton implements Cloneable{

    public DLCSingleton clone() throws CloneNotSupportedException{
        return dlcSingleton;
    }

    private static volatile DLCSingleton dlcSingleton = null;

    private static volatile Object lock = new Object();

    private DLCSingleton() {
    }

//    锁类的单例模式,饱汉模式
    public static DLCSingleton getInstanceWithClassLock() {
        if (dlcSingleton == null) {
            synchronized (DLCSingleton.class) {
                if (dlcSingleton == null) {
                    dlcSingleton = new DLCSingleton();
                }
            }
        }
        return dlcSingleton;
    }
//  锁对象的单例模式
    public static DLCSingleton getDlcSingletonWithObjectLock() {
        if (dlcSingleton == null) {
            synchronized (lock) {
                if (dlcSingleton == null) {
                    dlcSingleton = new DLCSingleton();
                }
            }
        }
        return dlcSingleton;
    }
}
