package com.vfa.carfactory.exception.error;

import com.vfa.carfactory.common.constraint.ErrorMessageConstraint;

public class NullPointerException extends RuntimeException {


    public NullPointerException() {
        super(ErrorMessageConstraint.NULL_POINTER);
    }
}
