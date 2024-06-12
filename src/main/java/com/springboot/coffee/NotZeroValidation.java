package com.springboot.coffee;

import com.springboot.member.NotSpace;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotZeroValidation implements ConstraintValidator<NotZero, Integer> {

    private int min;
    private int max;
    @Override
    public void initialize(NotZero constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        if(integer == 0) {
            return true;
        } else if(integer < min || max < integer) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(min + " ~ " + max + " 사이의 값을 입력하시오.")
                    .addConstraintViolation();
            return false;
        } else return false;
    }
}
