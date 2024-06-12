package com.springboot.coffee;

import javax.validation.constraints.*;

public class CoffeePostDto {
    @NotBlank(message = "한글이름은 공백이 아니어야합니다.")
    private String korName;

    @NotBlank(message = "영어이름은 공백이 아니어야합니다.")
    @Pattern(regexp = "^[A-Za-z]+(\\s[A-Za-z]+)?",
            message = "스페이스는 하나만 포함되어야합니다.")
    private String engName;

    @Min(value = 1000, message = "1000원 이상이어야합니다.")
    @Max(value = 50000, message = "50000원 이하여야합니다.")
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
}
