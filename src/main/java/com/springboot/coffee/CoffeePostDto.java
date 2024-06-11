package com.springboot.coffee;

import javax.validation.constraints.*;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CoffeePostDto {


    @NotSpace(message = "이름은 공백이 아니어야 합니다.")
    @Pattern(regexp = "^[가-힣]*$",
            message = "한글 커피명은 한글만 입력해야 합니다.")
    private String korName; // 공백으로만 구성되지 않아야 함

    @NotSpace(message = "공백으로만 구성되지 않아야 함")
    @Pattern(regexp = "^[a-zA-Z]+(\\s[a-zA-Z]+)*$", message = "영문 커피명은 워드 사이에 한 칸의 공백만 포함해야 하며 영어만 들어와야 합니다.")
    private String engName; // 공백으로만 구성되지 않아야함


    @Max(value = 50000, message = "50000이하의 값이여야함")
    @Min(value = 100, message = "100이상의 값이여야함")
    @NotNull(message = "가격은 공백이 아니어야 합니다.")
    private Integer price;  // 100이상 50000이하의 값이여야함 숫자만 허용함
}
