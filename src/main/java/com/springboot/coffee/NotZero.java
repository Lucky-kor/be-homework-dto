package com.springboot.coffee;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {NotZeroValidator.class})
public @interface NotZero {

    int min() default Integer.MAX_VALUE;
    int max() default Integer.MIN_VALUE;
    String message() default "0 이외의 값이 들어와야 합니다.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
