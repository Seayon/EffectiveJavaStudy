/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.seayon.chapter02.item1;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.HashMap;

@Log4j2
public class CommonTest {

    public static void main(String[] args) {

    }

    @Test
    public void test() {
        Boolean aBoolean = Boolean.valueOf("true");
        Boolean bBoolean = Boolean.valueOf("true");
        log.info(bBoolean == aBoolean);
        log.info("aBoolean={}", aBoolean);
        System.out.println("aBoolean = " + aBoolean);
    }

    //    静态工厂方法与构造器不同的第一大优势在于，他们有名称
    @Test
    public void test2() {
//       比如 Java8 的 LocalDateTime，如果没有后面的 now() 方法和名称，会比较难以确定新建的方法就代表当前时间
        LocalDateTime now = LocalDateTime.now();

    }
}
