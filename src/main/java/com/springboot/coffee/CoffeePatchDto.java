package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Pattern;

@Getter
public class CoffeePatchDto {

    private long coffeeId;

    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$", message = "한글명은 한 칸의 공백만 포함될 수 있습니다.") //null 검증X null 통과
    private String korName;

    @Pattern(regexp = "^([a-zA-Z])(\\s?[a-zA-Z]+)*$", message = "영문명은 워드 사이에 한 칸의 공백만 포함될 수 있습니다.")
    private String engName;

    @NotZero(min = 100, max = 50000, message = "100 이상 50000 이하의 숫자만 허용합니다.")
    private int price;

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }
}
