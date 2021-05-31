package com.seayon.designpattern.start.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static Map<String, Strategy> stringStrategyMap = new HashMap<>();

    static {
        stringStrategyMap.put("A", new ConcreteStrategyA());
        stringStrategyMap.put("B", new ConcreteStrategyB());
    }

    public Strategy getStrategy(String key) {
        return stringStrategyMap.get(key);
    }
}
