package com.seayon.javabase.chapter06.innterClass;

import com.seayon.chapter02.item2.Person;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter06.innterClass
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/4/1 3:22 下午
 * @Version V1.0
 * @Description:
 */

public class Talking$Clock {
    private int interval;

    private boolean beep;

    public static final String A = "";

    public Talking$Clock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        class MyClass {

        }
        ActionListener listener = new TimePrinter();
        Timer timer = new Timer(interval, listener);
        timer.start();

    }

    public class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("当前时间是" + new Date());
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
     /*   Talking$Clock talkingClock = new Talking$Clock(1000, true);
        talkingClock.start();
        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);*/

        int[] counter = new int[1];

        Date[] dates = new Date[100];
        for (int i = 0; i < dates.length; i++) {
            Thread.sleep(new Random().nextInt(10));
            dates[i] = new Date() {
                @Override
                public int compareTo(Date anotherDate) {
                    counter[0] ++;
                    return super.compareTo(anotherDate);
                }
            };
        }

        Arrays.sort(dates);
        System.out.println("counter = " + Arrays.toString(counter));

    }

    @Test
    public void testAnomouns(){
        Person person = new Person(){
            @Override
            public String getName() {
                return "12()";
            }
        };
        System.out.println(person.getName());
    }

}
