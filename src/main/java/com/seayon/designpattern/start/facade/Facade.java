package com.seayon.designpattern.start.facade;

public class Facade {
    private SubSystemc01 subSystemc01 = new SubSystemc01();
    private SubSystemc02 subSystemc02 = new SubSystemc02();
    private SubSystemc03 subSystemc03 = new SubSystemc03();

    public void method(){
        subSystemc01.method();
        subSystemc02.method();
        subSystemc03.method();

    }

}
