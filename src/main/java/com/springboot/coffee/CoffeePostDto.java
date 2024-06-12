package com.springboot.coffee;

import lombok.Getter;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Validated
public class CoffeePostDto {

    @NotBlank(message = "한글이름은 공백이 아니어야 합니다.")
    private String korName;

    @NotBlank(message = "영문이름은 공백이 아니어야 합니다.")
    @Pattern(regexp = "^([a-zA-Z])(\\s?[a-zA-Z])*$")
    private String engName;

    @Range(min = 100, max = 50000, message = "100 이상 50000 이하의 숫자만 가능합니다.")
    private int price;
}
