package com.seayon.javabase.chapter03;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter03
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/3/19 12:50 下午
 * @Version V1.0
 * @Description:
 */

public class StringEquals {
    @Test
    public void testEquals() {
        String greeting = "Hello";
        for (int i = 0; i < 100; i++) {
            System.out.println("greeting == \"Hello\" = " + greeting == "Hello");
        }

        assertThat(greeting.substring(0, 3) == "Hel", equalTo(false));
    }

    @Test
    public void testEmptyStr() {
        String t = "";
        assertThat(t.length(), equalTo(0));// t length is 0 True
        assertThat(t, equalTo(""));// t is "" True
        assertThat(t, notNullValue());//t not null
    }

    public static final String GREETING = "Hello𝕆";

    @Test
    public void testPointUnit() {
        String greeting = "Hello𝕆赵旭阳";
        int length = greeting.length();
        assertThat(length, equalTo(10));
        //    码点数量
        int i = greeting.codePointCount(0, greeting.length());
        assertThat(i, equalTo(9));
        //得到第 i 个码点
        //先得到总长度
        for (int k = 0; k < greeting.codePointCount(0, greeting.length()); k++) {
            int i1 = greeting.offsetByCodePoints(0, k);
            int t = greeting.codePointAt(i1);
            System.out.print(i1);
            System.out.println("t = " + Integer.toHexString(t));
        }

        /*for (int j = 0; j < greeting.length(); j++) {
            char c = greeting.charAt(j);
            int i1 = greeting.offsetByCodePoints(0, j);
            int b = greeting.codePointAt(i1);
            System.out.println("c = " + c + ",b=" + Integer.toHexString(b));
        }*/
    }

    @Test
    public void testCompare(){
        assertThat("A".compareTo("B"), equalTo(-1));
        assertThat("B".compareTo("A"), equalTo(1));
        assertThat("B".compareTo("B"), equalTo(0));
        assertThat("AB".compareTo("BA"), equalTo(-1));
        assertThat("AAA".compareTo("AAA1"), equalTo(-1));
    }

    @Test
    public void testNew(){
        String s = new String(GREETING.toCharArray(), 5, 2);
        System.out.println("s = " + s);
        assertThat(s,equalTo("𝕆"));
        boolean matches = "a".matches("\\w");
        assertThat(matches,equalTo(Boolean.TRUE));
    }
}
