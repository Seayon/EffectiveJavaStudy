/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.seayon.chapter02.item5;

import org.junit.Test;

import java.util.Arrays;

public class Cu {

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

        System.out.println("end - start = " + (end - start) + " ms");
        String[] a = new String[]{"2"};
        String[] clone = a.clone();
        a[0]="1";
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(clone));

    }
}
