package com.seayon.designpattern.start.adapter;

public class AdapterTest {
    public static void main(String[] args) throws Exception {
        Motor motor = new ElectricAdapter();
        motor.driver();

        Motor optical = new OpticalAdapter();
        optical.driver();

        Class<?> aClass = Class.forName("com.seayon.designpattern.start.adapter.ElectricAdapter");
        Motor motor1 = (Motor) aClass.newInstance();
        motor1.driver();

    }
}
