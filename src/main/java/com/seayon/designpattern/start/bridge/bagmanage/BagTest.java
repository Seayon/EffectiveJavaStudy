package com.seayon.designpattern.start.bridge.bagmanage;

public class BagTest {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.seayon.designpattern.start.bridge.bagmanage.HandBag");
        Bag bag = (Bag) aClass.newInstance();
        Class<?> red = Class.forName("com.seayon.designpattern.start.bridge.bagmanage.Red");
        bag.setColor((Color) red.newInstance());

        System.out.println("bag.getName() = " + bag.getName());
    }
}
