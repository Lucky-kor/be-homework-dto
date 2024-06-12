package com.springboot.coffee.dto;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePatchDto {
    private long coffeeId;

    @NotSpace(message = "공백이 아니여야 합니다")
    @Pattern(regexp = "^[가-힣]+(\\s?[가-힣]+)*$")
    private String korName;

    @NotSpace(message = "공백이 아니여야 합니다")
    @Pattern(regexp = "^[a-zA-Z]+(\\s?[a-zA-Z]+)*$", message = "이름은 영문이고 중간에 공백 1개를 초과할 수 없습니다.")
    private String engName;

    @Range(min = 100, max = 50000, message = "100이상 50000이하")
    private Integer price;
}
