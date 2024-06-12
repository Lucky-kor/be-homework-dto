package com.springboot.coffee;

import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
public class CoffeePostDto {
    @NotBlank
    private String korName;

    @NotBlank
    @Pattern(regexp ="^[A-Za-z]+(\\s[A-Za-z]+)*$", message = "영문만 가능합니다.")
    private String engName;

    @Min(100)
    @Max(50000)
    private int price;

}
