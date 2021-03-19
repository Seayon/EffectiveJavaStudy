/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.seayon.chapter02.item5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.PI;

public class Cu {
    private final String a;

    public Cu() {
        a = null;
    }

    //要优先使用基本类型而不是装箱基本类型，要当心无意识的自动装箱
    @Test
    public void test() {
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        assert end != 0;
        System.out.println("end - start = " + (end - start) + " ms");
        String[] a = new String[]{"2"};
        String[] clone = a.clone();
        a[0] = "1";
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(clone));

    }

    @Test
    public void testEquals() {
        ArrayList<String> list = new ArrayList<String>();
//        boolean result = list.add("String");
//        System.out.println("result = " + result);
        System.out.println("list.add(\"String\") = " + list.add("String"));
        System.out.println("list.contains(\"String\") = " + list.contains("String"));
    }

    @Test
    public void testNan() {
        // double sqrt = Math.sqrt(4);
        // System.out.println(sqrt);
        // double sqrt1 = Math.sqrt(-1);
        // System.out.println(sqrt1);
        // System.out.println(Double.isNaN(sqrt1));
        // System.out.println(a);
        for (int i = 0; i < 9999; i++) {
            // System.out.print((char) ("\\u" + i));
        }
        System.out.println("\u2122");
        System.out.println('\u0000');
    }

    public static final String A = "1";
    public final int b = 1;
    @Test
    public strictfp void  testUnicode() {
        // b = b + 1;
        // System.out.println(b);
        // String a = "\u0002+\u0022";
        // System.out.println(a);

        // \u2000A is a newLine
        System.out.println("He");
        int i = 1, j = 2;
        i = Integer.MAX_VALUE;
        System.out.println(i + j);
        System.out.println("Math.pow(1, 2) = " + Math.pow(1, 2));
        Math.sin(2);
        Math.cos(2);
        Math.exp(2.0);
        Math.log1p(2);
        System.out.println(PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(PI));
        System.out.println("StrictMath.sqrt(StrictMath.PI) = " + StrictMath.sqrt(StrictMath.PI));

        int a = 0101;
        int b = 0102;
        System.out.println(a & b);
        String e = "Java\u2122";
        String l = 1 + "";
    }

}
