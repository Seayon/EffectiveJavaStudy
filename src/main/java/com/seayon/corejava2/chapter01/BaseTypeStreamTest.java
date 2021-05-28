package com.seayon.corejava2.chapter01;

import lombok.extern.log4j.Log4j2;
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
@Log4j2
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

        BigInteger collect = IntStream.range(1, 101).collect(()->BigInteger.ONE,
                (bigInteger, value) -> bigInteger.add(BigInteger.valueOf(value)),
                (bigInteger, value) -> bigInteger.add(value));
        System.out.println(collect);
        LongStream range1 = LongStream.range(0, 10000l);
        Stream<Integer> boxed = IntStream.range(1, 101).boxed();
        boxed.collect(Collectors.toList());
        int[] ints = IntStream.range(1, 101).toArray();

    }

    @Test
    public void testParallel(){

        log.debug("start");
        LongStream range = LongStream.range(1L, 50_0000_0000L);
        log.debug("end");
        log.debug("start");
        Long reduce = range.boxed().unordered().parallel().reduce(0L, (x, y) -> x + y, (t1, t2) -> t1 + t2);
        log.debug("end");
         log.debug("start");
        Long reduce2 = range.boxed().reduce(0L, (x, y) -> x + y, (t1, t2) -> t1 + t2);
        log.debug("end");

    }
}
