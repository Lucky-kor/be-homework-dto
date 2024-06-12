package com.springboot.coffee;

import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CoffeePatchDto {
    @Setter
    private long coffeeId;
    @Pattern(regexp = "^([가-힣])+(\\s?[가-힝])*$",message = "커피의 한글 이름은 한글로 입력되어야 하고 워드 사이에 한 칸의 공백(스페이스)만 포함될 수 있습니다.")
    private String korName;
    @Pattern(regexp = "^([a-zA-Z])+(\\s?[a-zA-Z])*$",message = "커피의 영어 이름은 영어로 입력되어야 하고 워드 사이에 한 칸의 공백(스페이스)만 포함될 수 있습니다.")
    private String engName;
    @Min(value = 100,message = "가격은 100 이상이여야 합니다.")
    @Max(value = 50000,message = "가격은 50000 이하여야 합니다.")
    //@Range(min = 100, max = 50000)도 사용가능
    private Integer price;
    public long getcoffeeId() {
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
