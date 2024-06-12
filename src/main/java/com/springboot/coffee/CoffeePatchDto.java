package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;

import lombok.Setter;
import javax.validation.constraints.*;

@Getter
public class CoffeePatchDto {
    @Setter
    private long coffeeId;

    @NotSpace(message = "한글 커피명은 필수 입력이어야 합니다")
    private String korName;

    @Pattern(regexp = "^[A-Za-z]+( [A-Za-z]+)*$", message = "한 칸의 공백(스페이스)과 영어만 포함될 수 있습니다.")
    private String engName;

    @Min(value = 100, message = "1000 이상 입력이어야 합니다")
    @Max(value = 50000, message = "50000 이하 입력이어야 합니다")
    private Integer price;

}

