package com.vfa.carfactory.exception.error;

import com.vfa.carfactory.common.constraint.ErrorMessageConstraint;

public class InvalidCarTypeException extends RuntimeException {

    public InvalidCarTypeException() {
        super(ErrorMessageConstraint.INVALID_CAR_TYPE);
    }
}
