package com.springboot.coffee;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
// 제너릭 안에는 레퍼런스 타입을 받아야 함. 그래서 Integer
public class NotZeroValidator implements ConstraintValidator<NotZero, Integer> {

    private int min;
    private int max;

    @Override
    public void initialize(NotZero constraintAnnotation) {
        // ConstraintValidator.super.initialize(constraintAnnotation);
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null || value == 0) {
            return true;
        } else if (value < min || value > max){
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("가격은" + min + "이상 " + max +"이하여야 합니다.").addConstraintViolation();
            return false;
        } else {
            return true;
        }
    }
}
