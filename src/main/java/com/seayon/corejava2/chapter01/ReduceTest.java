package com.seayon.corejava2.chapter01;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.corejava2.chapter01
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/20 6:07 下午
 * @Version V1.0
 * @Description:
 */

public class ReduceTest {
    @Test
    public void testTest(){
        List<Integer> values = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        Optional<Integer> reduce = values.stream().reduce((x, y) -> x + y);
        Optional<Integer> reduce2 = values.stream().reduce(Integer::sum);
        Integer reduce1 = values.stream().reduce(0, Integer::sum);
        Integer integer = reduce.get();
        System.out.println(integer);
        assertThat(reduce2, equalTo(reduce));



    }

    @Test
    public void testStringWords(){
        List<String> values = new ArrayList<String>() {{
            add("Saeyon");
            add("aYang");
            add("Hello");
            add("World");
        }};
        values.stream().reduce(0, (total, word) -> total + word.length(), (t1, t2) -> t1 + t2);


    }
}
