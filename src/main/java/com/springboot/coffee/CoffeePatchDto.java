package com.springboot.coffee;

import com.springboot.member.NotSpace;

import javax.validation.constraints.*;

public class CoffeePatchDto {
    private long coffeeId;
    @NotSpace(message = "커피 이름은 공백이 아니어야 합니다")
    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$") //단 한 글자라도 문자열이 있을떄 비교.NULL만 체크 안함
    private String korName;

    @Pattern(regexp = "^[a-zA-Z](\\s?[a-zA-Z])*$", message = "커피 이름은 공백이 아니어야 합니다.")
    private String engName;

    @IsValidNumber
    private int price;

    public String getKorName() {
        return korName;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
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
