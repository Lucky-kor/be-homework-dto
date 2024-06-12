package com.springboot.coffee.dto;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePostDto {
    @NotSpace(message = "공백이 아니여야합니다")
    private String korName;

    @NotSpace(message = "공백이 아니여야합니다")
    @Pattern(regexp = "^[a-zA-Z]+(\\s?[a-zA-Z]+)*$", message = "이름은 영문이고 중간에 공백 1개를 초과할 수 없습니다.")
    private String engName;

    @Min(value = 100)
    @Max(value = 50000)
    private Integer price;
}
