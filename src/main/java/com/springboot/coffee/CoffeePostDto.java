package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.security.PrivateKey;


@Getter
@Setter
public class CoffeePostDto {
    @NotBlank(message = "한글 커피명은 공백이 아니어야 합니다")
    private String korName;

    @Pattern(regexp = "^\\S+(\\s?\\S+)*$", message = "잘못된 영문 커피명입니다.")
    private String engName;

    @Min(value = 100, message = "100미만의 값은 입력할 수 없습니다.")
    @Max(value = 50000,message = "50000초과의 값은 입력할 수 없습니다.")
    private Integer price;
}
