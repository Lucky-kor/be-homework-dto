package com.springboot.coffee;

import com.springboot.member.NotSpace;

import javax.validation.constraints.*;

public class CoffeePatchDto {
    private long coffeeId;

    @Pattern(regexp = "^([가-힣])+(\\s?[가-힣]+)*$",
            message = "스페이스는 하나만 포함되어야합니다.")
    private String korName;

    @Pattern(regexp = "^[A-Za-z]+(\\s[A-Za-z]+)?",
            message = "스페이스는 하나만 포함되어야합니다.")
    private String engName;

    //Integer로 바꾸면 초기값이 null이라 range에 걸리지 않아 커스텀으로 하지 않아도 됨!
    //실무에선 Integer을 더 많이 씀
    @OkayZero
    private int price;


    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getKorName() {
        return korName;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }
}
