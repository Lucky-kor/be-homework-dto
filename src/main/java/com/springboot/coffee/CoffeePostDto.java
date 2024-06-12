package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePostDto {
//    @NotSpace(message = "한글 커피명은 공백이 아니어야 합니다")
    @NotBlank
    private String korName;

//    @NotSpace(message = "영문 커피명은 공백이 아니어야 합니다")
    @NotBlank
    @Pattern(regexp = "^([a-zA-z])(\\s?[a-zA-z])*$")
    private String engName;

//    @Min(100)
//    @Max(50000)
    @Range(min = 100, max = 50000)
    private Integer price;

}