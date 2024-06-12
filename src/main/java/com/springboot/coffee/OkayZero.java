package com.springboot.coffee;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {OkayZeroValidator.class})
public @interface OkayZero {
    String message() default "1000~50000의 값이어야합니다";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}