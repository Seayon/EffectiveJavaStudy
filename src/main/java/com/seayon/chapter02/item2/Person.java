/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.seayon.chapter02.item2;

import lombok.*;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderMethodName = "myBuilder")
public class Person {
    private String name;

    @NonNull
    private String gender;
    private int age;
    private double score;

    public static PersonBuilder builder(String name) {
        return builder().name(name);
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

}
