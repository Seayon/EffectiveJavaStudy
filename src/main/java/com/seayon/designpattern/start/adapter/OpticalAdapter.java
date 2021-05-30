package com.seayon.designpattern.start.adapter;

public class OpticalAdapter implements Motor{

    private OpticalMotor opticalMotor = new OpticalMotor();

    @Override
    public void driver() {
        opticalMotor.opticalDriver();
    }
}
