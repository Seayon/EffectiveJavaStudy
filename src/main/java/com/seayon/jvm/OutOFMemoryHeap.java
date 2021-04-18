package com.seayon.jvm;

import java.util.ArrayList;
import java.util.List;

public class OutOFMemoryHeap {
    public static void main(String[] args) {
        long counter = 0;
        List<Object> list = new ArrayList<>();
        while (true) {
            list.add(new Object());
            System.out.println("counter = " + (++counter));
        }
    }
}
