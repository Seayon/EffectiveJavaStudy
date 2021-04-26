package com.seayon.javabase.chapter09;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            String next = stringListIterator.next();
        }
    }
}
