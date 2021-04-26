package com.seayon.javabase.chapter08;

import java.io.Serializable;
import java.lang.reflect.Parameter;

public class Pair<T> {
    public T first;
    public T second;


    @SafeVarargs
    public static <O extends Comparable & Serializable, T> String getMiddle(String a, O o, T... ts) {

        return null;
    }
}
