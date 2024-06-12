package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.springframework.lang.Nullable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Getter
@Setter
public class CoffeePatchDto {
    @Positive(message = "커피 ID는 양수여야 합니다.")
    private Long coffeeId;

    @NotSpace(message = "한글 커피명은 공백이 아니어야 합니다")
    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$")
    private String korName;

    @NotSpace(message = "영문 커피명은 공백이 아니어야 합니다")
    @Pattern(regexp = "^([a-zA-z])(\\s?[a-zA-z])*$")
    private String engName;

    @Range(min = 100, max = 50000)
    private Integer price;

    public void setCoffeeId(long coffeeId){
        this.coffeeId = coffeeId;
    }

}
