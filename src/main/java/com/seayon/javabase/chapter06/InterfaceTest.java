package com.seayon.javabase.chapter06;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter06
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/4/1 10:01 上午
 * @Version V1.0
 * @Description:
 */

public class InterfaceTest {

    class TimePrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone,the time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public static void main(String[] args) {
        ActionListener actionListener = new InterfaceTest().new TimePrinter();

        Timer t = new Timer(10000, actionListener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}
