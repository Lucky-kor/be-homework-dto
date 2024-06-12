package com.springboot.coffee.dto;

import lombok.Getter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Pattern;

@Getter
public class CoffeePatchDto {
    private long coffeeId;
    @Pattern(regexp = "^[가-힣](\\s?[가-힣])*$")
    private String korName;
    @Pattern(regexp = "^[a-zA-Z](\\s?[a-zA-Z])*$", message = "1. 공백으로만 구성 되면 안됩니다." +
            "2. 영문만 입력해야 합니다." +
            "3. 단어 사이에 공백은 한 칸만 포함할수 있습니다.")
    private String engName;
    @Range(min = 100, max = 50000, message = "100이상 50000이하의 숫자만 입력해주세요.")
    private Integer price;

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }
}
