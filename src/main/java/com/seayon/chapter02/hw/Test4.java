package com.seayon.chapter02.hw;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String[] split = s1.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            stringBuilder.append(split[i]);
        }
        s1 = stringBuilder.toString();
        String s2 = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            int j = s1.indexOf(s2, i);
            if (j > -1) {
                i = j;
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
