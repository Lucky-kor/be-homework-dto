package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePostDto {

    @Pattern(regexp = "^\\S+(\\s?\\S+)*$", message = "회원 이름은 공백이 아니어야 합니다.")
    private String korName;

    @Pattern(regexp = "^([a-zA-Z]+)(\\s?[a-zA-Z])*$", message = "영문 이름 사이에 하나의 공백만 허용됩니다.")
    private String engName;

    @Min(value = 100, message = "최소금액은 100 이상이어야 합니다.")
    @Max(value = 50000, message = "최대금액은 50000 이하이어야 합니다.")
    private Integer price;
}
