package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePatchDto {
    private long coffeeId;

    @Pattern(regexp = "^[가-힣]+(?:\\s+[가-힣]+)*$", message = "한글만 입력 가능합니다. 또한 문장 앞뒤에 공백도 포함되었는지 확인하세요.")
    @Pattern(regexp = "^(?!\\s*$).+", message = "빈문자열은 안되요.")
    private String korName;

    @Pattern(regexp = "^[a-zA-Z]+(?:\\s+[a-zA-Z]+)*$", message = "영어만 입력 가능합니다. 또한 문장 앞뒤에 공백도 포함되었는지 확인하세요.")
    @Pattern(regexp = "^(?!\\s*$).+", message = "빈문자열은 안되요.")
    private String engName;

//    @Range(min = 100, max = 50000, message = "100 ~ 50000 사이의 값을 입력하세요.")
    @NotZero(min = 100, max = 50000)
    private int price;
}