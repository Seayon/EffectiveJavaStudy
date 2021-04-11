package com.seayon.javabase.chapter06.proxyClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class ProxyTest {
    public static void main(String[] args) {
        Object[] elements = new Object[100];
        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            InvocationHandler invocationHandler = new TraceHandler(value);
            Object o = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, invocationHandler);
            elements[i] = o;
        }

        Integer key = new Random().nextInt(elements.length) + 1;
        int result = Arrays.binarySearch(elements, key);
        if (result >= 0) {
            System.out.println("elements[result] = " + elements[result]);
        }
    }
}
