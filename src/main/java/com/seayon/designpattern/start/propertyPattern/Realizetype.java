package com.seayon.designpattern.start.propertyPattern;

public class Realizetype implements Cloneable{
    Realizetype() {
        System.out.println(this + ":创建成功");
    }

    public Realizetype clone() throws CloneNotSupportedException{

        Object clone = super.clone();
        System.out.println(clone + ":复制成功");
        return (Realizetype) clone;
    }

}
