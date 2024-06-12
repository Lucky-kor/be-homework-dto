package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
//  @Setter // 외부에서 값을 변경할 수 있어서 꼭 필요한 상황에서만 사용하기
public class CoffeePostDto {

    @NotBlank // null, "", " ", "    " - 불가능
    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$")
    private String korName;

    @NotBlank
    @Pattern(regexp = "^([a-zA-Z])(\\s?[a-zA-Z])*$")
    private String engName;

    @Range(min = 100, max = 50000)
    private int price;
}
