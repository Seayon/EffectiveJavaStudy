package com.seayon.designpattern.start.chain;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handRequest(String request) {
        if ("one".equals(request)) {
            System.out.println("请求类型 1 由具体处理类 1 来处理 ");
        } else {
            Handler next = this.getNext();
            if (next != null) {
                next.handRequest(request);
            } else {
                System.out.println("没有处理器处理");
            }
        }
    }
}
