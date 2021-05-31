package com.seayon.designpattern.start.chain;

public class ConcreteHandler2 extends Handler{
    @Override
    public void handRequest(String request) {
        if ("two".equals(request)) {
            System.out.println("请求类型 2 由具体处理类 2 来处理 ");
        } else {
            Handler next = this.getNext();
            if (next != null) {
                next.handRequest(request);
            }else{
                System.out.println("没有处理器处理");
            }
        }
    }
}
