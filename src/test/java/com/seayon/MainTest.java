package com.seayon;


import com.seayon.chapter02.item6.Operation;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainTest {

    @Test
    public void testA() {
        int binaryA = 0b1001;
        binaryA = binaryA >> 1;
        assertThat(binaryA, equalTo(0B0100));

        int binaryB = binaryA & 0b1111;
        assertThat(binaryB,equalTo(0b0100));
        assertThat(binaryB,equalTo(4));

        assertThat(0b001|0b101,equalTo(0b101));
        assertThat(0b001^0b101,equalTo(0b100));
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
    public void test(){
                
    }
}
