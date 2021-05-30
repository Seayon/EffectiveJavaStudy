package com.seayon.designpattern.start.adapter;

public class ElectricAdapter implements Motor{

    private ElectricMotor electricMotor = new ElectricMotor();

    @Override
    public void driver() {
        electricMotor.electricDriver();
    }
}
