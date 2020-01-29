package com.seayon.chapter02.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] sudoKu = new int[9][9];

        int i = 1;
        while (scanner.hasNext() && i > 9) {
            String[] s = scanner.next().split(" ");
            for (int j = 0; j < s.length; j++) {
                sudoKu[i][j] = Integer.valueOf(s[j]);
            }
            i++;
        }
        scanner.close();

        for (int x = 0; x < sudoKu.length; x++) {
            for (int y = 0; y < sudoKu[x].length; y++) {
                int v = sudoKu[x][y];
//                如果等于 0 说明需要填充，将这一行这一列的数字都检查一遍哪些已经被用了，然后插入一个没有用过的试试
                if (v == 0) {
//                    List<Integer> number = ;

                }
            }
        }
        System.out.println("sudoKu = " + sudoKu);
    }
}
