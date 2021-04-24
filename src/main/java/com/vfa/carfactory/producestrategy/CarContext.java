package com.vfa.carfactory.producestrategy;

import com.vfa.carfactory.exception.error.NullPointerException;
import com.vfa.carfactory.producestrategy.interfaces.Car;

public class CarContext {

    private Car car;

    public CarContext(Car car) {
        this.car = car;
    }

    public String produceCar() {
        if (car == null) {
            throw new NullPointerException();
        }
        return car.getType();
    }
}
