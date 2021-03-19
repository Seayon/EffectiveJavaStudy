package com.seayon.javabase.chapter03;


import org.junit.Test;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter03
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/3/19 3:05 下午
 * @Version V1.0
 * @Description:
 */

public class InputAndOutput {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("s = " + s);

        String next = scanner.next();
        String next1 = scanner.next();
        System.out.println("next = " + next);
        System.out.println("next = " + next1);
        */
        // Console console = System.console();
        // String username = console.readLine("username:");
        // char[] passsword = console.readPassword("username:");
        // System.out.println("username = " + username);
        // System.out.println("username = " + passsword.toString());
        try {
            Scanner scanner = new Scanner(Paths.get("/Users/seayon/IdeaProjects/EffectiveJavaStudy/src/main/java/com/seayon/javabase/chapter03/m.txt"), "UTF-8");
            String s = scanner.nextLine();

            while (s != null) {
                if (scanner.nextLine() != null) {

                }
                s = scanner.nextLine();
                System.out.println("s = " + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPrinteWriter() throws IOException {
        PrintWriter printWriter = new PrintWriter("p.txt");
        FileWriter fileWriter = new FileWriter("1.txt", true);
        fileWriter.write("1");
        fileWriter.flush();
        fileWriter.write("12");
        fileWriter.flush();
        fileWriter.close();
        printWriter.write("Hello");
        printWriter.flush();
        printWriter.write("\r\n World");
        printWriter.close();

    }

}
