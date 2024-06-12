package com.springboot.coffee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OkayZeroValidator implements ConstraintValidator<OkayZero, Integer> {
    @Override
    public void initialize(OkayZero constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value == 0 || (value <= 50000 && value >= 1000) || value == null;
    }
}
