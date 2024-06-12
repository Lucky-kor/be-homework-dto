package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePatchDto {
    private long coffeeId;
    //정규표현식은 문자열만 사용가능, null값은 실패안하고 통과시킴
    //단 한글자라도 문자가 있을때만 확인한다,null은 패스
    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$")
    private String korName;

    @Pattern(regexp = "^([a-zA-z])(\\s?[a-zA-z])*$")
    private String engName;

    @Min(value = 100, message = "가격은 100 이상이다.")
    @Max(value = 50000, message = "가격은 50000 이하다.")
    private int price;
}
