package com.vfa.carfactory.service;


import com.vfa.carfactory.exception.error.InvalidCarTypeException;
import com.vfa.carfactory.exception.error.NullPointerException;
import com.vfa.carfactory.producestrategy.Cabrio;
import com.vfa.carfactory.producestrategy.CarContext;
import com.vfa.carfactory.producestrategy.Hatchback;
import com.vfa.carfactory.producestrategy.Sedan;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import static com.vfa.carfactory.common.constraint.CarTypeConstraint.*;

@Service
public class CarFactoryService {

    public String get(String carType) {
        if (StringUtils.isBlank(carType)) {
            throw new NullPointerException();
        }
        CarContext context;
        switch (carType.toLowerCase()) {
            case CABRIO:
                context = new CarContext(new Cabrio());
                break;
            case HATCHBACK:
                context = new CarContext(new Hatchback());
                break;
            case SEDAN:
                context = new CarContext(new Sedan());
                break;
            default:
                throw new InvalidCarTypeException();
        }
        return context.produceCar();
    }
}
