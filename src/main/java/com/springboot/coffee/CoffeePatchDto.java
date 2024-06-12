package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.security.PrivateKey;


@Getter
public class CoffeePatchDto {
    private long coffeeId;

//    @NotSpace(message = "한글 커피명은 공백이 아니어야 합니다")
    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$", message = "잘못된 한글 명 입니다.")
    private String korName;

//    @Pattern(regexp = "^\\S+(\\s?\\S+)*$", message = "잘못된 영문 커피명입니다.")
    @Pattern(regexp = "^([a-zA-Z])(\\s?[a-zA-Z])*$", message = "잘못된 영문 커피명입니다.")
    private String engName;

    @Range(min = 100, max = 50000, message = "100~50000의 값을 입력해야 합니다.")
    private Integer price;

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }
}
