package com.springboot.coffee;

import com.springboot.member.NotSpace;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Pattern;

public class CoffeePatchDto {


    private long coffeeId;
    @Pattern(regexp="^([가-힣])(\\s?[가-힣])*$")
    private String korName;
    @Pattern(regexp="^([a-zA-z])(\\s?[a-zA-z])*$")
    private String engName;

    @NotZero(min=100,max=50000)
    private Integer price;

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public Integer getPrice() {
        return price;
    }
}
