package com.springboot.coffee.dto;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
public class CoffeePostDto {
    @NotBlank(message = "공백으로만 구성 되면 안됩니다.")
    private String korName;
    @Pattern(regexp = "^[a-zA-Z]+(\\s?[a-zA-Z])*$", message = "1. 공백으로만 구성 되면 안됩니다." +
            "2. 영문만 입력해야 합니다." +
            "3. 단어 사이에 공백은 한 칸만 포함할수 있습니다.")
    private String engName;
    @Range(min = 100, max = 50000, message = "100이상 50000이하의 숫자만 입력해주세요.")
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
