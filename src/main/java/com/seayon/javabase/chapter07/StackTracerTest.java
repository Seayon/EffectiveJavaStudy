package com.seayon.javabase.chapter07;

import java.util.Scanner;
import java.util.logging.Logger;

public class StackTracerTest {
    public static int factorial(int n) {
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTracerTests = throwable.getStackTrace();
        for (StackTraceElement stackTracerTest : stackTracerTests) {
            System.out.println(stackTracerTest);
        }
        int r ;
        if (n <= 1) {
            r = 1;
        } else {
            r = n * factorial(n - 1);
        }
        System.out.println("return" + r);
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字");
        factorial(scanner.nextInt());
        Logger.getGlobal().info("数字");

    }
}
