package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePostDto {
    @Pattern(regexp = "^[가-힣]+(?:\\s+[가-힣]+)*$", message = "한글만 입력 가능합니다. 또한 문장 앞뒤에 공백도 포함되었는지 확인하세요.")
    @NotBlank
    private String korName;

    @Pattern(regexp = "^[a-zA-Z]+(?:\\s+[a-zA-Z]+)*$", message = "영어만 입력 가능합니다.")
    @NotBlank
    private String engName;

    @Min(value = 100, message = "100미만의 값은 안되요.")
    @Max(value = 50000, message = "50000초과의 값은 안되요.")
    private int price;
}
