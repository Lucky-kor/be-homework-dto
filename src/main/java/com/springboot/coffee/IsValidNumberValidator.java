package com.springboot.coffee;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsValidNumberValidator implements ConstraintValidator<IsValidNumber, Integer> {

    @Override
    public void initialize(IsValidNumber constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        return value == 0 ||( value >= 1000 && value <= 50000) ;
    }


}
