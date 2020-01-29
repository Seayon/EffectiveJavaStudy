package com.seayon.chapter02.hw;

import sun.tools.tree.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arrayList.add(i);
            }
            int x = 0;
            while (arrayList.size() > 1) {
                x = (x + 2) % arrayList.size();
                arrayList.remove(x);
            }
            System.out.println(arrayList.get(0));
        }

    }

}
