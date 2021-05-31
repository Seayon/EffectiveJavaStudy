package com.seayon.designpattern.start.strategy;

public class StrategyTest {
    public static void main(String[] args) {

        StrategyFactory strategyFactory = new StrategyFactory();
        Strategy a = strategyFactory.getStrategy("A");
        Strategy b = strategyFactory.getStrategy("B");
        a.strategy();
        b.strategy();

    }
}
