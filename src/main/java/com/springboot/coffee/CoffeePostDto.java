package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePostDto {
    private long coffeeId;
    @NotBlank(message = "영어커피이름은 공백아님")
    @Pattern(regexp = "^([a-zA-z])(\\s?[a-zA-z])*$")

    private String korName;
    @NotBlank(message = "영어커피이름은 공백아님")
    @Pattern(regexp = "^([a-zA-z])(\\s?[a-zA-z])*$")

    private String engName;
    @Min(value = 100,message = " 100 이상")
    @Max(value = 6000,message = " 6000 이하")
    private int price;

}
