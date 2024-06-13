package com.springboot.coffee;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Setter
@Getter
public class CoffeePostDto {
    @NotBlank
    private String korName;
    @NotBlank
    @Pattern(regexp="^([a-zA-z])(\\s?[a-zA-z])*$")
    private String engName;

    @Range(min = 100, max=50000)
    private int price;
}
