package com.seayon.designpattern.start.singlePattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class SingletTestForReflect {
    public static void main(String[] args) {

        DLCSingleton instanceWithClassLock = DLCSingleton.getInstanceWithClassLock();
        System.out.println("instanceWithClassLock = " + instanceWithClassLock);

        Class<?> aClass = null;
        try {
            aClass = Class.forName("com.seayon.designpattern.start.singlePattern.DLCSingleton");
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);

            Field firstCreate = aClass.getDeclaredField("firstCreate");
            firstCreate.setAccessible(true);
            firstCreate.setBoolean(aClass, true);

            Field dlcSingleton = aClass.getDeclaredField("dlcSingleton");
            dlcSingleton.setAccessible(true);
            dlcSingleton.set(aClass, null);

            Object o = declaredConstructor.newInstance(null);
            DLCSingleton o1 = (DLCSingleton) o;
            assert o1 != instanceWithClassLock; //true
            System.out.println(o1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
