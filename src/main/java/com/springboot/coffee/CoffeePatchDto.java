package com.springboot.coffee;

import com.springboot.member.NotSpace;

import javax.validation.constraints.*;

public class CoffeePatchDto {
    private long coffeeId;
    @NotSpace
    private String korName;

    @Pattern(regexp ="^[A-Za-z]+(\\s[A-Za-z]+)*$", message = "영문만 가능합니다.")
    private String engName;

    @Min(100)
    @Max(50000)
    private Integer price;

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public long getCoffeeId() {
        return coffeeId;
    }

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public Integer getPrice() {
        return price;
    }
}
