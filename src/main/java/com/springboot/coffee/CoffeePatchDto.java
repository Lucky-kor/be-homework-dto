package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePatchDto {


    private Long coffeeId;


    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$", message = "이름은 공백이 허용되지 않고 아니어야 합니다.")
    private String korName;


    @Pattern(regexp = "^([a-zA-Z]+)(\\s?[a-zA-Z])*$", message = "영문 이름 사이에 하나의 공백만 허용됩니다.")
    private String engName;

    @Min(value = 100, message = "최소금액은 100 이상이어야 합니다.")
    @Max(value = 50000, message = "최대금액은 50000 이하이어야 합니다.")
    private Integer price;
}
