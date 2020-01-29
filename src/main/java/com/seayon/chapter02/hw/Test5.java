package com.seayon.chapter02.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String MN = scanner.nextLine();
        String[] s = MN.split(" ");
        int m = Integer.valueOf(s[0]);
        int n = Integer.valueOf(s[1]);
//        System.out.println("m = " + m);
//        System.out.println("n = " + n);
        int[][] island = new int[m][n];
        int x = 0;
        while (x < m) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                island[x][j] = Integer.valueOf(line[j]);
            }
            x++;
        }
        scanner.close();
//        System.out.println("Arrays.deepToString(a) = " + Arrays.deepToString(a));
        int c = 0;
        while (hasOne(island)) {
            for (int i = 0; i < island.length; i++) {
                for (int j = 0; j < island[i].length; j++) {
                    if (island[i][j] == 1) {
                        c++;
                        island[i][j] = 0;
                        setZero(island, i, j);
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static boolean hasOne(int[][] island) {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                if (island[i][j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[][] setZero(int[][] a, int i, int j) {
//        向右扩散
        if (j + 1 < a[i].length) {
            if (a[i][j + 1] == 1) {
                a[i][j + 1] = 0;
                setZero(a, i, j + 1);
            }
        }
//        向下扩散
        if (i + 1 < a.length) {
            if (a[i + 1][j] == 1) {
                a[i + 1][j] = 0;
                setZero(a, i + 1, j);
            }


        }
        //向上扩散
        if (i - 1 > 0) {
            if (a[i - 1][j] == 1) {
                a[i - 1][j] = 0;
                setZero(a, i - 1, j);
            }
        }

        //向左扩散
        if (j - 1 > 0) {
            if (a[i][j - 1] == 1) {
                a[i][j - 1] = 0;
                setZero(a, i, j - 1);
            }
        }
        return a;
    }
}