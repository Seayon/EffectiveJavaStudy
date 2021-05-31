package com.seayon.designpattern.start.share;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    public static Map<String, Flyweight> flyweightMap = new HashMap<>();

    public Flyweight flyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + " 已经存在,被成功获取");
        } else {
            flyweight = new ConcreteFlyweight1(key);
            flyweightMap.put(key, flyweight);
        }
        return flyweight;
    }
}
