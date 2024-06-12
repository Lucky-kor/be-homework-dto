//package com.springboot.coffee;
//
//import org.springframework.util.StringUtils;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//public class NotZeroValidator implements ConstraintValidator<NotZero, String> {
//    private int max;
//    private int min;
//    @Override
//    public void initialize(NotZero constraintAnnotation) {
////        ConstraintValidator.super.initialize(constraintAnnotation);
//        this.min = constraintAnnotation.min();
//        this.max = constraintAnnotation.max();
//    }
//
//    @Override
//    public boolean isValid(Integer value, ConstraintValidatorContext context) {
//        if(value == null || value == 0){
//            return true;
//        }
//        else if{
//            StringUtils.hasText(value);
//        }
//    }
//}
//
