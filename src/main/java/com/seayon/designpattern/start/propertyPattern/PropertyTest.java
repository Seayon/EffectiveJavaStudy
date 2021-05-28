package com.seayon.designpattern.start.propertyPattern;

import com.seayon.designpattern.start.singlePattern.DLCSingleton;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PropertyTest {
    public static void main(String[] args) throws CloneNotSupportedException {
//        使用 clone 完成的原型模式
        Realizetype realizetype1 = new Realizetype();
        Realizetype realizetype2 = realizetype1.clone();
        assertThat(realizetype1 == realizetype2, equalTo(false));
        System.out.println(realizetype1);
        System.out.println(realizetype2);

//        克隆会破坏单例对象吗?
//        答案是会,那么我们在 clone 方法里直接返回 instance,或者禁止 cloneable 方法进行
        DLCSingleton instanceWithClassLock = DLCSingleton.getInstanceWithClassLock();
        DLCSingleton clone = instanceWithClassLock.clone();
        System.out.println(instanceWithClassLock);
        System.out.println(clone);
        assertThat(instanceWithClassLock==clone,equalTo(true));
    }
}
