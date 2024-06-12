package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePostDto {
    private long coffeeId;
    //@Notnull은 데이터가 없으면 오류가뜸
    @NotBlank(message = "영문 커피명은 공백이 아니다") // null, "", " ", "   " -> False
    @Pattern(regexp = "^([a-zA-z])(\\s?[a-zA-z])*$")

    private String korName;
    //@Notnull은 데이터가 없으면 오류가뜸
    @NotBlank(message = "영문 커피명은 공백이 아니다")
    @Pattern(regexp = "^[a-zA-z])(\\s?[a-zA-z])*$")
    private String engName;

    @Min(value = 100, message = "가격은 100 이상이다.")
    @Max(value = 50000, message = "가격은 50000 이하다.")
    //@Range(min = 100, max = 50000)
    private int price;
}



