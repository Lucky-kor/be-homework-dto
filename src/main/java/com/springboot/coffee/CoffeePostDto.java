package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
class CoffeePostDto {
    @NotNull(message = "한글 커피명은 필수 항목입니다.")
    @NotBlank(message = "한글 커피명은 공백만으로 구성될 수 없습니다.")
    private String korName;

    @NotNull(message = "영문 커피명은 필수 항목입니다.")
    @NotBlank(message = "영문 커피명은 공백만으로 구성될 수 없습니다.")
    @Pattern(regexp = "^[A-Za-z]+( [A-Za-z]+)*$", message = "영문 커피명을 올바른 형식으로 입력해야 합니다.")
    private String engName;

    @Min(value = 100, message = "가격은 100 이상이어야 합니다.")
    @Max(value = 50000, message = "가격은 50000 이하여야 합니다.")
    private int price;
}
