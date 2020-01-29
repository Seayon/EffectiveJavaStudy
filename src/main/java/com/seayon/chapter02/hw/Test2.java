package com.seayon.chapter02.hw;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String next = scanner.next();
            String[] split = next.split("");
            LinkedHashSet<String> hashSet = new LinkedHashSet<>();
            for (int i = 0; i < split.length; i++) {
                hashSet.add(split[i]);
            }
            Iterator<String> iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next());
            }
            System.out.println();
        }
    }
}
