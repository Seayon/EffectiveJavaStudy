package com.seayon.javabase.chapter09;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>() {{
            add("1");
            add("2");
            add("3");
            add("4");
            add("5");
        }};
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(" " + next);
        }
        System.out.println("\n");
        ListIterator<String> stringListIterator = list.listIterator(list.size());
//        while (stringListIterator.hasNext()) {
//            String next = stringListIterator.next();
//            System.out.print(" " + next);
//        }
//
        System.out.println("\n");
        while (stringListIterator.hasPrevious()) {
            String previous = stringListIterator.previous();
            if (previous.equals("3")) {
                stringListIterator.set("REPLACE");
            }
            System.out.print(" " + previous);
        }

        System.out.println("\n");
        ListIterator<String> stringListIterator1 = list.listIterator(list.size());
        while (stringListIterator1.hasPrevious()) {
            String previous = stringListIterator1.previous();
            System.out.print(" " + previous);
        }
    }

    @Test
    public void test() {
        List<String> aIter = new LinkedList<String>() {{
            add("Amy");
            add("Cal");
            add("Erica");
        }};

        List<String> bIter = new LinkedList<String>() {{
            add("Bob");
            add("Doug");
            add("Frances");
            add("Gloria");
            // merge the words
        }};
        System.out.println(aIter);
        System.out.println(bIter);
        ListIterator<String> aListIterator = aIter.listIterator();
        Iterator<String> bIterator = bIter.iterator();
        while (bIterator.hasNext()) {
            if (aListIterator.hasNext()) {
                aListIterator.next();
            }
            aListIterator.add(bIterator.next());
        }

        System.out.println(aIter);

        Iterator<String> iterator = bIter.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        System.out.println(bIter);
    }
}
