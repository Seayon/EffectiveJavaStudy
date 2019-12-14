/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.seayon.chapter02.item2;

import lombok.Builder;
import org.junit.Test;

public class CommonTest {
    @Test
    public void test() {
        Person.PersonBuilder seayon1 = Person.builder("Seayon");
        System.out.println("seayon1 = " + seayon1);
        Person seayon = seayon1.build();

        System.out.println("seayon = " + seayon);
    }

}
