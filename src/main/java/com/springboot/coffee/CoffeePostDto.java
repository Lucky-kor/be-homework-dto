package com.springboot.coffee;

import com.springboot.member.NotSpace;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CoffeePostDto {

    @NotBlank
    private String korName;

    @NotSpace(message = "메뉴이름은 공백이 아니여야 합니다.")
    @Pattern(regexp = "^([a-zA-Z]+)(\\s?[a-zA-Z])*$",
            message = "영문만 허용합니다.")
    private String engName;

    @Range(min = 100, max = 50000)
    private int price;

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public int getPrice() {
        return price;
    }
}