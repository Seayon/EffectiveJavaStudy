package com.seayon.javabase.chapter06;

import org.junit.Test;

import java.util.Comparator;

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


    }
}
