package com.seayon.designpattern.start.strategy;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void strategy() {
        System.out.println("具体策略模式 A");
    }
}
