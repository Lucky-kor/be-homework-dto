package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Pattern;

@Getter
public class CoffeePatchDto {
    @Setter
    private long coffeeId;

    @NotSpace(message = "메뉴이름은 공백이 아니여야 합니다.")
    @Pattern(regexp = "^[가-힣]+$",
            message = "한글만 허용합니다.")
    private String korName;

    @NotSpace(message = "메뉴이름은 공백이 아니여야 합니다.")
    @Pattern(regexp = "^[a-zA-Z]+$",
            message = "영문만 허용합니다.")
    private String engName;

    @Range(min = 100, max = 50000)
    private Integer price;
}