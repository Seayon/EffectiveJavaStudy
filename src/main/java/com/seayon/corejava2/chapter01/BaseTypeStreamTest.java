package com.seayon.corejava2.chapter01;

import org.junit.Test;

import java.math.BigInteger;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.function.ObjIntConsumer;
import java.util.stream.*;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.corejava2.chapter01
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/20 7:08 下午
 * @Version V1.0
 * @Description: 基本类型流测试
 */

public class BaseTypeStreamTest {

    @Test
    public void testBase() {

        IntStream range = IntStream.range(1, 101);
        IntSummaryStatistics intSummaryStatistics = range.summaryStatistics();
        System.out.println(intSummaryStatistics);
        ObjIntConsumer<BigInteger> accumulator = new ObjIntConsumer<BigInteger>() {
            @Override
            public void accept(BigInteger bigInteger, int value) {
                bigInteger.add(BigInteger.valueOf(value));
            }
        };

        IntStream.range(1, 101).collect(() -> BigInteger.ZERO,
                (bigInteger, value) -> bigInteger.add(BigInteger.valueOf(value)),
                (bigInteger, value) -> bigInteger.add(value));
        LongStream range1 = LongStream.range(0, 10000l);
        Stream<Integer> boxed = IntStream.range(1, 101).boxed();
        boxed.collect(Collectors.toList());
        int[] ints = IntStream.range(1, 101).toArray();

    }
}
