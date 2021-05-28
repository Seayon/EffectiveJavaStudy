package com.seayon.designpattern.start.singlePattern;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.designpattern.start.singlePattern
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/28 2:47 下午
 * @Version V1.0
 * @Description:
 */

public class MyThreadDLC extends Thread {

    private DLCSingleton lazySingleton = null;

    @Override
    public void run() {
        DLCSingleton instance = DLCSingleton.getDlcSingletonWithObjectLock();
        this.lazySingleton = instance;
        while (true) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(lazySingleton);
        }
    }

}
