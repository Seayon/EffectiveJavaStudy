package com.seayon.designpattern.start.singlePattern;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.singlePattern
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/28 2:36 下午
 * @Version V1.0
 * @Description: 单例模式-懒汉模式
 */

public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
            return lazySingleton;
        }
        return lazySingleton;
    }


}
