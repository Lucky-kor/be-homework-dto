package com.springboot.coffee;

import lombok.Getter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
public class CoffeePostDto {

    @NotBlank //null, "", " ", "   "  -> false(null 허용X)
    @Pattern(regexp = "^[가-힣]+$", message = "한글명은 한글을 입력해야 합니다.(띄어쓰기 허용X)")
    private String korName;

    @NotBlank
    @Pattern(regexp = "^([a-zA-Z])(\\s?[a-zA-Z])*$", message = "영문명은 워드 사이에 한 칸의 공백만 포함될 수 있습니다.")
    private String engName;

    @NotZero(min = 100, max = 50000)
    private int price;
}
