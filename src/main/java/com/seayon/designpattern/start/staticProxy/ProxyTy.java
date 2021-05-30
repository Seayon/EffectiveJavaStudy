package com.seayon.designpattern.start.staticProxy;

public class ProxyTy implements Specialty {

    private WySpecitlTy wySpecitlTy = new WySpecitlTy();

    @Override
    public void display() {
        preRequest();
        System.out.print("美丽的");
        wySpecitlTy.display();
        afterRequest();
    }

    private void preRequest() {
        System.out.println("调用 display 之前");
    }

    private void afterRequest() {
        System.out.println("调用 display 之后");
    }

}
