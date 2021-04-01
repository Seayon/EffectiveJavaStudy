package com.seayon.javabase.chapter06;

import com.seayon.javabase.chapter03.Employee;
import org.junit.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    @Test
    public void t() {
        Comparator comparator = new LengthComparator();

        int compare = comparator.compare("s1", "s2");
        assertThat(compare, equalTo(0));
        assertThat(comparator.compare("s11", "s2"), equalTo(1));
        assertThat(comparator.compare("s11", "s222"), equalTo(-1));

        assertThat(comparator.compare("s11", "s2222"), equalTo(-2));

        BiFunction<String, String, Integer> biFunction = (first, second) -> first.length() - second.length();


        Arrays.sort(new String[]{"123", "1", "3"}, String::compareTo);
        ArrayList<Employee> objects = new ArrayList<>();
        // Arrays.sort(objects,Comparator.comparing(Employee::getName).thenComparing().thenComparing());

        // Arrays.sort(new String[]{"123", "1", "3",(String first,String second)->{
        //     return first.length() - second.length();
        // }
        // }
        Comparator<String> myComparator =
                (String first, String second) -> first.length() - second.length();
        Comparator<String> comparatorIgnoreType =
                (first, second) -> first.length() - second.length();

        ActionListener actionListener = (event) -> {
            System.out.println(event.getWhen());
        };
        ActionListener actionListener2 = (ActionEvent event) -> {
            System.out.println(event.getWhen());
        };

        ActionListener actionListenerIgnore = event ->{
            System.out.println(event.getWhen());
        };
    }
}
