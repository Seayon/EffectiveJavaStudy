package com.seayon.corejava2.chapter01;

import com.seayon.chapter02.item2.Person;
import org.junit.Test;

import java.util.Optional;

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

public class OptionalTest {
    @Test
    public void testNormalMethod() {
        //            约简会得到 Optional 包装的值
        Person person1 = new Person("p1", "1", 20, 100d);
        Person person2 = new Person("p2", "1", 22, 80d);
        Optional<Person> person = Optional.of(person2);

        Person person3 = person.orElse(person1);
        assertThat(person3, equalTo(person2));
        person2 = null;
        Optional<Person> person21 = Optional.ofNullable(person2);

        // person21.get(); //throw new NoSuchElementException("No value present");
        //如果 这个 Optional 为空,那么 person21.get() 会抛出异常 NoSuchElementException("No value present"),个人理解,第一个不建议这么用,尽量 orElse 来获得,然后即便这么用了,也可以清晰的看见哪一行报错了,比原来的 NullPointException 好
        assertThat(person21, equalTo(Optional.empty()));
        person21 = Optional.empty();
        Person person5 = person21.orElseGet(() -> {
            Person person4 = new Person();
            person4.setName("temp");
            return person4;
        });

        assertThat(person5.getName(), equalTo("temp"));
        try {
            person21.orElseThrow(() -> {
                throw new RuntimeException("没有值啊");
            });
        } catch (Throwable runtimeException) {
            assertThat(runtimeException.getMessage(), equalTo("没有值啊"));
        }
        person21 = Optional.of(person1);
        Optional<String> temp2 = person21.map(o -> {
            o.setName("TEMP2");
            return "o";
        });
        person21.get();



    }

    /**
     * 求一个数的倒数,安全的方法
     *
     * @param x
     * @return
     */
    public static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(1 / x);
    }

    /**
     * 安全的求平方根方法
     * @param x
     * @return
     */
    public static Optional<Double> squareRoot(Double x) {
        return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
    }



    @Test
    public void testInverse(){
        //后续再使用的时候就会获得一个 Optional 包含的值，拿到 Optional 包装值的时候,应该习惯性的判空来处理
        Optional<Double> inverse = inverse(1d);
        inverse.orElseThrow(() -> new IllegalArgumentException("输入不能为 0"));

        Optional<Double> inverse2 = inverse(0d);
        try {

            inverse2.<IllegalArgumentException>orElseThrow(() -> new IllegalArgumentException("输入不能为 0"));
        } catch (IllegalArgumentException e) {

        }

        //如果有一个操作不成功,则连接起来都是 Optional.empty()
        //由于开平方的数不能为负数,所以第二个失败
        Optional<Double> aDouble = Optional.of(-4.0).flatMap(OptionalTest::inverse).flatMap(OptionalTest::squareRoot);
        assertThat(aDouble, equalTo(Optional.empty()));
        // 由于求倒数的入参不能为空,所以第一个会失败.
        Optional<Double> cDouble = Optional.of(0.0).flatMap(OptionalTest::inverse).flatMap(OptionalTest::squareRoot);
        assertThat(cDouble, equalTo(Optional.empty()));

        //先进行第一个操作,然后再对该值进行第二个操作
        // 1/4 = 0.25, sqrt(0.25) = 0.5
        Optional<Double> bDouble = Optional.of(4.0).flatMap(OptionalTest::inverse).flatMap(OptionalTest::squareRoot);
        assertThat(bDouble.get(),equalTo(0.5));



    }



    @Test
    public void testNullConcat() {
        Person person = new Person();
        String a = "123=" + "'" + person.getName() + "'";
        System.out.println(a);
    }
}
