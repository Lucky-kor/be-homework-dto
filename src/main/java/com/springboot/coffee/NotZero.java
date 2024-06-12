package com.springboot.coffee;

import com.springboot.member.NotSpaceValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {NotSpaceValidator.class})
public @interface NotZero {

    // min과 max 를 정의하지 않을 때에도 동작할 수 있도록 최댓값 ,최솟값을 default로 정의함.
    int min() default Integer.MIN_VALUE;
    int max() default Integer.MAX_VALUE;
    String message() default "0이외의 값이 들어오면 안됩니다";


    // 여기는 고정.
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}