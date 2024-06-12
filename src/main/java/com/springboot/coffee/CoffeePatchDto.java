package com.springboot.coffee;

import com.springboot.NullableNotBlank;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePatchDto {
    private long coffeeId;

    //@Pattern(regexp = "^$|.*\\S.*", message = "한글 커피명은 공백만으로 구성될 수 없습니다.")
    @NullableNotBlank(message = "한글 커피명은 공백만으로 구성될 수 없습니다.")
    private String korName;

    //@Pattern(regexp = "^$|.*\\S.*", message = "영문 커피명은 공백만으로 구성될 수 없습니다.")
    @NullableNotBlank(message = "영문 커피명은 공백만으로 구성될 수 없습니다.")
    @Pattern(regexp = "^[A-Za-z]+( [A-Za-z]+)*$", message = "영문 커피명을 올바른 형식으로 입력해야 합니다.")
    private String engName;

    @Min(value = 100, message = "가격은 100 이상이어야 합니다.")
    @Max(value = 50000, message = "가격은 50000 이하여야 합니다.")
    private Integer price;
}
