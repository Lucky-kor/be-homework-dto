package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePatchDto{
    private long coffeeId;

    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$")
    private String korName;

    @Pattern(regexp = "^([a-zA-z])(\\s?[a-zA-z])*$")
    private String engName;

    @Min(value = 100,message = " 100 이상")
    @Max(value = 5000,message = " 5000 이하")
    private int price;
}
