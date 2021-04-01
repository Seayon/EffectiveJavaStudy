package com.seayon.javabase.chapter06.lambda;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.function.Predicate;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter06.lambda
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/4/1 2:04 下午
 * @Version V1.0
 * @Description:
 */

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mecury", "Venus", "Earth", "Mars", "Jupiter", "Staurn", "Uranus", "Nepture"};
        System.out.println("Arrays.deepToString(planets) = " + Arrays.deepToString(planets));
        System.out.println("排序后的:");
        Arrays.sort(planets, String::compareToIgnoreCase);
        System.out.println("Arrays.deepToString(planets) = " + Arrays.deepToString(planets));
        System.out.println("按照字符串长度排序:");
        System.out.println("Arrays.deepToString(planets) = " + Arrays.deepToString(planets));
        Timer timer = new Timer(1000, e -> {
            System.out.println("The time is " + new Date());
        });
        Timer timer2 = new Timer(1000, System.out::println);

        timer.start();
        JOptionPane.showMessageDialog(null, "退出程序?");
        System.exit(0);
        ArrayList<String> arrayList = new ArrayList<>();

        /*int start = 0;
        ActionListener actionListener = e ->{
            start --;
            System.out.println(start);
        };*/


    }

    @Test
    public void test(){
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.CountDown(1);
        System.out.println("lambdaTest = " + lambdaTest);
    }

    public void CountDown(int a) {
        ActionListener actionListener = e -> {
            System.out.println(this.toString()); //Can't refer to changing i
        };
        new Timer(1000, actionListener).start();
        JOptionPane.showMessageDialog(null, "退出程序?");
        System.exit(0);
    }
}
