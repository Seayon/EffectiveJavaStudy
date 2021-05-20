package com.seayon.corejava2.chapter01;

import net.sf.cglib.core.Local;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.corejava2.chapter01
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/5/17 3:52 下午
 * @Version V1.0
 * @Description:
 */

public class ResultCollect {
    @Test
    public void testNormalMethod() {

        List<Product> products = new ArrayList<Product>() {{
            add(new Product(2, "牛排 22"));
            add(new Product(4, "牛排 4"));
            add(new Product(3, "牛排 3"));
            add(new Product(1, "牛排 1"));
            add(new Product(1, "牛排 1"));
            add(new Product(3, "牛排 29"));
        }};

        //迭代
        Iterator<Product> iterator = products.stream().iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
        //有序操作
        products.parallelStream().forEachOrdered(System.out::print);
        System.out.println("\n");
        products.stream().forEach(System.out::print);
        //转换为数组
        Product[] products1 = products.stream().toArray(Product[]::new);
        System.out.println("products1 = " + products1);
        Collectors.toList();
        Collectors.toSet();
        // Collectors.toMap();
        //转换为至指定的集合类型
        TreeSet<Product> collect = products.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println("collect = " + collect);

        //字符串拼接
        String collect1 = products.stream().map(product -> product.getId() + ":" + product.getName()).collect(Collectors.joining(","));

        System.out.println("collect1 = " + collect1);

        // summarizing 可以进行统计,几个维度 count=6, sum=14, min=1, average=2.333333, max=4
        //约简,进行求和
        IntSummaryStatistics collect2 = products.stream().collect(Collectors.summarizingInt(Product::getId));
        System.out.println("collect2 = " + collect2);
        int min = collect2.getMin();

        System.out.println("min = " + min);
        //求平均
        Double avg = products.stream().collect(Collectors.averagingDouble(Product::getId));
        System.out.println("avg = " + avg);
    //    求最大值
        IntSummaryStatistics collect3 = products.stream().collect(Collectors.summarizingInt(Product::getId));
        collect3.getMin();
        BinaryOperator<Product> productBinaryOperator = new BinaryOperator<Product>() {
            @Override
            public Product apply(Product product, Product product2) {
                return product2;
            }
        };
    //    收集到映射表中 1.9
        Map<Integer, Product> collect4 = products.stream().collect(Collectors.toMap(Product::getId, Function.identity(), (p1, p2) -> p2,TreeMap::new));
        Product product = collect4.get(3);
        System.out.println("product = " + product);


    }

    Locale[] availableLocales1 = Locale.getAvailableLocales();

    @Test
    public void testResultCollect2(){

        // Stream<Locale> availableLocales = Stream.of(availableLocales1);
        // availableLocales.forEachOrdered(locale -> {
        //     System.out.println(locale.getDisplayLanguage(Locale.CHINA) + ":" + locale.getDisplayCountry(Locale.CHINESE));
        // });


        Map<String, Set<String>> collect = Arrays.stream(availableLocales1).parallel().collect(
                toMap(Locale::getDisplayCountry, l -> Collections.singleton(l.getDisplayLanguage()), (a, b) -> {
                    Set<String> union = new HashSet<>(a);
                    union.addAll(b);
                    return union;
                }, ConcurrentHashMap::new)
        );

        collect.forEach((a,b)-> System.out.println(a + ":" + b));
        System.out.println("\"\" = " + "");
        Map<String, List<Locale>> collect1 = Arrays.asList(availableLocales1).stream().collect(Collectors.groupingBy(Locale::getDisplayCountry));
        collect1.forEach((a,b)-> System.out.println(a + ":" + b));

        Map<Boolean, List<Locale>> zh = Arrays.asList(availableLocales1).stream().collect(groupingBy(locale ->
                locale.getDisplayCountry().equals("zh")
        ));

    }

    @Test
    public void testGroupingBy(){
        System.out.println("\"\" = " + "");


        Map<String, Set<String>> collect = Arrays.asList(availableLocales1).stream().collect(groupingBy(Locale::getDisplayCountry, mapping(Locale::getDisplayLanguage, toSet())));
        System.out.println("collect = " + collect);
    }
    @Test
    public void testAssertPartitionBy(){
        //    断言函数,分为 true 或者 false

        Map<Boolean, List<Locale>> zh = Arrays.asList(availableLocales1).stream().collect(partitioningBy(l -> l.getDisplayLanguage().equals("zh")));
        List<Locale> locales = zh.get(true);
        System.out.println("locales = " + locales);
    }


// 下游收集器
    @Test
    public void testDownstream(){
        Map<String, Long> collect = Arrays.asList(availableLocales1).stream().collect(groupingByConcurrent(Locale::getDisplayCountry, counting()));
        assertThat(collect.get("美国"), equalTo(2L));
        Integer a = 1;
        int b = 2;
        Stream<Integer> boxed = IntStream.range(1, 100).boxed();


    }

    @Test
    public void testLoss(){
        System.out.println(0.01 + 0.05);
        Stream<Double> stream = Arrays.stream(new Double[]{0.01, 0.05});
        DoubleSummaryStatistics collect = stream.collect(summarizingDouble(Double::doubleValue));
        System.out.println(collect);
        System.out.println(collect.getSum());
    }

}
