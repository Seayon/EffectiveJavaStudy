package com.seayon.designpattern.start.share;

public class UnsharedConcreteFlyWeight {
    private String info;

    public UnsharedConcreteFlyWeight(String info) {
        this.info = info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }
}
