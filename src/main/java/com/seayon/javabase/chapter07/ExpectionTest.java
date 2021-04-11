package com.seayon.javabase.chapter07;

import jdk.internal.util.xml.impl.Input;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class ExpectionTest {
    public static void main(String[] args) {
//        int[] a = new int[2];
//        a[3] = 1;

        File file = new File("");
        InputStream inputStream = null;
        try {
            try {
                inputStream = new FileInputStream(file);
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (IOException e) {
            Throwable se = new Exception(e.getMessage());
            se.initCause(e);
            try {
                throw se;
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    @Test
    public void testResut() {
        System.out.println("re(2) = " + re(2));
        System.out.println("re(3) = " + re(3));
    }

    public int re(int n) {
        try {
            return n * n;
        } finally {
            if (n == 2) {
                return 0;
            }
        }
    }

    @Test
    public void testWithResource() {
        try {
            try (Scanner in = new Scanner(new FileInputStream(""), "UTF-8");// 可以写多个资源
                 PrintWriter printWriter = new PrintWriter("out.txt")) {
                while (in.hasNext()) {
                    System.out.println(in.next().toUpperCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //执行完毕会自动调用 close 关闭资源,因为都实现了 Closeable 接口
    }
}


