package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@Setter
@Getter
public class CoffeePostDto {

    @NotBlank
    @Pattern(regexp = "^[가-힣]*$")
    private String korName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+(\\s[a-zA-Z]+)*$", message = "알파벳 대소문자(a~z, A~Z)만 입력 가능합니다.")
    private String engName;

    @Range(min = 100, max = 50000, message = "100~50000")
    private Integer price;

}
