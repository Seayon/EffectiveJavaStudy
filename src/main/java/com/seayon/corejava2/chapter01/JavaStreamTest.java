package com.seayon.corejava2.chapter01;

import com.seayon.chapter02.item2.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamTest {
    /**
     * 流的产生
     */
    public static List<String> TXT = null;

    static {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get(JavaStreamTest.class.getClassLoader().getResource("two tale.txt").toURI()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String string = new String(bytes, StandardCharsets.UTF_8);
        TXT = Arrays.asList(string);

    }


    @Test
    public void test() {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource("two tale.txt").toURI()));
            String string = new String(bytes, StandardCharsets.UTF_8);
            List<String> list = Arrays.asList(string);
            list.forEach(System.out::println);

            long count = list.stream().filter(w -> {
                return w.length() > 3;
            }).count();
            System.out.println("count = " + count);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        /**
         * 从数组创建
         */
        Stream<String> ob = Stream.of("ob", "12");
        Stream<Object> ob1 = Stream.of("ob", 1, new Person());

        /**
         * 包括第一个不包括最后一个
         */
        IntStream stream = Arrays.stream(new int[]{0, 1, 2, 3, 4}, 2, 4);
        stream.forEach(value -> {
            System.out.print(" " + value);
        });

        /**
         * 创建不包括任务元素的流
         */
        Stream<Object> empty = Stream.empty();

        /**
         * 无限流的创建
         */

        Stream<Double> generate = Stream.generate(() -> {
            return Math.random();
        });

        generate.filter(a -> {
            return a > 0.5;
        }).skip(100).limit(100).forEach(System.out::print);

        /**
         * 得到有规律的无限流的序列
         */
        System.out.println("\"123\" = " + "123");
        Stream.iterate(BigInteger.ZERO, bigInteger -> {
            return bigInteger.add(BigInteger.TEN);
        }).limit(100).forEach(bigInteger -> {
            System.out.print("," + bigInteger.toString());
        });

    }

    /**
     * 流的处理
     */
    @Test
    public void testHandl() {
        Stream<String> stringStream = TXT.stream().filter(a -> a.length() > 10);
        TXT.stream().map(w -> w.toUpperCase());

        Stream<String> abc = letters("abc");
        abc.forEach(System.out::print);

        String collect = TXT.stream().flatMap(w -> letters(w)).collect(Collectors.joining());
        System.out.println("collect = " + collect);
    }

    @Test
    public void testFlatMap() {
        List<String> collect = Stream.generate(() -> {
            Random random = new Random();
            int i = random.nextInt(1000);
            return String.valueOf(i);
        }).limit(10).collect(Collectors.toList());
        List<String[]> mapResult = collect.stream().map(w -> {
            String[] split = w.split("");
            return split;
        }).collect(Collectors.toList());
        System.out.println("mapResult = " + mapResult);
        List<String> collect1 = collect.stream().flatMap(w -> Stream.of(w.split(""))).collect(Collectors.toList());

        System.out.println("collect = " + collect);
    }


    public Stream<String> letters(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.substring(i, i + 1));
        }
        return result.stream();
    }

    @Test
    public void testConcat() {
        Stream<String> concat = Stream.concat(
                Stream.of("4", "1", "2"),
                Stream.of("7", "3", "5"));


    }

    @Data
    @AllArgsConstructor
    class Product {
        private Integer id;
        private String name;

        // @Override
        // public int compareTo(@NotNull JavaStreamTest.Product o) {
        //     return this.getId().compareTo(o.getId());
        // }
    }

    @Test
    public void testDistinct() {
        List<Product> products = new ArrayList<Product>() {{
            add(new Product(2, "牛排 2"));
            add(new Product(4, "牛排 4"));
            add(new Product(3, "牛排 3"));
            add(new Product(1, "牛排 1"));
            add(new Product(1, "牛排 1"));
            add(new Product(2, "牛排 2"));
        }};

        products.stream().unordered().filter(distinctByKey(b -> b.getId())).collect(Collectors.toList()).forEach(System.out::print);
    }

    static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> set = new ConcurrentSkipListSet<>();
        return t -> set.add(keyExtractor.apply(t));

    }

    /**
     * 流的 sort 方法
     */

    @Test
    public void testSort() {
        Stream<String> concat = Stream.concat(
                Stream.of("4", "1", "2"),
                Stream.of("7", "3", "5"));

        Stream<String> sorted = concat.sorted();
        System.out.println("sorted.collect(Collectors.joining(\",\")) = " + sorted.collect(Collectors.joining(",")));

        List<Product> products = new ArrayList<Product>() {{
            add(new Product(2, "牛排 22"));
            add(new Product(4, "牛排 4"));
            add(new Product(3, "牛排 3"));
            add(new Product(1, "牛排 1"));
            add(new Product(1, "牛排 1"));
            add(new Product(3, "牛排 29"));
        }};
        //连续多个比较的时候,语法上第一个比较里面 必须指定类型 (Product product)
        products.stream().sorted(Comparator.comparing(
                (Product product) -> product.name)
                .thenComparing(Product::getId))
                .forEach(System.out::println);


    }

    @Test
    public void testPeek(){
        List<Product> products = new ArrayList<Product>() {{
            add(new Product(2, "牛排 22"));
            add(new Product(4, "牛排 4"));
            add(new Product(3, "牛排 3"));
            add(new Product(1, "牛排 1"));
            add(new Product(1, "牛排 1"));
            add(new Product(3, "牛排 29"));
        }};
        Stream<Product> peek = products.stream().peek(product -> {
            System.out.println("product.getName() = " + product.getName());
        });
        //这一句执行的时候才打印
        peek.count();

    }

    /**
     * 测试 Optional
     */
    @Test
    public void testMaxAnd(){
        List<Product> products = new ArrayList<Product>() {{
            add(new Product(2, "牛排 22"));
            add(new Product(4, "牛排 4"));
            add(new Product(3, "牛排 3"));
            add(new Product(1, "牛排 1"));
            add(new Product(1, "牛排 1"));
            add(new Product(3, "牛排 29"));
        }};
        Stream<Product> peek = products.stream().peek(product -> {
            System.out.println("product.getName() = " + product.getName());
        });

        Optional<Product> max = peek.max(Comparator.comparing((Product::getName)));
        Optional<Product> first = products.stream().findFirst();
        System.out.println("max = " + max);
        System.out.println("first = " + first);
        Optional<Product> any = products.parallelStream().filter(product -> product.getName().endsWith("9")).findAny();
        System.out.println("any = " + any);
        boolean b = products.parallelStream().anyMatch(product -> product.getName().endsWith("3"));
        System.out.println("b = " + b);

    }


}

