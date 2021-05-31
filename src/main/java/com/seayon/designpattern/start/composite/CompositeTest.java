package com.seayon.designpattern.start.composite;

public class CompositeTest {
    public static void main(String[] args) {

//        组合模式有点类似于,递归和二叉树,每个对象可以包含自身类型一样的对象,包含公共的方法,可以无限的任意的组合
        Component component1 = new Composite();
        Component component2 = new Composite();


        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");


        component1.add(component2);
        component1.add(leaf1);

        component2.add(leaf2);
        component2.add(leaf3);

        component1.operation();



    }
}
