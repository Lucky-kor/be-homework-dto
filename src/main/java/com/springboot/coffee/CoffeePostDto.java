package com.springboot.coffee;

import javax.validation.constraints.*;

public class CoffeePostDto {
    @NotBlank
    private String korName;
    @Pattern(regexp = "^[a-zA-Z]+(\\s?[a-zA-Z]+)*$", message = "커피 이름은 공백이 아니어야 합니다.")
    @NotBlank
    private String engName;

    @Min(value=1000)
    @Max(value=50000)
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
}
