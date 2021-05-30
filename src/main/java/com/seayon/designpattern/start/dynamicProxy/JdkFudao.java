package com.seayon.designpattern.start.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkFudao implements InvocationHandler {
    IPerson iPerson;

    public IPerson getiPerson(IPerson target) {
        this.iPerson = target;
        Class<? extends IPerson> aClass = iPerson.getClass();
        return (IPerson) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(iPerson, args);
        after();
        return invoke;
    }

    public void before() {
        System.out.println("调用之前");
    }

    public void after() {
        System.out.println("调用之后");
    }


}

