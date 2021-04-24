package com.vfa.carfactory.producestrategy;

import com.vfa.carfactory.common.constraint.ProduceMessageConstraint;
import com.vfa.carfactory.producestrategy.interfaces.Car;


public class Sedan implements Car {

    @Override
    public String getType() {
        return ProduceMessageConstraint.SEDAN_PRODUCE;
    }
}
