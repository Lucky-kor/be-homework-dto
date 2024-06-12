package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
//@Setter
public class CoffeePatchDto {

    @Setter
    private long coffeeId;

    //@NotSpace
   // @NotBlank
    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$") // null인 경우 통과
    private String korName;

   // @NotBlank
    @Pattern(regexp = "^[a-zA-Z](\\s?[a-zA-Z])*$")
   // @Pattern(regexp = "^\\[a-zA-z]+(\\s?\\[a-zA-Z]+)*$")
    private String engName;

    @Range(min = 100, max = 50000)
    private Integer price;
}
