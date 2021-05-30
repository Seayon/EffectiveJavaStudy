package com.seayon.designpattern.start.abstractFactoryMethod;

public class FactoryTest {
    public static void main(String[] args)throws Exception {
//        通过改变这里的工厂类,来实现创建一套的不同的东西
//        String className = "com.seayon.designpattern.start.abstractFactoryMethod.SRFactory";
        String className = "com.seayon.designpattern.start.abstractFactoryMethod.SGRFactory";
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Fram o1 = (Fram) o;
        Animal animel = o1.createAnimel();
        Fruit fruit = o1.createFruit();
        System.out.println(animel.getAnimalName());
        System.out.println(fruit.getFruitName());



    }
}
