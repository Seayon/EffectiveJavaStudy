package com.seayon;


import com.seayon.chapter02.item6.Operation;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.in;

public class MainTest {

    @Test
    public void testA() {
        int binaryA = 0b1001;
        binaryA = binaryA >> 1;
        assertThat(binaryA, equalTo(0B0100));

        int binaryB = binaryA & 0b1111;
        assertThat(binaryB, equalTo(0b0100));
        assertThat(binaryB, equalTo(4));

        assertThat(0b001 | 0b101, equalTo(0b101));
        assertThat(0b001 ^ 0b101, equalTo(0b100));
//        assertThat(~0b101,equalTo(0b010));
        System.out.println(Integer.toBinaryString(~0b101));
        System.out.println(Integer.toBinaryString(-6));
        int a = ~0b101;
        System.out.println(a);
//        二进制
        int bA = 0B1011;
        int bB = 0B1011;
//        八进制
        int eA = 0127;
        int eb = 0126;
//        十进制
        int oA = 1234;
        int oB = 4567;
//        十六进制
        int lA = 0x123;
        int lB = 0x456;

        String all = String.join("/", "1", "2", "3", "4");
        System.out.println("all = " + all);

    }

    @Test
    public void test() {

        List<Set<Integer>> setList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            Set<Integer> integers = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                integers.add(j);
            }
            setList.add(integers);
        }


        List<Integer> integers1 = countList(setList);
        System.out.println(integers1.toString());

    }

    public List<Integer> countList(List<Set<Integer>> setList) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (Set<Integer> integers : setList) {
            for (Integer integer : integers) {
                if (count.containsKey(integer)) {
                    Integer c = count.get(integer);
                    c++;
                    count.put(integer, c);
                } else {
                    count.put(integer, 1);
                }
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = count.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer value = next.getValue();
            if (value > 10) {
                result.add(next.getKey());
            }
        }
        return result;
    }

    @Test
    public void testB() {
//        assertThat(addBefore(2), equalTo(1));// 断言当 n=2 时,返回结果是 1
//        assertThat(addBefore(3), equalTo(1));
//        assertThat(addBefore(4), equalTo(2));
//        assertThat(addBefore(5), equalTo(4));
//        assertThat(addBefore(6), equalTo(7));// 断言当 n=6 时,返回结果是 7
        int i = addBefore(4000);
        System.out.println(i);
    }

    /**
     * 每个数等于前面三个数相加,初始的三个数已经给出,使用递归
     * @param n
     * @return
     */
    public int addBefore(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return addBefore(n - 1) + addBefore(n - 2) + addBefore(n - 3);
        }
    }
}
