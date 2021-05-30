package com.seayon.designpattern.start.dynamicProxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        JdkFudao jdkFudao = new JdkFudao();
        IPerson iPerson = jdkFudao.getiPerson(new Laoliu());

        iPerson.findTeacher();


    }
}
